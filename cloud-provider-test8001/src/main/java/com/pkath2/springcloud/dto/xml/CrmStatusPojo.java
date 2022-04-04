package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 客户数据
 */
public class CrmStatusPojo extends BaseXMLDto {


    /**
     * 访客的唯一值
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String visitorId;

    /**
     * 将CRM数据发送到第三方的API接口
     * 1：访客在信息收集窗口填写了数据，对话开始后会自动触发
     * 2：客服手动在一洽CRM系统填写了客户信息，并点击了“发送至接口”手动触发
     * 3：客服将客户确认分配人后触发
     */
    @JacksonXmlProperty(localName = "crmStatus")
    private String crmStatus;

    /**
     * 发送数据的客服人员ID
     */
    @JacksonXmlProperty(localName = "staffId")
    private String staffId;

    /**
     * 发送数据的客服人员登录用户名
     */
    @JacksonXmlProperty(localName = "staffLogname")
    private String staffLogname;

    /**
     * 发送数据的客服人员姓名
     */
    @JacksonXmlProperty(localName = "staffName")
    private String staffName;

    /**
     * 所有者数据
     */
    @JacksonXmlProperty(localName = "ownerData")
    private OwnerDataPojo ownerData;

    /**
     * CRM数据
     */
    @JacksonXmlProperty(localName = "crmData")
    private String crmData;
}
