package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.MetaDataDto;

/**
 * 浏览数据
 */
public class TrackDataPojo {

    /**
     * 此次浏览轨迹的ID，浏览记录唯一值
     */
    @JacksonXmlProperty(localName = "trackRecordId")
    private String trackRecordId;

    /**
     * 当前访客此次是第几次来访
     */
    @JacksonXmlProperty(localName = "visitTimes")
    private String visitTimes;

}
