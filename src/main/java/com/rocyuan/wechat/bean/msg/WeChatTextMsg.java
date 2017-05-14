package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatTextMsg extends WeChatMsg {
    @JSONField(name = "Text")
    String text;

    public WeChatTextMsg()
    {

    }

    public WeChatTextMsg(String text) {
        this.text = text;
    }

    public WeChatTextMsg(String text,String from,String to) {
        super(from,to);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
