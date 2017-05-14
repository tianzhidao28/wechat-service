package com.rocyuan.wechat.bean.msg.base;

/**
 * Created by rocyuan on 2017/5/13.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rocyuan on 2017/5/11.
 */
public enum MsgType {
    TEXT("Text",1),
    NameCard("NameCard",42),
    PIC("Pic",3),
    VIDEO("VIDEO",43),
    VOICE("Voice",34),
    Map("Map",1,48),
    Money_Transfer("Money_Transfer",49,0,2000),  // 微信转账

    SYSTEM("System",10000),
    SHARE_LINK("Share_Link",49,0,5),
    SHARE_FILE("Share_File",49,0,6),
    SHARE_DISCOUNT("Share_Discount",49,0,16), // 折扣
    SHARE_APP("Share_App",49,0,33)   // 小程序


    ;

    MsgType(String type, int msgType,int subMsgType,int appMsgType) {
        this.type = type;
        this.msgType = msgType;
        this.subMsgType = subMsgType;
        this.appMsgType = appMsgType;
    }

    MsgType(String type, int msgType,int subMsgType) {
        this.type = type;
        this.msgType = msgType;
        this.subMsgType = subMsgType;
        this.appMsgType = 0;
    }

    MsgType(String type, int msgType) {
        this.type = type;
        this.msgType = msgType;
        this.subMsgType = 0;
        this.appMsgType = 0;
    }

    private static final Map<String, MsgType> CODE_MAP = new HashMap<String, MsgType>();

    static {
        for (MsgType typeEnum : MsgType.values()) {
            CODE_MAP.put(typeEnum.msgType+"_"+typeEnum.subMsgType+"_"+typeEnum.appMsgType, typeEnum);
        }
    }


    public static MsgType valueOf(int code, int subCode,int appMsgType) {
        return CODE_MAP.get(code+"_"+subCode+"_"+appMsgType);
    }



    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }


    public int getAppMsgType() {
        return appMsgType;
    }

    int msgType;
    String type;
    int subMsgType;
    int appMsgType;

    public int getMsgType() {
        return msgType;
    }

    public int getSubMsgType() {
        return subMsgType;
    }
}

