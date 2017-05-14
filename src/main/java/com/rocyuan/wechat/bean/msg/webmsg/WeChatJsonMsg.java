package com.rocyuan.wechat.bean.msg.webmsg;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatJsonMsg {

    private	String	msgId;	/*6081337643309445027*/
    private	Integer	forwardFlag;
    private	Long	newMsgId;	/*6081337643309445000*/
    private	String	type;	/*Pic*/
    private	RecommendInfo	recommendInfo;	/*TRecommendInfo*/
    private	Integer	voiceLength;
    private	Integer	msgType;	/*3*/
    private	String	oriContent;
    private	String	ticket;
    private	String	url;
    private	Boolean	groupMsg;	/*false*/
    private	AppInfo	appInfo;	/*TAppInfo*/
    private	Integer	subMsgType;
    private	String	content;	/*&lt;?xml version="1.0"?&gt;&lt;msg&gt;	&lt;img aeskey="2384ec2f417e4066a23522635d76b86a" encryver="0" cdnthumbaeskey="2384ec2f417e4066a23522635d76b86a" cdnthumburl="3050020100044930470201000204577f6a2c02030f48810204a5b88cb60204590cac9e0425617570696d675f633337313936633333656466343463635f313439343030323834363430340201000201000400" cdnthumblength="12204" cdnthumbheight="120" cdnthumbwidth="90" cdnmidheight="0" cdnmidwidth="0" cdnhdheight="0" cdnhdwidth="0" cdnmidimgurl="3050020100044930470201000204577f6a2c02030f48810204a5b88cb60204590cac9e0425617570696d675f633337313936633333656466343463635f313439343030323834363430340201000201000400" length="139120" md5="5a774ad813f40fb3ca81349d82101423" /&gt;&lt;/msg&gt;*/
    private	Integer	appMsgType;
    private	Integer	imgWidth;	/*90*/
    private	Integer	playLength;
    private	Integer	statusNotifyCode;
    private	String	statusNotifyUserName;
    private	Integer	hasProductId;
    private	String	mediaId;
    private	String	toUserName;	/*@58b8651e056f8937f7a4eaa386be0c16d2583a0fdb5741b874cedffe3e13e723*/
    private	String	fileSize;
    private	Integer	status;	/*3*/
    private	String	fromUserName;	/*@a257b99314d8313862cd44ab02fe0f81*/
    private	Integer	imgHeight;	/*120*/
    private	Integer	imgStatus;	/*2*/
    private	String	fileName;
    private	Integer	createTime;	/*1494079495*/



    public static class RecommendInfo {
        private	Integer	verifyFlag;
        private	Integer	scene;
        private	Integer	qQNum;
        private	String	userName;
        private	String	province;
        private	String	city;
        private	String	signature;
        private	String	ticket;
        private	Integer	opCode;
        private	String	alias;
        private	Integer	attrStatus;
        private	String	content;
        private	Integer	sex;

        public Integer getVerifyFlag() {
            return verifyFlag;
        }

        public void setVerifyFlag(Integer verifyFlag) {
            this.verifyFlag = verifyFlag;
        }

        public Integer getScene() {
            return scene;
        }

        public void setScene(Integer scene) {
            this.scene = scene;
        }

        public Integer getqQNum() {
            return qQNum;
        }

        public void setqQNum(Integer qQNum) {
            this.qQNum = qQNum;
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

        public String getTicket() {
            return ticket;
        }

        public void setTicket(String ticket) {
            this.ticket = ticket;
        }

        public Integer getOpCode() {
            return opCode;
        }

        public void setOpCode(Integer opCode) {
            this.opCode = opCode;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public Integer getAttrStatus() {
            return attrStatus;
        }

        public void setAttrStatus(Integer attrStatus) {
            this.attrStatus = attrStatus;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }
    }



    public static class AppInfo{

        private	Integer	type;
        private	String	appID;

        public void setType(Integer value){
            this.type = value;
        }
        public Integer getType(){
            return this.type;
        }

        public void setAppID(String value){
            this.appID = value;
        }
        public String getAppID(){
            return this.appID;
        }

    }





}
