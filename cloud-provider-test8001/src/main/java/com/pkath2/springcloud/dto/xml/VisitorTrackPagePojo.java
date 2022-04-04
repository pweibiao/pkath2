package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

public class VisitorTrackPagePojo extends BaseXMLDto {

    /**
     * 此次浏览轨迹的ID，浏览记录唯一值
     */
    @JacksonXmlProperty(localName = "trackRecordId")
    private String trackRecordId;

    /**
     * 此次浏览的页面轨迹列表
     */
    @JacksonXmlProperty(localName = "visitPageDatas")
    private String visitPageDatas;

    /**
     * 浏览页面的信息
     */
    @JacksonXmlProperty(localName = "pageData")
    private PageDataPojo pageData;
}
