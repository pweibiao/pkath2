package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;
import com.pkath2.springcloud.dto.MetaDataDto;
import com.pkath2.springcloud.dto.RouteDataDto;
import com.pkath2.springcloud.dto.VisitorDataDto;

/**
 * 访客进入
 */
public class VisitorEnterPojo extends BaseXMLDto {

    /**
     * 会员数据，如果是会员则传递该数据
     */
    @JacksonXmlProperty(localName = "metaData")
    private MetaDataDto metaData;

    /**
     * 访客数据
     */
    @JacksonXmlProperty(localName = "visitorData")
    private VisitorDataDto visitorData;

    /**
     * 路由数据
     */
    @JacksonXmlProperty(localName = "routeData")
    private RouteDataDto routeData;

    /**
     * 浏览数据
     */
    @JacksonXmlProperty(localName = "trackData")
    private TrackDataPojo trackData;
}
