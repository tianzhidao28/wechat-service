package com.rocyuan.wechat.bean.msg.base;

import java.io.File;

/**
 * Created by rocyuan on 2017/5/14.
 */
public class WeChatRespMsg {

    File file;
    String text;
    String url;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static WeChatRespMsgBuilder newBuilder() {
        return new WeChatRespMsgBuilder();
    }

    public static final class WeChatRespMsgBuilder {
        File file;
        String text;
        String url;

        private WeChatRespMsgBuilder() {
        }

        public static WeChatRespMsgBuilder aWeChatRespMsg() {
            return new WeChatRespMsgBuilder();
        }

        public WeChatRespMsgBuilder withFile(File file) {
            this.file = file;
            return this;
        }

        public WeChatRespMsgBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public WeChatRespMsgBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public WeChatRespMsg build() {
            WeChatRespMsg weChatRespMsg = new WeChatRespMsg();
            weChatRespMsg.setFile(file);
            weChatRespMsg.setText(text);
            weChatRespMsg.setUrl(url);
            return weChatRespMsg;
        }
    }
}
