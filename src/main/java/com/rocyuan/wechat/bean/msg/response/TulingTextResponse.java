package com.rocyuan.wechat.bean.msg.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mzlion.easyokhttp.HttpClient;
import com.rocyuan.wechat.bean.msg.WeChatTextMsg;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.bean.msg.base.WeChatRespMsg;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by rocyuan on 2017/5/14.
 */
public class TulingTextResponse implements WeChatMsgResponse {

    @Override
    public WeChatRespMsg getResponse(WeChatMsg weChatMsg) {
        if (weChatMsg instanceof WeChatTextMsg) {
            WeChatTextMsg weChatTextMsg = (WeChatTextMsg) weChatMsg;

            String json = HttpClient.post("http://www.tuling123.com/openapi/api")
                                    .param("key","80ddd1c4d5d2c3fc6090743438fd05c7")
                                    .param("info",weChatTextMsg.getText())
                                    .param("userid",weChatTextMsg.getFromUser())
                                    .execute().asString();
            if (StringUtils.isNotBlank(json)) {
                JSONObject jsonObject = JSON.parseObject(json);
                if (1000 == jsonObject.getIntValue("code")) {
                    String text = jsonObject.getString("text");
                    return WeChatRespMsg.newBuilder().withText(text).build();
                }
            }
        }
        return null;
    }
}
