package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 访客离开
 */
public class visitorOutPojo extends BaseXMLDto {

    /**
     * 访客退出时，此路由的状态
     */
    @JacksonXmlProperty(localName = "routeStatus")
    private String routeStatus;

    /**
     * 此次浏览轨迹的ID，浏览记录唯一值
     */
    @JacksonXmlProperty(localName = "trackRecordId")
    private String trackRecordId;

    /**
     * 访客退出时此次浏览页面的数量
     */
    @JacksonXmlProperty(localName = "visitPageCount")
    private String visitPageCount;

    /**
     * 此次浏览页面访客的总浏览时长 单位：秒
     */
    @JacksonXmlProperty(localName = "visitTotalTime")
    private String visitTotalTime;

    /**
     * 整个会话范围过程产生的人工对话的ID、机器人对话的ID、留言对话的ID 列表
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 整个会话范围过程中，访客点击对话，
     * 弹出信息收集框但访客最终未进入对话的，放弃的 记录ID，
     * 记录ID是点击的ID，和对话记录留言记录的ID不是同一个数据
     */
    @JacksonXmlProperty(localName = "giveupRecordId")
    private String giveupRecordId;

    /**
     * 访客的离开的时间
     */
    @JacksonXmlProperty(localName = "visitorOutTime")
    private String visitorOutTime;

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    public String getTrackRecordId() {
        return trackRecordId;
    }

    public void setTrackRecordId(String trackRecordId) {
        this.trackRecordId = trackRecordId;
    }

    public String getVisitPageCount() {
        return visitPageCount;
    }

    public void setVisitPageCount(String visitPageCount) {
        this.visitPageCount = visitPageCount;
    }

    public String getVisitTotalTime() {
        return visitTotalTime;
    }

    public void setVisitTotalTime(String visitTotalTime) {
        this.visitTotalTime = visitTotalTime;
    }

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getGiveupRecordId() {
        return giveupRecordId;
    }

    public void setGiveupRecordId(String giveupRecordId) {
        this.giveupRecordId = giveupRecordId;
    }

    public String getVisitorOutTime() {
        return visitorOutTime;
    }

    public void setVisitorOutTime(String visitorOutTime) {
        this.visitorOutTime = visitorOutTime;
    }
}
