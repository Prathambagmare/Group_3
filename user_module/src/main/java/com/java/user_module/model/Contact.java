package com.java.user_module.model;

public class Contact {


    Long contId;
    String contName;
    long contPhoneNo;
    Long userId;

    public Contact(Long contId, String contName, long contPhoneNo, Long userId) {
        this.contId = contId;
        this.contName = contName;
        this.contPhoneNo = contPhoneNo;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public long getContPhoneNo() {
        return contPhoneNo;
    }

    public void setContPhoneNo(long contPhoneNo) {
        this.contPhoneNo = contPhoneNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
