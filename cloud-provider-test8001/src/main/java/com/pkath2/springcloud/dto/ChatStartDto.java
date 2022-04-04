package com.pkath2.springcloud.dto;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@JacksonXmlRootElement(localName = "xml")
//@XmlAccessorType(XmlAccessType.NONE)
public class ChatStartDto extends BaseXMLDto{

    @JacksonXmlProperty(localName = "myData")
    private String myData;

    @JacksonXmlElementWrapper(localName = "metaData")
    private MetaDataDto metaDataDto;

    @JacksonXmlElementWrapper(localName = "visitorData")
    private VisitorDataDto visitorDataDto;

    @JacksonXmlElementWrapper(localName = "routeData")
    private RouteDataDto routeDataDto;

    @JacksonXmlElementWrapper(localName = "chatData")
    private ChatDataDto chatDataDto;

    public String getMyData() {
        return myData;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }

    public MetaDataDto getMetaDataDto() {
        return metaDataDto;
    }

    public void setMetaDataDto(MetaDataDto metaDataDto) {
        this.metaDataDto = metaDataDto;
    }

    public VisitorDataDto getVisitorDataDto() {
        return visitorDataDto;
    }

    public void setVisitorDataDto(VisitorDataDto visitorDataDto) {
        this.visitorDataDto = visitorDataDto;
    }

    public RouteDataDto getRouteDataDto() {
        return routeDataDto;
    }

    public void setRouteDataDto(RouteDataDto routeDataDto) {
        this.routeDataDto = routeDataDto;
    }

    public ChatDataDto getChatDataDto() {
        return chatDataDto;
    }

    public void setChatDataDto(ChatDataDto chatDataDto) {
        this.chatDataDto = chatDataDto;
    }
}
