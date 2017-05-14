package com.rocyuan.wechat.core.tool.deserialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;

/**
 * Voice , Video, Pic 消息的地址生成
 * Created by rocyuan on 2017/5/14.
 */
public class WeChatMediaMsgUrlDeserializer implements ObjectDeserializer {
    @Override
    public String deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        return "";
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
