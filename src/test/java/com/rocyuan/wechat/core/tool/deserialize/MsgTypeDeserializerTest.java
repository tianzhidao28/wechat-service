package com.rocyuan.wechat.core.tool.deserialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rocyuan.wechat.bean.msg.WeChatTextMsg;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class MsgTypeDeserializerTest {

    public static void main(String[]args){

        String json = "{\n" +
                "    \"SubMsgType\" : 0,\n" +
                "    \"VoiceLength\" : 0,\n" +
                "    \"FileName\" : \"\",\n" +
                "    \"ImgHeight\" : 120,\n" +
                "    \"ToUserName\" : \"@e5eb5c8e899bdd5658dcac117ba786d3\",\n" +
                "    \"HasProductId\" : 0,\n" +
                "    \"ImgStatus\" : 2,\n" +
                "    \"Url\" : \"\",\n" +
                "    \"ImgWidth\" : 90,\n" +
                "    \"ForwardFlag\" : 0,\n" +
                "    \"Status\" : 3,\n" +
                "    \"Ticket\" : \"\",\n" +
                "    \"RecommendInfo\" : {\n" +
                "        \"Ticket\" : \"\",\n" +
                "        \"UserName\" : \"\",\n" +
                "        \"Sex\" : 0,\n" +
                "        \"AttrStatus\" : 0,\n" +
                "        \"City\" : \"\",\n" +
                "        \"NickName\" : \"\",\n" +
                "        \"Scene\" : 0,\n" +
                "        \"Province\" : \"\",\n" +
                "        \"Content\" : \"\",\n" +
                "        \"Alias\" : \"\",\n" +
                "        \"Signature\" : \"\",\n" +
                "        \"OpCode\" : 0,\n" +
                "        \"QQNum\" : 0,\n" +
                "        \"VerifyFlag\" : 0\n" +
                "    },\n" +
                "    \"CreateTime\" : 1494665951,\n" +
                "    \"NewMsgId\" : 8918892304896943229,\n" +
                "    \"MsgType\" : 3,\n" +
                "    \"groupMsg\" : false,\n" +
                "    \"MsgId\" : \"8918892304896943229\",\n" +
                "    \"StatusNotifyCode\" : 0,\n" +
                "    \"AppInfo\" : {\n" +
                "        \"Type\" : 0,\n" +
                "        \"AppID\" : \"\"\n" +
                "    },\n" +
                "    \"AppMsgType\" : 0,\n" +
                "    \"Type\" : \"Pic\",\n" +
                "    \"PlayLength\" : 0,\n" +
                "    \"MediaId\" : \"\",\n" +
                "    \"Content\" : \"&lt;?xml version=\\\"1.0\\\"?&gt;\\n&lt;msg&gt;\\n\\t&lt;img aeskey=\\\"cf7c6046def54a769680ef3422abfbdf\\\" encryver=\\\"0\\\" cdnthumbaeskey=\\\"cf7c6046def54a769680ef3422abfbdf\\\" cdnthumburl=\\\"3045020100043e303c020100020404f3bf7802033d14b902044ae503b702045916cadf041a7469616e7a686964616f30393333315f313439343636353935300201000201000400\\\" cdnthumblength=\\\"3124\\\" cdnthumbheight=\\\"120\\\" cdnthumbwidth=\\\"90\\\" cdnmidheight=\\\"0\\\" cdnmidwidth=\\\"0\\\" cdnhdheight=\\\"0\\\" cdnhdwidth=\\\"0\\\" cdnmidimgurl=\\\"3045020100043e303c020100020404f3bf7802033d14b902044ae503b702045916cadf041a7469616e7a686964616f30393333315f313439343636353935300201000201000400\\\" length=\\\"100544\\\" md5=\\\"956cc93fbb7f5a144ec3423f3cec3a4a\\\" /&gt;\\n&lt;/msg&gt;\\n\",\n" +
                "    \"StatusNotifyUserName\" : \"\",\n" +
                "    \"FromUserName\" : \"@f333405695d09046646c3cd77b9cae05\",\n" +
                "    \"OriContent\" : \"\",\n" +
                "    \"FileSize\" : \"\"\n" +
                "}";


        JSONObject jsonObject = JSONObject.parseObject(json);

        String jsonString = jsonObject.toJSONString();
        WeChatMsg weChatMsg = JSON.parseObject(jsonString,WeChatTextMsg.class);

        System.out.println(JSON.toJSONString(weChatMsg));

        System.out.println(weChatMsg.getMsgType().getMsgType());

    }

}