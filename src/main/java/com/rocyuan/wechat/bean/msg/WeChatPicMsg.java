package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.core.tool.deserialize.WeChatMediaMsgUrlDeserializer;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatPicMsg extends WeChatMsg {

    @JSONField(deserializeUsing = WeChatMediaMsgUrlDeserializer.class)
    String imgUrl;

    @JSONField(name = "ImgHeight")
    Integer imgHeight;

    @JSONField(name = "ImgWidth")
    Integer imgWidth;

    public WeChatPicMsg() {

    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }
}
