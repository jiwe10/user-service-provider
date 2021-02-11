package com.lvm.gmall.bean;

import java.io.Serializable;

/**
 *
 * 123456
 * */
public class UserAddress implements Serializable {

    private String userId;
    private String userAddress;

    public UserAddress() {
    }

    public UserAddress(String userId, String userAddress) {
        this.userId = userId;
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "gerUserAddress{" +
                "userId='" + userId + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
