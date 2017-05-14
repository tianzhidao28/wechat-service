package com.rocyuan.wechat.core;

import com.rocyuan.wechat.bean.msg.base.MsgType;
import com.rocyuan.wechat.bean.msg.base.Sex;
import com.rocyuan.wechat.bean.msg.response.TulingTextResponse;
import com.rocyuan.wechat.bean.msg.response.WeChatMsgResponse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rocyuan on 2017/5/14.
 */
public class WeChatMsgHandler {

    /**
     * 消息类型
     * @return
     */
    List<MsgType> msgType;

    /**
     * 来自那个微信用户
     * @return
     */
    String fromUser;

    String fromUserNickName;

    String fromUserRemarkName;

    Sex sex;

    String city;

    Set<String> tags;


    Class<? extends WeChatMsgResponse> handler;


    public List<MsgType> getMsgType() {
        return msgType;
    }

    public void setMsgType(List<MsgType> msgType) {
        this.msgType = msgType;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getFromUserNickName() {
        return fromUserNickName;
    }

    public void setFromUserNickName(String fromUserNickName) {
        this.fromUserNickName = fromUserNickName;
    }

    public String getFromUserRemarkName() {
        return fromUserRemarkName;
    }

    public void setFromUserRemarkName(String fromUserRemarkName) {
        this.fromUserRemarkName = fromUserRemarkName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Class<? extends WeChatMsgResponse> getHandler() {
        return handler;
    }

    public void setHandler(Class<? extends WeChatMsgResponse> handler) {
        this.handler = handler;
    }


    public static final class WeChatMsgHandlerBuilder {
        List<MsgType> msgType;
        String fromUser;
        String fromUserNickName;
        String fromUserRemarkName;
        Sex sex;
        String city;
        Set<String> tags;
        Class<? extends WeChatMsgResponse> handler;

        private WeChatMsgHandlerBuilder() {
            tags = new HashSet<>();
            msgType = new ArrayList<>();

        }

        public static WeChatMsgHandlerBuilder aWeChatMsgHandler() {
            return new WeChatMsgHandlerBuilder();
        }

        public WeChatMsgHandlerBuilder withMsgType(List<MsgType> msgType) {
            this.msgType = msgType;
            return this;
        }

        public WeChatMsgHandlerBuilder withFromUser(String fromUser) {
            this.fromUser = fromUser;
            return this;
        }

        public WeChatMsgHandlerBuilder withFromUserNickName(String fromUserNickName) {
            this.fromUserNickName = fromUserNickName;
            return this;
        }

        public WeChatMsgHandlerBuilder withFromUserRemarkName(String fromUserRemarkName) {
            this.fromUserRemarkName = fromUserRemarkName;
            return this;
        }

        public WeChatMsgHandlerBuilder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public WeChatMsgHandlerBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public WeChatMsgHandlerBuilder withTags(List<String> tags) {
            this.tags = new HashSet<>(tags);
            return this;
        }
        public WeChatMsgHandlerBuilder withTag(String tag) {
            this.tags.add(tag);
            return this;
        }

        public WeChatMsgHandlerBuilder withHandler(Class<? extends WeChatMsgResponse> handler) {
            this.handler = handler;
            return this;
        }

        public WeChatMsgHandler build() {
            WeChatMsgHandler weChatMsgHandler = new WeChatMsgHandler();
            weChatMsgHandler.setMsgType(msgType);
            weChatMsgHandler.setFromUser(fromUser);
            weChatMsgHandler.setFromUserNickName(fromUserNickName);
            weChatMsgHandler.setFromUserRemarkName(fromUserRemarkName);
            weChatMsgHandler.setSex(sex);
            weChatMsgHandler.setCity(city);
            weChatMsgHandler.setTags(tags);
            weChatMsgHandler.setHandler(handler);
            return weChatMsgHandler;
        }
    }
}
