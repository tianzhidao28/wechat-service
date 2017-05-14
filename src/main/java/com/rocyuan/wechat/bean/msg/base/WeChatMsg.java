package com.rocyuan.wechat.bean.msg.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.core.tool.deserialize.MsgTypeDeserializer;
import com.rocyuan.wechat.core.tool.deserialize.WeChatMsgCreateTimeDeserializer;

import java.util.Date;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMsg {
    @JSONField(name = "FromUserName")
    String fromUser;
    @JSONField(name = "ToUserName")
    String toUser;
    @JSONField(name = "CreateTime",deserializeUsing = WeChatMsgCreateTimeDeserializer.class)
    Date createTime;
    @JSONField(name = "MsgType",deserializeUsing = MsgTypeDeserializer.class)
    MsgType msgType;
    @JSONField(name = "MsgId")
    String msgId;
    @JSONField(name = "NewMsgId")
    String newMsgId;
    @JSONField(name = "GroupMsg")
    Boolean isGroupMsg;


    public WeChatMsg()
    {

    }
    public WeChatMsg(String fromUser, String toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getNewMsgId() {
        return newMsgId;
    }

    public void setNewMsgId(String newMsgId) {
        this.newMsgId = newMsgId;
    }

    public Boolean getGroupMsg() {
        return isGroupMsg;
    }

    public void setGroupMsg(Boolean groupMsg) {
        isGroupMsg = groupMsg;
    }
}


