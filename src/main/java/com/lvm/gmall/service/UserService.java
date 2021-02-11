package com.lvm.gmall.service;


import com.lvm.gmall.bean.UserAddress;

import java.util.List;


public interface UserService {

    List<UserAddress> gerUserAddressList(String userId) throws InterruptedException;
}
