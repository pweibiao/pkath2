package com.pkath2.springcloud.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@JacksonXmlRootElement(localName = "RouteData")
//@XmlAccessorType(XmlAccessType.NONE)
public class RouteDataDto implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * 接入对话的路由ID 例：6393
     * 若为
     *  -1：web访客的默认路由
     *  -2：微信对话的默认路由
     *  -3：SDK对话的默认路由
     */
    @JacksonXmlProperty(localName = "routeId")
    private String routeId;

    /**
     * 路由名称
     */
    @JacksonXmlProperty(localName = "routeName")
    private String routeName;

    /**
     * 路由所使用的样式ID
     */
    @JacksonXmlProperty(localName = "styleId")
    private String styleId;

    /**
     * 路由所使用样式的名称
     */
    @JacksonXmlProperty(localName = "styleName")
    private String styleName;

    /**
     * 本次分配对话的分组ID
     *  如果分配为 全部人员 可接待 ID 为 0
     */
    @JacksonXmlProperty(localName = "chatDepartmentId")
    private String chatDepartmentId;

    /**
     * 本地分配对话的分组名称 例如：订单组
     */
    @JacksonXmlProperty(localName = "chatDepartmentName")
    private String chatDepartmentName;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getChatDepartmentId() {
        return chatDepartmentId;
    }

    public void setChatDepartmentId(String chatDepartmentId) {
        this.chatDepartmentId = chatDepartmentId;
    }

    public String getChatDepartmentName() {
        return chatDepartmentName;
    }

    public void setChatDepartmentName(String chatDepartmentName) {
        this.chatDepartmentName = chatDepartmentName;
    }
}
