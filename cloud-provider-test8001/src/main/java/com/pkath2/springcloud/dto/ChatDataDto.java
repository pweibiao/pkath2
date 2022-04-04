package com.pkath2.springcloud.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 对话数据
 */
//@XmlRootElement(name = "chatData")
//@XmlAccessorType(XmlAccessType.NONE)
@JacksonXmlRootElement(localName = "chatData")
public class ChatDataDto implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * 对话页面 例如：http://www.echatsoft.com
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "chatPage")
    private String chatPage;

    /**
     * 对话页面标题 例如：一洽软件
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "chatPageTitle")
    private String chatPageTitle;

    /**
     * 访客的对话次数
     */
    @JacksonXmlProperty(localName = "chatTimes")
    private String chatTimes;

    /**
     * 对话发起的方式
     *  1-点击图标， 2-接受邀请对话， 3-客服主动对话，
     *  4-微信输入任意文字接入对话， 5-微信点击菜单接入，
     *  6-微信输入指定文字接入， 7-微信机器人转人工，
     *  11-机器人转人工， 12-机器人转留言， 14-web自动弹屏自动接入，
     *  15-web自动弹屏访客输入消息接入， 16-商户留言转平台接入，
     *  17-微信开发者接入， 18-自定义渠道事件接入， 19-自定义渠道发送消息接入
     */
    @JacksonXmlProperty(localName = "chatEvent")
    private String chatEvent;

    /**
     * 请求对话的时间
     */
    @JacksonXmlProperty(localName = "chatRequestTime")
    private String chatRequestTime;

    /**
     * 接通对话的时间
     */
    @JacksonXmlProperty(localName = "chatAnswerTime")
    private String chatAnswerTime;

    /**
     * 会话类型
     * 1-在线对话，
     * 2-忙碌对话，
     * 3-离线消息，
     * 5-机器人对话
     */
    @JacksonXmlProperty(localName = "chatType")
    private String chatType;

    /**
     * 接待对话的客服ID
     *  只有在 人工对话 有效， 机器人回复无效
     */
    @JacksonXmlProperty(localName = "chatStaffId")
    private String chatStaffId;

    /**
     * 接待对话的客服登录名
     *  只有在 人工对话 有效， 机器人回复无效
     */
    @JacksonXmlProperty(localName = "chatStaffLogname")
    private String chatStaffLogname;

    /**
     * 接待对话的客服姓名
     *  只有在 人工对话 有效， 机器人回复无效
     */
    @JacksonXmlProperty(localName = "chatStaffName")
    private String chatStaffName;

    /**
     * 接待对话的客服的 内部角色名称
     */
    @JacksonXmlProperty(localName = "chatStaffRole")
    private String chatStaffRole;

    /**
     * 对话入口
     *  访客端传参为echatTag的值
     */
    @JacksonXmlProperty(localName = "chatEntrance")
    private String chatEntrance;

    /**
     * 对话记录的ID，唯一值
     */
    @JacksonXmlProperty(localName = "chatRecordId")
    private String chatRecordId;

    /**
     * 对话结束时间
     */
    @JacksonXmlProperty(localName = "chatEndTime")
    private String chatEndTime;

    /**
     * 对话结束方式
     * 0-未知， 1-访客结束对话， 2-客服结束对话， 3-访客超时，
     * 5-客服退出， 6-系统关闭， 8-访客长时间未回复结束，
     * 12-忙碌放弃结束， 14-留言超时结束， 15-机器人自动转人工结束，
     * 16-机器人手动转人工结束， 18-客服主动对话后留言/机器人对话结束
     */
    @JacksonXmlProperty(localName = "chatEndType")
    private String chatEndType;


    /**
     * 通话时长 单位：毫秒
     */
    @JacksonXmlProperty(localName = "chatTotalTime")
    private String chatTotalTime;

    /**
     * 等待时长 单位：毫秒
     */
    @JacksonXmlProperty(localName = "chatWaitTime")
    private String chatWaitTime;

    /**
     * 首次响应时长 单位：毫秒
     */
    @JacksonXmlProperty(localName = "firstAnswerTime")
    private String firstAnswerTime;

    /**
     * 平均响应时长 单位：毫秒
     */
    @JacksonXmlProperty(localName = "avgAnswerTime")
    private String avgAnswerTime;

    /**
     * 访客发送消息条数
     */
    @JacksonXmlProperty(localName = "visitorSendMsg")
    private String visitorSendMsg;

    /**
     * 客服发送消息条数
     */
    @JacksonXmlProperty(localName = "staffSendMsg")
    private String staffSendMsg;

    /**
     * 完全匹配数（机器人对话）
     */
    @JacksonXmlProperty(localName = "perfectMatchs")
    private String perfectMatchs;

    /**
     * 精准匹配数（机器人对话）
     */
    @JacksonXmlProperty(localName = "exactMatchs")
    private String exactMatchs;

    /**
     * 相似匹配数（机器人对话）
     */
    @JacksonXmlProperty(localName = "similarityMatchs")
    private String similarityMatchs;

    /**
     * 未命中数（机器人对话）
     */
    @JacksonXmlProperty(localName = "misMatchCount")
    private String misMatchCount;

    /**
     * 点击解决数（机器人对话）
     */
    @JacksonXmlProperty(localName = "solvedCount")
    private String solvedCount;

    /**
     * 点击未解决数（机器人对话）
     */
    @JacksonXmlProperty(localName = "unsolvedCount")
    private String unsolvedCount;

    /**
     * 是否邀评
     * 1， 有邀评 0， 没有邀评
     */
    @JacksonXmlProperty(localName = "activelyInviteEvaluating")
    private String activelyInviteEvaluating;

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



    public String getChatPage() {
        return chatPage;
    }

    public void setChatPage(String chatPage) {
        this.chatPage = chatPage;
    }

    public String getChatPageTitle() {
        return chatPageTitle;
    }

    public void setChatPageTitle(String chatPageTitle) {
        this.chatPageTitle = chatPageTitle;
    }

    public String getChatTimes() {
        return chatTimes;
    }

    public void setChatTimes(String chatTimes) {
        this.chatTimes = chatTimes;
    }

    public String getChatEvent() {
        return chatEvent;
    }

    public void setChatEvent(String chatEvent) {
        this.chatEvent = chatEvent;
    }

    public String getChatRequestTime() {
        return chatRequestTime;
    }

    public void setChatRequestTime(String chatRequestTime) {
        this.chatRequestTime = chatRequestTime;
    }

    public String getChatAnswerTime() {
        return chatAnswerTime;
    }

    public void setChatAnswerTime(String chatAnswerTime) {
        this.chatAnswerTime = chatAnswerTime;
    }

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getChatStaffId() {
        return chatStaffId;
    }

    public void setChatStaffId(String chatStaffId) {
        this.chatStaffId = chatStaffId;
    }

    public String getChatStaffLogname() {
        return chatStaffLogname;
    }

    public void setChatStaffLogname(String chatStaffLogname) {
        this.chatStaffLogname = chatStaffLogname;
    }

    public String getChatStaffName() {
        return chatStaffName;
    }

    public void setChatStaffName(String chatStaffName) {
        this.chatStaffName = chatStaffName;
    }

    public String getChatStaffRole() {
        return chatStaffRole;
    }

    public void setChatStaffRole(String chatStaffRole) {
        this.chatStaffRole = chatStaffRole;
    }

    public String getChatEntrance() {
        return chatEntrance;
    }

    public void setChatEntrance(String chatEntrance) {
        this.chatEntrance = chatEntrance;
    }

    public String getChatRecordId() {
        return chatRecordId;
    }

    public void setChatRecordId(String chatRecordId) {
        this.chatRecordId = chatRecordId;
    }

    public String getChatEndTime() {
        return chatEndTime;
    }

    public void setChatEndTime(String chatEndTime) {
        this.chatEndTime = chatEndTime;
    }

    public String getChatEndType() {
        return chatEndType;
    }

    public void setChatEndType(String chatEndType) {
        this.chatEndType = chatEndType;
    }

    public String getChatTotalTime() {
        return chatTotalTime;
    }

    public void setChatTotalTime(String chatTotalTime) {
        this.chatTotalTime = chatTotalTime;
    }

    public String getChatWaitTime() {
        return chatWaitTime;
    }

    public void setChatWaitTime(String chatWaitTime) {
        this.chatWaitTime = chatWaitTime;
    }

    public String getFirstAnswerTime() {
        return firstAnswerTime;
    }

    public void setFirstAnswerTime(String firstAnswerTime) {
        this.firstAnswerTime = firstAnswerTime;
    }

    public String getAvgAnswerTime() {
        return avgAnswerTime;
    }

    public void setAvgAnswerTime(String avgAnswerTime) {
        this.avgAnswerTime = avgAnswerTime;
    }

    public String getVisitorSendMsg() {
        return visitorSendMsg;
    }

    public void setVisitorSendMsg(String visitorSendMsg) {
        this.visitorSendMsg = visitorSendMsg;
    }

    public String getStaffSendMsg() {
        return staffSendMsg;
    }

    public void setStaffSendMsg(String staffSendMsg) {
        this.staffSendMsg = staffSendMsg;
    }

    public String getPerfectMatchs() {
        return perfectMatchs;
    }

    public void setPerfectMatchs(String perfectMatchs) {
        this.perfectMatchs = perfectMatchs;
    }

    public String getExactMatchs() {
        return exactMatchs;
    }

    public void setExactMatchs(String exactMatchs) {
        this.exactMatchs = exactMatchs;
    }

    public String getSimilarityMatchs() {
        return similarityMatchs;
    }

    public void setSimilarityMatchs(String similarityMatchs) {
        this.similarityMatchs = similarityMatchs;
    }

    public String getMisMatchCount() {
        return misMatchCount;
    }

    public void setMisMatchCount(String misMatchCount) {
        this.misMatchCount = misMatchCount;
    }

    public String getSolvedCount() {
        return solvedCount;
    }

    public void setSolvedCount(String solvedCount) {
        this.solvedCount = solvedCount;
    }

    public String getUnsolvedCount() {
        return unsolvedCount;
    }

    public void setUnsolvedCount(String unsolvedCount) {
        this.unsolvedCount = unsolvedCount;
    }

    public String getActivelyInviteEvaluating() {
        return activelyInviteEvaluating;
    }

    public void setActivelyInviteEvaluating(String activelyInviteEvaluating) {
        this.activelyInviteEvaluating = activelyInviteEvaluating;
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
