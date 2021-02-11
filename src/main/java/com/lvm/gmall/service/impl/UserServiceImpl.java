package com.lvm.gmall.service.impl;

import com.lvm.gmall.bean.UserAddress;
import com.lvm.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> gerUserAddressList(String userId) throws InterruptedException {

        System.out.println("================new===========");
        UserAddress userAddress1 = new UserAddress("1", "重庆市1");
        UserAddress userAddress2 = new UserAddress("2", "重庆市2");

        Thread.sleep(5000);
        return Arrays.asList(userAddress1, userAddress2);
    }


}
