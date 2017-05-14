package com.rocyuan.wechat.core;

import com.rocyuan.wechat.bean.WeChatContact;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatApi {


    public static void sendTextMsg(String toUser, String text) {

        System.out.println(toUser + text);
    }


    public static void sendTextMsgByNickName(String nickName, String text) {

    }

    public static WeChatContact getWeChatContactById(String userName) {
        return null;
    }
}
