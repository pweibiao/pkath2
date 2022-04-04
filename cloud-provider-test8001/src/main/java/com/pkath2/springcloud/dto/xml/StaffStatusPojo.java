package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 客服状态变更
 */
public class StaffStatusPojo extends BaseXMLDto {


    /**
     * 状态发生变化的分组id
     */
    @JacksonXmlProperty(localName = "skillId")
    private String skillId;

    /**
     * 状态发生变化的分组名称
     */
    @JacksonXmlProperty(localName = "skillNanme")
    private String skillNanme;

    /**
     * 当前分组的状态1：在线 2：离线
     */
    @JacksonXmlProperty(localName = "skillStatus")
    private String skillStatus;

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getSkillNanme() {
        return skillNanme;
    }

    public void setSkillNanme(String skillNanme) {
        this.skillNanme = skillNanme;
    }

    public String getSkillStatus() {
        return skillStatus;
    }

    public void setSkillStatus(String skillStatus) {
        this.skillStatus = skillStatus;
    }
}
