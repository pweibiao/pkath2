package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pkath2.springcloud.dto.BaseXMLDto;

/**
 * 留言分配
 *
 * 留言分配时触发此消息下发包括  系统自动分配 和 客服手动分配 以及客服认领。
 */
public class LeaveMsgOwnerPojo extends BaseXMLDto {

    /**
     * 会员的唯一值
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String visitorId;

    /**
     * 对话记录ID 唯一值
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 客服id
     * -1 为系统自动分配的留言
     */
    @JacksonXmlProperty(localName = "staffId")
    private String staffId;

    /**
     * 客服账号（手机/邮箱)
     */
    @JacksonXmlProperty(localName = "staffLogname")
    private String staffLogname;

    /**
     * 客服姓名
     */
    @JacksonXmlProperty(localName = "staffName")
    private String staffName;

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

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffLogname() {
        return staffLogname;
    }

    public void setStaffLogname(String staffLogname) {
        this.staffLogname = staffLogname;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

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
