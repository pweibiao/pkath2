package com.pkath2.springcloud.dto;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@JacksonXmlRootElement(localName = "xml")
//@XmlType(name = "xml")
//@XmlAccessorType(XmlAccessType.NONE)
public class BaseXMLDto implements Serializable {
    private static final long serialVersionUID = -1;

    /**
     * 服务器接口 数据业务类型
     */
    private String dataType;

    /**
     * 数据消息的唯一id
     */
    @JacksonXmlProperty(localName = "msgId")
//    @XmlElement(name = "msgId")
    private String msgId;

    /**
     * 时间戳
     */
    @JacksonXmlProperty(localName = "tm")
//    @XmlElement(name = "tm")
    private String tm;

    @JacksonXmlProperty(localName = "companyStatus")
//    @XmlElement(name = "companyStatus")
    private String companyStatus;

    /**
     * AES加密数据
     */
    @JacksonXmlProperty(localName = "Encrypt")
//    @XmlElement(name = "Encrypt")
    private String Encrypt;

    /**
     * 开发者自定义扩展数据
     */
    @JacksonXmlProperty(localName = "myData")
    private String myData;

    @JacksonXmlProperty(localName = "chatStatus")
    private String chatStatus;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getEncrypt() {
        return Encrypt;
    }

    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }

    public String getChatStatus() {
        return chatStatus;
    }

    public void setChatStatus(String chatStatus) {
        this.chatStatus = chatStatus;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
