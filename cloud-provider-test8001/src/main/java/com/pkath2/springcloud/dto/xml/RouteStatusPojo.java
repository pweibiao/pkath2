package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 路由变更
 * 路由下客服分组中的客服在线或者全部离线时（溢出分组）
 */
public class RouteStatusPojo extends BaseXMLDto {

    /**
     * 指定路由的状态 1:在线 2:离线
     */
    @JacksonXmlProperty(localName = "routeStatus")
    private String routeStatus;

    /**
     * 状态发生变化的路由ID
     */
    @JacksonXmlProperty(localName = "routeId")
    private String routeId;

    /**
     * 状态发生变化的路由名称
     */
    @JacksonXmlProperty(localName = "routeName")
    private String routeName;

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

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
}
