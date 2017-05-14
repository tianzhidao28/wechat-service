package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.core.tool.deserialize.WeChatMediaMsgUrlDeserializer;

/**
 * 小视頻消息
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatVideoMsg extends WeChatMsg {



    @JSONField(name = "PlayLength")
    Integer playLength;

    @JSONField(deserializeUsing = WeChatMediaMsgUrlDeserializer.class)
    String videoUrl;

    public WeChatVideoMsg() {

    }

    public Integer getPlayLength() {
        return playLength;
    }

    public void setPlayLength(Integer playLength) {
        this.playLength = playLength;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
