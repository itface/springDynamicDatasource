package com.jd.impl;

import com.jd.AddressInfoService;
import com.jd.UserInfo;
import com.jd.UserInfoDao;
import com.jd.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wangrongtao on 15/6/1.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Resource
    private AddressInfoService addressInfoService;

    @Transactional
    public void save(String userName) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfoDao.insert(userInfo);
        addressInfoService.save("bei jing");
    }
}
