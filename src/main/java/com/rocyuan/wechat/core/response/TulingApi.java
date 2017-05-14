package com.rocyuan.wechat.core.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mzlion.easyokhttp.HttpClient;
import com.rocyuan.wechat.bean.msg.base.WeChatRespMsg;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by rocyuan on 2017/5/15.
 */
public class TulingApi implements Answer{
    @Override
    public String answer(String text) {
        String json = HttpClient.post("http://www.tuling123.com/openapi/api")
                                .param("key","80ddd1c4d5d2c3fc6090743438fd05c7")
                                .param("info",text)
                                .execute().asString();
        if (StringUtils.isNotBlank(json)) {
            JSONObject jsonObject = JSON.parseObject(json);
            if (1000 == jsonObject.getIntValue("code")) {
                return jsonObject.getString("text");
            }
        }
        return null;
    }
}
