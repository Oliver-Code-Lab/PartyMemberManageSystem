package com.tengfei.domain;

public class Manager {

    private int id;
    private String name;
    private int isSuper; // 1是，2不是
    private String workNum;
    private String password;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isSuper=" + isSuper +
                ", workNum='" + workNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Manager() {
    }

    public Manager(int id, String name, int isSuper, String workNum, String password) {
        this.id = id;
        this.name = name;
        this.isSuper = isSuper;
        this.workNum = workNum;
        this.password = password;
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

    public int getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(int isSuper) {
        this.isSuper = isSuper;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
