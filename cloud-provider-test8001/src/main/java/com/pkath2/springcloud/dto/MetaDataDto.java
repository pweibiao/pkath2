package com.pkath2.springcloud.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


/**
 * 会员数据
 */
//@XmlRootElement(name = "metaData")
//@XmlAccessorType(XmlAccessType.NONE)
@JacksonXmlRootElement(localName = "metaData")
public class MetaDataDto implements Serializable {

    private static final long serialVersionUID = -1;
    /**
     * 会员的唯一值
     */
    @JacksonXmlProperty(localName = "uid")
    private String uid;

    /**
     * 会员级别，大于0
     */
    @JacksonXmlProperty(localName = "grade")
    private String grade;

    /**
     * 会员类别
     */
    @JacksonXmlProperty(localName = "category")
    private String category;

    /**
     * 会员姓名
     */
    @JacksonXmlProperty(localName = "name")
    private String name;

    /**
     * 会员的昵称
     */
    @JacksonXmlProperty(localName = "nickName")
    private String nickName;

    /**
     * 会员的性别，0-未知， 1-男， 2-女
     */
    @JacksonXmlProperty(localName = "gender")
    private String gender;

    /**
     * 会员的年龄
     */
    @JacksonXmlProperty(localName = "age")
    private String age;

    /**
     * 会员的生日
     */
    @JacksonXmlProperty(localName = "birthday")
    private String birthday;

    /**
     * 婚姻状况 1：未婚 2：已婚 0：未知
     */
    @JacksonXmlProperty(localName = "maritalStatus")
    private String maritalStatus;

    /**
     * 会员的联系电话
     */
    @JacksonXmlProperty(localName = "phone")
    private String phone ;

    /**
     * 会员的QQ
     */
    @JacksonXmlProperty(localName = "qq")
    private String qq ;

    /**
     * 会员的微信
     */
    @JacksonXmlProperty(localName = "wechat")
    private String wechat ;

    /**
     * 会员的邮件地址
     */
    @JacksonXmlProperty(localName = "email")
    private String email ;

    /**
     * 会员的国家
     */
    @JacksonXmlProperty(localName = "nation")
    private String nation ;

    /**
     * 会员的身份
     */
    @JacksonXmlProperty(localName = "province")
    private String province;

    /**
     * 会员的城市
     */
    @JacksonXmlProperty(localName = "city")
    private String city;

    /**
     * 会员地址
     */
    @JacksonXmlProperty(localName = "address")
    private String address;

    /**
     * 会员头像地址
     */
    @JacksonXmlProperty(localName = "photo")
    private String photo;

    /**
     * 会员备注信息
     */
    @JacksonXmlProperty(localName = "memo")
    private String memo;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
