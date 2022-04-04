package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 对话评估
 */
public class ChatSubjectPojo extends BaseXMLDto {

    /**
     * 对话记录的ID
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 对话评估的主题
     *  例如：售后>订单>物流
     */
    @JacksonXmlProperty(localName = "chatSubject")
    private String chatSubject;

    /**
     * 对话评估备注
     *  例如：客户要求换货，拒绝维修
     */
    @JacksonXmlProperty(localName = "chatSubjectMemo")
    private String chatSubjectMemo;

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getChatSubject() {
        return chatSubject;
    }

    public void setChatSubject(String chatSubject) {
        this.chatSubject = chatSubject;
    }

    public String getChatSubjectMemo() {
        return chatSubjectMemo;
    }

    public void setChatSubjectMemo(String chatSubjectMemo) {
        this.chatSubjectMemo = chatSubjectMemo;
    }
}
