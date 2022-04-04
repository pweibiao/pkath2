package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 对话内容
 */
public class ChatContentPojo extends BaseXMLDto {

    /**
     * 对话记录的ID
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 对话内容
     */
    @JacksonXmlProperty(localName = "chatContent")
    private String chatContent;

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }
}
