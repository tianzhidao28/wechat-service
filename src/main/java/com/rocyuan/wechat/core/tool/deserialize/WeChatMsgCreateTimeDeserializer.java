package com.rocyuan.wechat.core.tool.deserialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * 将时间戳 秒 转换成时间
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMsgCreateTimeDeserializer implements ObjectDeserializer {
    @Override
    public Date deserialze(DefaultJSONParser defaultJSONParser, Type type, Object fieldName) {
        long time = defaultJSONParser.getLexer().longValue();
        return new Date(time * 1000);
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
