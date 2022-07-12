package com.tengfei.domain;

public class ActiveMember {

    private int id;
    private String name;
    private String deptment;
    private String activeTime;
    private String idCard;
    private String phone;
    private String gender;
    private String address;
    private String status;
    private String imageSrc;
    private String errorCase;


    public String getErrorCase() {
        return errorCase;
    }

    public void setErrorCase(String errorCase) {
        this.errorCase = errorCase;
    }

    @Override
    public String toString() {
        return "ActiveMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptment='" + deptment + '\'' +
                ", activeTime='" + activeTime + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", errorCase='" + errorCase + '\'' +
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

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
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

    public ActiveMember() {
    }

    public ActiveMember(int id, String name, String deptment, String activeTime, String idCard, String phone, String gender, String address, String status, String imageSrc, String errorCase) {
        this.id = id;
        this.name = name;
        this.deptment = deptment;
        this.activeTime = activeTime;
        this.idCard = idCard;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.status = status;
        this.imageSrc = imageSrc;
        this.errorCase = errorCase;
    }
}
