package com.tengfei.domain;

public class PartyMember {

    private int id;
    private String name;
    private String deptment;
    private String joinPartyTime;
    private String formalTime;
    private String idCard;
    private String phone;
    private String gender;
    private String address;
    private String status;
    private String imageSrc;

    @Override
    public String toString() {
        return "PartyMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptment='" + deptment + '\'' +
                ", joinPartyTime='" + joinPartyTime + '\'' +
                ", formalTime='" + formalTime + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }

    public String getJoinPartyTime() {
        return joinPartyTime;
    }

    public void setJoinPartyTime(String joinPartyTime) {
        this.joinPartyTime = joinPartyTime;
    }

    public String getFormalTime() {
        return formalTime;
    }

    public void setFormalTime(String formalTime) {
        this.formalTime = formalTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public PartyMember() {
    }

    public PartyMember(int id, String name, String deptment, String joinPartyTime, String formalTime, String idCard, String phone, String gender, String address, String status, String imageSrc) {
        this.id = id;
        this.name = name;
        this.deptment = deptment;
        this.joinPartyTime = joinPartyTime;
        this.formalTime = formalTime;
        this.idCard = idCard;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.status = status;
        this.imageSrc = imageSrc;
    }
}
