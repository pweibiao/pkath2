package com.pkath2.springcloud.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 访客数据
 */
//@XmlRootElement(name = "visitorData")
//@XmlAccessorType(XmlAccessType.NONE)
@JacksonXmlRootElement(localName = "visitorData")
public class VisitorDataDto implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * 访客进入的时间
     */
    @JacksonXmlProperty(localName = "visitorEnterTime")
    private String visitorEnterTime;

    /**
     * 客户端的媒介
     * 1-PC网页， 2-手机网页, 5-微信, 6-sdk, 200-自定义渠道
     */
    @JacksonXmlProperty(localName = "visitorMedia")
    private String visitorMedia;

    /**
     * 访客身份类型
     * -1未知， 0-游客(web)， 1-会员(vip)，
     * 2-SDK游客(sdk)， 4-微信（wechat)， 5-自定义接口(custom)
     */
    @JacksonXmlProperty(localName = "visitorType")
    private String visitorType;

    /**
     * visitorType==5时，此值有效，
     * 访客身份类型为自定义接口时，值为自定义渠道的渠道ID
     */
    @JacksonXmlProperty(localName = "mediaId")
    private String mediaId;

    /**
     * 访客ID，身份描述+ID
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String visitorId;

    /**
     * 访客的姓名
     */
    @JacksonXmlProperty(localName = "visitorName")
    private String visitorName;

    /**
     * 访客的头像 例如：http://wx.qlogo.cn/mmopen/WncXm
     */
    @JacksonXmlProperty(localName = "visitorPhoto")
    private String visitorPhoto;

    /**
     * 访客来访的次数
     */
    @JacksonXmlProperty(localName = "visitTimes")
    private String visitTimes;

    /**
     * 访问者的语言
     */
    @JacksonXmlProperty(localName = "visitorLan")
    private String visitorLan;

    /**
     * 访客的来访IP
     */
    @JacksonXmlProperty(localName = "visitorIp")
    private String visitorIp;

    /**
     * 访客所在国家
     */
    @JacksonXmlProperty(localName = "visitorCountry")
    private String visitorCountry;

    /**
     * 访客所在省份
     */
    @JacksonXmlProperty(localName = "visitorProvince")
    private String visitorProvince;

    /**
     * 访客所在城市
     */
    @JacksonXmlProperty(localName = "visitorCity")
    private String visitorCity;

    /**
     * 访客的浏览器
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "browserName")
    private String browserName;

    /**
     * 访客的浏览器版本
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "browserVersion")
    private String browserVersion;

    /**
     * 访客的屏幕分辨率
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "screenResolution")
    private String screenResolution;

    /**
     * 访客操作系统
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "osName")
    private String osName;

    /**
     * 操作系统版本
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "osVersion")
    private String osVersion;

    /**
     * 访客来访的搜索引擎
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "se")
    private String se;

    /**
     * 访客来访的搜索关键字
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "keyword")
    private String keyword;

    /**
     * 推广词
     *  例如：一洽软件
     */
    @JacksonXmlProperty(localName = "biddingWord")
    private String biddingWord;

    /**
     * 关键字状态
     * 0：未区分SEO、推广
     * 1：自然优化
     * 2： 推广
     */
    @JacksonXmlProperty(localName = "keywordType")
    private String keywordType;

    /**
     * 访客来源的URL
     *  如微信，则现已公众号名 例如：http: // www.baidu.com/baidu.php?sc.WwCK00j7A0GeyEPIcgU
     */
    @JacksonXmlProperty(localName = "referPage")
    private String referPage;

    /**
     * 进入网站的时间
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "firstTime")
    private String firstTime;

    /**
     * 落地页 第一页
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "firstPage")
    private String firstPage;

    /**
     * 落地页面的标题
     *  微信对话无此属性
     */
    @JacksonXmlProperty(localName = "firstPageTitle")
    private String firstPageTitle;

    /**
     * 上次对话的客服ID
     */
    @JacksonXmlProperty(localName = "lastChatStaffId")
    private String lastChatStaffId;

    /**
     * 上次对话的时间
     */
    @JacksonXmlProperty(localName = "lastChatTime")
    private String lastChatTime;

    /**
     * 上次对话的客服账号
     */
    @JacksonXmlProperty(localName = "lastChatStaffLogname")
    private String lastChatStaffLogname;

    /**
     * 上次对话的客服姓名
     */
    @JacksonXmlProperty(localName = "lastChatStaffName")
    private String lastChatStaffName;

    public String getVisitorEnterTime() {
        return visitorEnterTime;
    }

    public void setVisitorEnterTime(String visitorEnterTime) {
        this.visitorEnterTime = visitorEnterTime;
    }

    public String getVisitorMedia() {
        return visitorMedia;
    }

    public void setVisitorMedia(String visitorMedia) {
        this.visitorMedia = visitorMedia;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorPhoto() {
        return visitorPhoto;
    }

    public void setVisitorPhoto(String visitorPhoto) {
        this.visitorPhoto = visitorPhoto;
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    public String getVisitorLan() {
        return visitorLan;
    }

    public void setVisitorLan(String visitorLan) {
        this.visitorLan = visitorLan;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public String getVisitorCountry() {
        return visitorCountry;
    }

    public void setVisitorCountry(String visitorCountry) {
        this.visitorCountry = visitorCountry;
    }

    public String getVisitorProvince() {
        return visitorProvince;
    }

    public void setVisitorProvince(String visitorProvince) {
        this.visitorProvince = visitorProvince;
    }

    public String getVisitorCity() {
        return visitorCity;
    }

    public void setVisitorCity(String visitorCity) {
        this.visitorCity = visitorCity;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getBiddingWord() {
        return biddingWord;
    }

    public void setBiddingWord(String biddingWord) {
        this.biddingWord = biddingWord;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType;
    }

    public String getReferPage() {
        return referPage;
    }

    public void setReferPage(String referPage) {
        this.referPage = referPage;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(String firstPage) {
        this.firstPage = firstPage;
    }

    public String getFirstPageTitle() {
        return firstPageTitle;
    }

    public void setFirstPageTitle(String firstPageTitle) {
        this.firstPageTitle = firstPageTitle;
    }

    public String getLastChatTime() {
        return lastChatTime;
    }

    public void setLastChatTime(String lastChatTime) {
        this.lastChatTime = lastChatTime;
    }

    public String getLastChatStaffId() {
        return lastChatStaffId;
    }

    public void setLastChatStaffId(String lastChatStaffId) {
        this.lastChatStaffId = lastChatStaffId;
    }

    public String getLastChatStaffLogname() {
        return lastChatStaffLogname;
    }

    public void setLastChatStaffLogname(String lastChatStaffLogname) {
        this.lastChatStaffLogname = lastChatStaffLogname;
    }

    public String getLastChatStaffName() {
        return lastChatStaffName;
    }

    public void setLastChatStaffName(String lastChatStaffName) {
        this.lastChatStaffName = lastChatStaffName;
    }
}
