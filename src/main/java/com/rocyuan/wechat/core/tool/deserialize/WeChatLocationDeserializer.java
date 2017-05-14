package com.rocyuan.wechat.core.tool.deserialize;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.rocyuan.wechat.bean.msg.WeChatMapMsg;
import com.thoughtworks.xstream.XStream;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatLocationDeserializer implements ObjectDeserializer {
    @Override
    public WeChatMapMsg.Location deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        String msgText = parser.getLexer().stringVal().replace("<msg>","").replace("</msg>","");
        if (StringUtils.isNotBlank(msgText)) {

            XStream xstream = new XStream();
            xstream.processAnnotations(WeChatMapMsg.Location.class);
            return (WeChatMapMsg.Location) xstream.fromXML(msgText);
        }
        return null;

    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
