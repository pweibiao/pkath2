package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 所有者
 */
public class OwnerDataPojo {

    /**
     * 所有者的ID
     */
    @JacksonXmlProperty(localName = "ownerId")
    private String ownerId;

    /**
     * 所有者登录的用户名
     */
    @JacksonXmlProperty(localName = "ownerLogname")
    private String ownerLogname;

    /**
     * 所有者姓名
     */
    @JacksonXmlProperty(localName = "ownerName")
    private String ownerName;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerLogname() {
        return ownerLogname;
    }

    public void setOwnerLogname(String ownerLogname) {
        this.ownerLogname = ownerLogname;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
