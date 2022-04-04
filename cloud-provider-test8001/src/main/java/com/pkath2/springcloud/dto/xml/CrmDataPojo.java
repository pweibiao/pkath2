package com.pkath2.springcloud.dto.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * CRM数据
 */
public class CrmDataPojo {

    /**
     * 访客的唯一值
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String visitorId;

    /**
     * 客户类别
     */
    @JacksonXmlProperty(localName = "category")
    private String category;

    /**
     * 客户姓名
     */
    @JacksonXmlProperty(localName = "name")
    private String name;

    /**
     * 客户的昵称
     */
    @JacksonXmlProperty(localName = "nickName")
    private String nickName;

    /**
     * 性别， 0-未知， 1-男， 2-女
     */
    @JacksonXmlProperty(localName = "gender")
    private String gender;

    /**
     * 年龄
     */
    @JacksonXmlProperty(localName = "age")
    private String age;

    /**
     * 客户生日
     */
    @JacksonXmlProperty(localName = "birthday")
    private String birthday;

    /**
     * 婚姻状况 1：未婚 2：已婚 0：未知
     */
    @JacksonXmlProperty(localName = "maritalStatus")
    private String maritalStatus;

    /**
     * 客户电话号码
     */
    @JacksonXmlProperty(localName = "phone")
    private String phone;

    /**
     * 客户qq号码
     */
    @JacksonXmlProperty(localName = "qq")
    private String qq;

    /**
     * 客户微信号
     */
    @JacksonXmlProperty(localName = "wechat")
    private String wechat;

    /**
     * 客户邮箱地址
     */
    @JacksonXmlProperty(localName = "email")
    private String email;

    /**
     * 客户所在国家
     */
    @JacksonXmlProperty(localName = "nation")
    private String nation;

    /**
     * 客户所在省份
     */
    @JacksonXmlProperty(localName = "province")
    private String province;

    /**
     * 客户所在城市
     */
    @JacksonXmlProperty(localName = "city")
    private String city;

    /**
     * 客户地址
     */
    @JacksonXmlProperty(localName = "address")
    private String address;

    /**
     * 客户头像地址
     */
    @JacksonXmlProperty(localName = "photo")
    private String photo;

    /**
     * 自定义字段1
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c1;

    /**
     * 自定义字段2
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c2;

    /**
     * 自定义字段3
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c3;

    /**
     * 自定义字段4
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c4;

    /**
     * 自定义字段5
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c5;

    /**
     * 自定义字段6
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c6;

    /**
     * 自定义字段7
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c7;

    /**
     * 自定义字段8
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c8;

    /**
     * 自定义字段9
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c9;

    /**
     * 自定义字段10
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c10;

    /**
     * 自定义字段11
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c11;

    /**
     * 自定义字段12
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c12;

    /**
     * 自定义字段13
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c13;

    /**
     * 自定义字段14
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c14;

    /**
     * 自定义字段15
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c15;

    /**
     * 自定义字段16
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c16;

    /**
     * 自定义字段17
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c17;

    /**
     * 自定义字段18
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c18;

    /**
     * 自定义字段19
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c19;

    /**
     * 自定义字段20
     */
    @JacksonXmlProperty(localName = "visitorId")
    private String c20;

    /**
     * 客户信息备注
     */
    @JacksonXmlProperty(localName = "memo")
    private String memo;

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
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

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getC6() {
        return c6;
    }

    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getC7() {
        return c7;
    }

    public void setC7(String c7) {
        this.c7 = c7;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public String getC12() {
        return c12;
    }

    public void setC12(String c12) {
        this.c12 = c12;
    }

    public String getC13() {
        return c13;
    }

    public void setC13(String c13) {
        this.c13 = c13;
    }

    public String getC14() {
        return c14;
    }

    public void setC14(String c14) {
        this.c14 = c14;
    }

    public String getC15() {
        return c15;
    }

    public void setC15(String c15) {
        this.c15 = c15;
    }

    public String getC16() {
        return c16;
    }

    public void setC16(String c16) {
        this.c16 = c16;
    }

    public String getC17() {
        return c17;
    }

    public void setC17(String c17) {
        this.c17 = c17;
    }

    public String getC18() {
        return c18;
    }

    public void setC18(String c18) {
        this.c18 = c18;
    }

    public String getC19() {
        return c19;
    }

    public void setC19(String c19) {
        this.c19 = c19;
    }

    public String getC20() {
        return c20;
    }

    public void setC20(String c20) {
        this.c20 = c20;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
