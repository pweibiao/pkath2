package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.*;

/**
 * 对话开始
 *  人工对话开始/结束 chatStart / chatEnd
 *  机器人对话开始/结束 robotChatStart / robotChatEnd
 */
public class ChatStartPojo extends BaseXMLDto {

    /**
     * 对话状态
     * 1：人工对话开始
     * 2：人工对话结束
     * 3：留言开始
     * 4：留言结束
     * 5：机器人对话开始
     * 6：机器人对话结束
     */
    @JacksonXmlProperty(localName = "chatStatus")
    private String chatStatus;

    /**
     * 会员数据
     */
    @JacksonXmlProperty(localName = "metaData")
    private MetaDataDto metaData;

    /**
     * 访客数据
     */
    @JacksonXmlProperty(localName = "visitorData")
    private VisitorDataDto visitorData;

    /**
     * 本次对话的路由数据
     */
    @JacksonXmlProperty(localName = "routeData")
    private RouteDataDto routeData;


    /**
     * 本次对话的路由数据
     */
    @JacksonXmlProperty(localName = "chatData")
    private ChatDataDto chatData;

    @Override
    public String getChatStatus() {
        return chatStatus;
    }

    @Override
    public void setChatStatus(String chatStatus) {
        this.chatStatus = chatStatus;
    }

    public MetaDataDto getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataDto metaData) {
        this.metaData = metaData;
    }

    public VisitorDataDto getVisitorData() {
        return visitorData;
    }

    public void setVisitorData(VisitorDataDto visitorData) {
        this.visitorData = visitorData;
    }

    public RouteDataDto getRouteData() {
        return routeData;
    }

    public void setRouteData(RouteDataDto routeData) {
        this.routeData = routeData;
    }

    public ChatDataDto getChatData() {
        return chatData;
    }

    public void setChatData(ChatDataDto chatData) {
        this.chatData = chatData;
    }
}
