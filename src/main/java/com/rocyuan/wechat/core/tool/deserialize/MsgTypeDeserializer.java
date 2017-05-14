package com.rocyuan.wechat.core.tool.deserialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.rocyuan.wechat.bean.msg.base.MsgType;

import java.lang.reflect.Type;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class MsgTypeDeserializer implements ObjectDeserializer {


    @Override
    public MsgType deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
         String json = parser.getInput();
        JSONObject object = JSON.parseObject(json);
        int msgType = object.getIntValue("MsgType");
        String Type = object.getString("Type"); // 可能为空
        int SubMsgType = object.getIntValue("SubMsgType");
        int appMsgType = object.getIntValue("AppMsgType");
        return MsgType.valueOf(msgType,SubMsgType,appMsgType);

    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
