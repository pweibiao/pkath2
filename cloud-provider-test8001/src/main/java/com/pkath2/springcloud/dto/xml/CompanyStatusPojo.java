package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 公司客服在线状态
 * 1：有客服在线
 * 2：所有客服离线
 */
public class CompanyStatusPojo extends BaseXMLDto {

    @JacksonXmlProperty(localName = "companyStatus")
    private String companyStatus;

    @Override
    public String getCompanyStatus() {
        return companyStatus;
    }

    @Override
    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }
}
