package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 对话转接记录
 */
public class ChatTransferPojo extends BaseXMLDto {

    /**
     * 对话记录的ID
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 对话转接时间
     */
    @JacksonXmlProperty(localName = "transferTime")
    private String transferTime;

    /**
     * 发起转接的客服ID
     */
    @JacksonXmlProperty(localName = "fromStaffId")
    private String fromStaffId;

    /**
     * 发起转接请求的客服登录名
     */
    @JacksonXmlProperty(localName = "fromStaffLogname")
    private String fromStaffLogname;

    /**
     * 发起转接请求的客服名称
     */
    @JacksonXmlProperty(localName = "fromStaffName")
    private String fromStaffName;

    /**
     * 接受转接的客服ID
     */
    @JacksonXmlProperty(localName = "toStaffId")
    private String toStaffId;

    /**
     * 接受转接的客服登陆名
     */
    @JacksonXmlProperty(localName = "toStaffLogname")
    private String toStaffLogname;

    /**
     * 接受转接的客服名称
     */
    @JacksonXmlProperty(localName = "toStaffName")
    private String toStaffName;

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }

    public String getFromStaffId() {
        return fromStaffId;
    }

    public void setFromStaffId(String fromStaffId) {
        this.fromStaffId = fromStaffId;
    }

    public String getFromStaffLogname() {
        return fromStaffLogname;
    }

    public void setFromStaffLogname(String fromStaffLogname) {
        this.fromStaffLogname = fromStaffLogname;
    }

    public String getFromStaffName() {
        return fromStaffName;
    }

    public void setFromStaffName(String fromStaffName) {
        this.fromStaffName = fromStaffName;
    }

    public String getToStaffId() {
        return toStaffId;
    }

    public void setToStaffId(String toStaffId) {
        this.toStaffId = toStaffId;
    }

    public String getToStaffLogname() {
        return toStaffLogname;
    }

    public void setToStaffLogname(String toStaffLogname) {
        this.toStaffLogname = toStaffLogname;
    }

    public String getToStaffName() {
        return toStaffName;
    }

    public void setToStaffName(String toStaffName) {
        this.toStaffName = toStaffName;
    }
}
