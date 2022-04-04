package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 对话满意度评价
 */
public class ChatScorePojo extends BaseXMLDto {

    /**
     * 对话记录的ID
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 满意度评价，
     * 1-非常不满意， 2-不满意， 3-一般， 4-满意， 5-非常满意
     */
    @JacksonXmlProperty(localName = "chatScore")
    private String chatScore;

    /**
     * 评价维度 例如：产品、服务、物流
     */
    @JacksonXmlProperty(localName = "scoreDimension")
    private String scoreDimension;

    /**
     * 评价的内容
     */
    @JacksonXmlProperty(localName = "scoreSuggest")
    private String scoreSuggest;

    /**
     * 评价发生时正在接待对话的客服ID,如评价时对话已结束则无此信息
     */
    @JacksonXmlProperty(localName = "chatStaffId")
    private String chatStaffId;

    /**
     * 评价发生时正在接待对话的客服登录名,如评价时对话已结束则无此信息
     */
    @JacksonXmlProperty(localName = "chatStaffLogname")
    private String chatStaffLogname;

    /**
     * 评价发生时正在接待对话的客服姓名,如评价时对话已结束则无此信息
     */
    @JacksonXmlProperty(localName = "chatStaffName")
    private String chatStaffName;

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getChatScore() {
        return chatScore;
    }

    public void setChatScore(String chatScore) {
        this.chatScore = chatScore;
    }

    public String getScoreDimension() {
        return scoreDimension;
    }

    public void setScoreDimension(String scoreDimension) {
        this.scoreDimension = scoreDimension;
    }

    public String getScoreSuggest() {
        return scoreSuggest;
    }

    public void setScoreSuggest(String scoreSuggest) {
        this.scoreSuggest = scoreSuggest;
    }

    public String getChatStaffId() {
        return chatStaffId;
    }

    public void setChatStaffId(String chatStaffId) {
        this.chatStaffId = chatStaffId;
    }

    public String getChatStaffLogname() {
        return chatStaffLogname;
    }

    public void setChatStaffLogname(String chatStaffLogname) {
        this.chatStaffLogname = chatStaffLogname;
    }

    public String getChatStaffName() {
        return chatStaffName;
    }

    public void setChatStaffName(String chatStaffName) {
        this.chatStaffName = chatStaffName;
    }
}
