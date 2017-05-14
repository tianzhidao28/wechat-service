package com.rocyuan.wechat.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMemberBook {

    @JSONField(name="ChatRoomId")
    private Long chatRoomId;
    @JSONField(name="Sex")
    private Long sex;
    @JSONField(name="AttrStatus")
    private Long attrStatus;
    @JSONField(name="Statues")
    private Long statues;
    @JSONField(name="PYQuanPin")
    private String pYQuanPin;
    @JSONField(name="EncryChatRoomId")
    private String encryChatRoomId;
    @JSONField(name="DisplayName")
    private String displayName;
    @JSONField(name="VerifyFlag")
    private Long verifyFlag;
    @JSONField(name="UniFriend")
    private Long uniFriend;
    @JSONField(name="ContactFlag")
    private Long contactFlag;
    @JSONField(name="UserName")
    private String userName;

    @JSONField(name="StarFriend")
    private Long starFriend;
    @JSONField(name="HeadImgUrl")
    private String headImgUrl;

    @JSONField(name="City")
    private String city;
    @JSONField(name="NickName")
    private String nickName;
    @JSONField(name="Province")
    private String province;
    @JSONField(name="SnsFlag")
    private Long snsFlag;
    @JSONField(name="Alias")
    private String alias;
    @JSONField(name="KeyWord")
    private String keyWord;
    @JSONField(name="HideInputBarFlag")
    private Long hideInputBarFlag;
    @JSONField(name="Signature")
    private String signature;
    @JSONField(name="RemarkName")
    private String remarkName;
    @JSONField(name="RemarkPYQuanPin")
    private String remarkPYQuanPin;
    @JSONField(name="Uin")
    private Long uin;
    @JSONField(name="OwnerUin")
    private Long ownerUin;
    @JSONField(name="IsOwner")
    private Long isOwner;
    @JSONField(name="PYInitial")
    private String pYInitial;

}
