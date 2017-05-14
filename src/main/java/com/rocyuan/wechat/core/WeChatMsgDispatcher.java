package com.rocyuan.wechat.core;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;

import java.util.concurrent.Executors;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMsgDispatcher {

    private static EventBus dispactcher = new AsyncEventBus(Executors.newCachedThreadPool());
//    private static EventBus dispactcher = new EventBus();

    static {
        dispactcher.register(new WeChatMsgHandlerListener());
    }

    public static void handle(WeChatMsg msg) {
        if (msg != null)
            dispactcher.post(msg);
    }



}
