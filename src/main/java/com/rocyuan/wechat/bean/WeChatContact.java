package com.rocyuan.wechat.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.Sex;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信上的聊天对象的一个实体类
 * Created by rocyuan on 2017/5/14.
 */
public class WeChatContact {

    @JSONField(name="Sex")
    private Sex sex;

    @JSONField(name="EncryChatRoomId")
    private String encryChatRoomId;

    @JSONField(name="UserName")
    private String userName;

    @JSONField(name="MemberList")
    private List<Object> memberList = null;

    @JSONField(name="StarFriend")
    private Boolean starFriend;

    @JSONField(name="HeadImgUrl")
    private String headImgUrl;


    @JSONField(name="MemberCount")
    private Long memberCount;


    @JSONField(name="City")
    private String city;
    @JSONField(name="NickName")
    private String nickName;
    @JSONField(name="Province")
    private String province;


    @JSONField(name="Signature")
    private String signature;
    @JSONField(name="RemarkName")
    private String remarkName;

    @JSONField(name="IsOwner")
    private Boolean isOwner;


    private List<String> tags = new ArrayList<>();

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEncryChatRoomId() {
        return encryChatRoomId;
    }

    public void setEncryChatRoomId(String encryChatRoomId) {
        this.encryChatRoomId = encryChatRoomId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Object> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Object> memberList) {
        this.memberList = memberList;
    }

    public Boolean getStarFriend() {
        return starFriend;
    }

    public void setStarFriend(Boolean starFriend) {
        this.starFriend = starFriend;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public void setOwner(Boolean owner) {
        isOwner = owner;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
