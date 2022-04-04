package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 客服KPI数据
 * 若 对话经过转接 则会有此数据
 * 若 对话只有一个客服服务 则只使用chatData的avgAnswerTime作为客服API
 */
public class StaffKpisPojo extends BaseXMLDto {

    /**
     * 接待对话的客服ID
     */
    @JacksonXmlProperty(localName = "staffId")
    private String staffId;

    /**
     * 接待对话的客服登录名
     */
    @JacksonXmlProperty(localName = "staffLogname")
    private String staffLogname;

    /**
     * 接待对话的客服姓名
     */
    @JacksonXmlProperty(localName = "staffName")
    private String staffName;

    /**
     * 首次响应时长 单位：秒
     */
    @JacksonXmlProperty(localName = "firstAnswerTime")
    private String firstAnswerTime;

    /**
     * 平均响应时长 单位：秒
     */
    @JacksonXmlProperty(localName = "avgAnswerTime")
    private String avgAnswerTime;

    /**
     * 访客发送消息条数
     */
    @JacksonXmlProperty(localName = "visitorSendMsg")
    private String visitorSendMsg;

    /**
     * 客服发送消息条数
     */
    @JacksonXmlProperty(localName = "staffSendMsg")
    private String staffSendMsg;

    /**
     * 总通话时长
     */
    @JacksonXmlProperty(localName = "duration")
    private String duration;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffLogname() {
        return staffLogname;
    }

    public void setStaffLogname(String staffLogname) {
        this.staffLogname = staffLogname;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getFirstAnswerTime() {
        return firstAnswerTime;
    }

    public void setFirstAnswerTime(String firstAnswerTime) {
        this.firstAnswerTime = firstAnswerTime;
    }

    public String getAvgAnswerTime() {
        return avgAnswerTime;
    }

    public void setAvgAnswerTime(String avgAnswerTime) {
        this.avgAnswerTime = avgAnswerTime;
    }

    public String getVisitorSendMsg() {
        return visitorSendMsg;
    }

    public void setVisitorSendMsg(String visitorSendMsg) {
        this.visitorSendMsg = visitorSendMsg;
    }

    public String getStaffSendMsg() {
        return staffSendMsg;
    }

    public void setStaffSendMsg(String staffSendMsg) {
        this.staffSendMsg = staffSendMsg;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
