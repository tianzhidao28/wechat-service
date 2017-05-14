package com.rocyuan.wechat.utils;

import com.google.common.collect.Maps;

import java.util.Date;
import java.util.Map;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatHttpResultUtils {

    public static void saveWxHttpApi(String apiName,String url,Object requestParam,Object result) {
        Map<String,Object> httpResult = Maps.newHashMap();
        httpResult.put("apiName",apiName);
        httpResult.put("url",url);
        httpResult.put("requestTime",new Date());
        httpResult.put("requestParam",requestParam);
        httpResult.put("requestResult",result);

        MongoUtils.save(httpResult,"WeChatWebHttpRequest");

    }

}
