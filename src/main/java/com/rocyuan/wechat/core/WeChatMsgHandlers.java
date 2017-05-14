package com.rocyuan.wechat.core;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.rocyuan.wechat.bean.WeChatContact;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.bean.msg.base.WeChatRespMsg;
import com.rocyuan.wechat.bean.msg.response.WeChatMsgResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by rocyuan on 2017/5/14.
 */
public class WeChatMsgHandlers {

    private static List<WeChatMsgHandler> handlerList = Lists.newArrayList();

    private static Map<Class<? extends WeChatMsgResponse>,WeChatMsgResponse> responseHandleMap = Maps.newHashMap();

    static {
        // 初始化所有handler  --- Listener注解去获取handler

    }

    /**
     * 找到匹配的Handler
     * @param msg
     * @return
     */
    private static WeChatMsgHandler getMatchedWeChatMsgHandler(WeChatMsg msg) {

        List<WeChatMsgHandler> fitHandlers = handlerList.stream().filter(new Predicate<WeChatMsgHandler>() {
            @Override
            public boolean test(WeChatMsgHandler weChatMsgHandler) {

                boolean match = true;
                if (match && StringUtils.isNotBlank(weChatMsgHandler.fromUser)) {
                    match = match && weChatMsgHandler.getFromUser().equalsIgnoreCase(msg.getFromUser());
                }
                WeChatContact weChatContact = WeChatApi.getWeChatContactById(msg.getFromUser());
                if (match && weChatContact == null)
                    return true;

                if (match && StringUtils.isNotBlank(weChatMsgHandler.getCity())) {
                    match = match && weChatContact.getCity().equalsIgnoreCase(weChatMsgHandler.getCity());
                }
                if (match && StringUtils.isNotBlank(weChatMsgHandler.getFromUserNickName())) {
                    match = match && weChatContact.getNickName().equalsIgnoreCase(weChatMsgHandler.getFromUserNickName());
                }
                if (match && StringUtils.isNotBlank(weChatMsgHandler.getFromUserRemarkName())) {
                    match = match && weChatMsgHandler.getFromUserRemarkName().equalsIgnoreCase(weChatContact.getRemarkName());
                }
                if (match && !CollectionUtils.isEmpty(weChatMsgHandler.getMsgType())) {
                    match = match && weChatMsgHandler.getMsgType().contains(msg.getMsgType());
                }
                if (match && weChatMsgHandler.getSex() != null) {
                    match = match && weChatContact.getSex().equals(weChatMsgHandler.getSex());
                }
                return match;
            }
        }).collect(Collectors.toList());

        if (CollectionUtils.isEmpty(fitHandlers)){
            return null;
        } else {
            return fitHandlers.get(0);
        }
    }



    public static void handleMsg(WeChatMsg msg) {

        WeChatMsgHandler weChatMsgHandler = getMatchedWeChatMsgHandler(msg);
        if (weChatMsgHandler != null) {
            WeChatMsgResponse response = responseHandleMap.get(weChatMsgHandler.getHandler());
            if (response == null) {

            }
        }

    }
}
