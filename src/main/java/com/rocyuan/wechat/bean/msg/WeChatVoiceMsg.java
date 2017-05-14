package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.core.tool.deserialize.WeChatMediaMsgUrlDeserializer;

/**
 * 语音消息
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatVoiceMsg extends WeChatMsg {

    @JSONField(name = "VoiceLength")
    Integer voiceLength;

    @JSONField(deserializeUsing = WeChatMediaMsgUrlDeserializer.class)
    String voiceUrl;

    public WeChatVoiceMsg() {

    }

    public Integer getVoiceLength() {
        return voiceLength;
    }

    public void setVoiceLength(Integer voiceLength) {
        this.voiceLength = voiceLength;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }
}
