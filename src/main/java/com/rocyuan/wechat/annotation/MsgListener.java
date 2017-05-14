package com.rocyuan.wechat.annotation;


import com.rocyuan.wechat.bean.msg.base.MsgType;
import com.rocyuan.wechat.bean.msg.base.Sex;
import com.rocyuan.wechat.bean.msg.response.TulingTextResponse;
import com.rocyuan.wechat.bean.msg.response.WeChatMsgResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 消息监听器
 * Created by rocyuan on 2017/5/11.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD})
public @interface MsgListener {
    /**
     * 消息类型
     * @return
     */
    MsgType[] msgType() default {};

    /**
     * 来自那个微信用户
     * @return
     */
    String fromUser();

    String fromUserNickName();

    String fromUserRemarkName();

    Sex sex();

    String city();

    String[] tags() default {};


    Class<? extends WeChatMsgResponse> handler() default TulingTextResponse.class;


}
