package com.rocyuan.wechat.core;

import org.junit.Test;
import com.mzlion.easyokhttp.HttpClient;

/**
 * Created by rocyuan on 2017/5/15.
 */
public class TulingApiTest {

    @Test
    public void testTuling()
    {
        String json = HttpClient.post("http://www.tuling123.com/openapi/api")
                  .param("key","80ddd1c4d5d2c3fc6090743438fd05c7")
                  .param("info","你好")
                  .param("userid","userId1290192")
                  .execute().asString();

        System.out.println(json);
    }
}
