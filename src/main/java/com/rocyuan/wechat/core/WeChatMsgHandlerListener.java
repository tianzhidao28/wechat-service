package com.rocyuan.wechat.core;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.Subscribe;
import com.rocyuan.wechat.bean.msg.*;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.utils.MongoUtils;

/**
 * 处理微信消息的回复
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMsgHandlerListener {



    @Subscribe
    public void handle(WeChatTextMsg weChatTextMsg) {
        System.out.println(weChatTextMsg);
        System.out.println(JSON.toJSONString(weChatTextMsg));
        WeChatApi.sendTextMsg(weChatTextMsg.getFromUser(),"hello123XXX");
    }

    @Subscribe
    public void handle(WeChatVideoMsg weChatVideoMsg) {
        System.out.println(weChatVideoMsg);
        System.out.println(JSON.toJSONString(weChatVideoMsg));
        WeChatApi.sendTextMsg(weChatVideoMsg.getFromUser(),"helloXXXXXX");
    }
    @Subscribe
    public void handle(WeChatVoiceMsg weChatVoiceMsg) {
        System.out.println(weChatVoiceMsg);
        System.out.println(JSON.toJSONString(weChatVoiceMsg));
        WeChatApi.sendTextMsg(weChatVoiceMsg.getFromUser(),"hello");
    }
    @Subscribe
    public void handle(WeChatMapMsg weChatMapMsg) {
        System.out.println(weChatMapMsg);
        System.out.println(JSON.toJSONString(weChatMapMsg));
        WeChatApi.sendTextMsg(weChatMapMsg.getFromUser(),"hello");
    }
    @Subscribe
    public void handle(WeChatPicMsg weChatPicMsg) {
        System.out.println(weChatPicMsg);
        System.out.println(JSON.toJSONString(weChatPicMsg));
        WeChatApi.sendTextMsg(weChatPicMsg.getFromUser(),"hello");
    }
    /**
     * 保存数据入库
     * @param weChatMsg
     */
    @Subscribe
    public void storage(WeChatMsg weChatMsg) {
        MongoUtils.save(weChatMsg,"WeChatMsg");
    }

}
