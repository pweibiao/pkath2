package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PageDataPojo {

    /**
     * 访问时间
     */
    @JacksonXmlProperty(localName = "visitTime")
    private String visitTime;

    /**
     * 访问页面的地址
     */
    @JacksonXmlProperty(localName = "pageUrl")
    private String pageUrl;

    /**
     * 访问页面的标题
     */
    @JacksonXmlProperty(localName = "pageTitle")
    private String pageTitle;

    /**
     * 此页面的别名
     */
    @JacksonXmlProperty(localName = "pageUrlAlias")
    private String pageUrlAlias;

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageUrlAlias() {
        return pageUrlAlias;
    }

    public void setPageUrlAlias(String pageUrlAlias) {
        this.pageUrlAlias = pageUrlAlias;
    }
}
