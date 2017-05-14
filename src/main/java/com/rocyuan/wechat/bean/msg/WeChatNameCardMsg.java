package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.bean.msg.base.Sex;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatNameCardMsg extends WeChatMsg {

    @JSONField(name = "RecommendInfo")
    private RecommendInfo recommendInfo;

    public WeChatNameCardMsg() {

    }

    public String getRecommendUserName() {
        return recommendInfo.userName;
    }

    public String getRecommendNickName() {
        return recommendInfo.nickName;
    }

    public static class RecommendInfo {

        @JSONField(name = "NickName")
        private String nickName;	/*袁祖***/
        @JSONField(name = "UserName")
        private String userName;	/*@30c588817a13cad0518a209303986a4a*/
        @JSONField(name = "Province")
        private String province;	/*湖北*/
        @JSONField(name = "City")
        private String city;	/*中国*/
        @JSONField(name = "Signature")
        private String signature;	/**/
        @JSONField(name = "Sex")
        private Sex sex;	/*1*/


        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }
    }


    public RecommendInfo getRecommendInfo() {
        return recommendInfo;
    }

    public void setRecommendInfo(RecommendInfo recommendInfo) {
        this.recommendInfo = recommendInfo;
    }
}
