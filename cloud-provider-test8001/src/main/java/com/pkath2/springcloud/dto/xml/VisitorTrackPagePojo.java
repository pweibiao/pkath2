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

    public String getTrackRecordId() {
        return trackRecordId;
    }

    public void setTrackRecordId(String trackRecordId) {
        this.trackRecordId = trackRecordId;
    }

    public String getVisitPageDatas() {
        return visitPageDatas;
    }

    public void setVisitPageDatas(String visitPageDatas) {
        this.visitPageDatas = visitPageDatas;
    }

    public PageDataPojo getPageData() {
        return pageData;
    }

    public void setPageData(PageDataPojo pageData) {
        this.pageData = pageData;
    }
}
