package cn.zhouyafeng.itchat4j;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.zhouyafeng.itchat4j.components.Login;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import cn.zhouyafeng.itchat4j.utils.Core;
import cn.zhouyafeng.itchat4j.utils.MsgType;
import com.rocyuan.wechat.bean.msg.*;
import com.rocyuan.wechat.core.WeChatMsgDispatcher;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.rocyuan.wechat.utils.MongoUtils;

/**
 * 主类，初始化工作
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年4月25日 上午12:42:54
 * @version 1.0
 *
 */
public class Wechat {
	private static Logger logger = Logger.getLogger("Wechat");
	private static Core core = Core.getInstance();

	private IMsgHandlerFace msgHandler;

	public Wechat(String qrPath) {
		System.setProperty("jsse.enableSNIExtension", "false"); // 防止SSL错误
		Login login = new Login();
		login.login(qrPath);

	};

	public void start() {

		System.out.println("\n\nContactList:\n" + JSON.toJSONString(core.getContactList()));
		System.out.println("\n\nGroupList:\n" + JSON.toJSONString(core.getGroupList()));
		System.out.println("\n\nGroupIDList:\n" + JSON.toJSONString(core.getGroupIdList()));
		System.out.println("\n\nMemberList:\n" + JSON.toJSONString(core.getMemberList()));
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (core.getMsgList().size() > 0 && core.getMsgList().get(0).getString("Content") != null) {
						// System.out.println(core.getMsgList().get(0));
						if (core.getMsgList().get(0).getString("Content").length() > 0) {
							JSONObject msg = core.getMsgList().get(0);
							String msgJson = msg.toJSONString();
							MongoUtils.save(msg,"WeChatWebMsg");
							WeChatMsg weChatMsg = null;
							if (msg.getString("Type") != null) {
								if (msg.getString("Type").equals(MsgType.TEXT)) {
									weChatMsg = JSON.parseObject(msgJson,WeChatTextMsg.class);

								} else if (msg.getString("Type").equals(MsgType.PIC)) {
									weChatMsg = JSON.parseObject(msgJson,WeChatPicMsg.class);
								} else if (msg.getString("Type").equals(MsgType.VOICE)) {
									weChatMsg = JSON.parseObject(msgJson,WeChatVoiceMsg.class);
								} else if (msg.getString("Type").equals(MsgType.VIEDO)) {

									weChatMsg = JSON.parseObject(msgJson,WeChatVideoMsg.class);
								} else if (msg.getString("Type").equals(MsgType.NAMECARD)) {
									weChatMsg = JSON.parseObject(msgJson,WeChatNameCardMsg.class);

								}
								WeChatMsgDispatcher.handle(weChatMsg);
							}
						}
						core.getMsgList().remove(0);
					}
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
