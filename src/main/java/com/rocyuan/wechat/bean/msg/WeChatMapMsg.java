package com.rocyuan.wechat.bean.msg;

import com.alibaba.fastjson.annotation.JSONField;
import com.rocyuan.wechat.core.tool.deserialize.WeChatLocationDeserializer;
import com.rocyuan.wechat.bean.msg.base.WeChatMsg;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by rocyuan on 2017/5/13.
 */
public class WeChatMapMsg extends WeChatMsg {

    @JSONField(name = "Url")
    String locationUrl;

    @JSONField(name = "OriContent",deserializeUsing = WeChatLocationDeserializer.class)
    Location location;


    public WeChatMapMsg() {

    }


    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @XStreamAlias("location")
    public static class Location {

        /**
         * 经度
         */
        @XStreamAsAttribute
        @XStreamAlias("x")
        Double longitude;

        @XStreamAsAttribute
        @XStreamAlias("y")
        Double latitude;

        @XStreamAsAttribute
        @XStreamAlias("label")
        String label;

        @XStreamAsAttribute
        @XStreamAlias("maptype")
        String mapType;

        @XStreamAsAttribute
        @XStreamAlias("scale")
        Integer scale;


        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getMapType() {
            return mapType;
        }

        public void setMapType(String mapType) {
            this.mapType = mapType;
        }

        public Integer getScale() {
            return scale;
        }

        public void setScale(Integer scale) {
            this.scale = scale;
        }
    }




}
