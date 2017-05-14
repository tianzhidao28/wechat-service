package com.rocyuan.wechat.bean.msg.response;

import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.bean.msg.base.WeChatRespMsg;

/**
 * Created by rocyuan on 2017/5/14.
 */
public interface WeChatMsgResponse {

    WeChatRespMsg getResponse(WeChatMsg weChatMsg);
}
