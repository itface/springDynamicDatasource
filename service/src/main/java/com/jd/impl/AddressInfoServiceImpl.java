package com.jd.impl;

import com.jd.AddressInfo;
import com.jd.AddressInfoDao;
import com.jd.AddressInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wangrongtao on 15/6/2.
 */
@Service
public class AddressInfoServiceImpl implements AddressInfoService {
    @Resource
    private AddressInfoDao addressInfoDao;
    @Override
    @Transactional
    public void save(String address) {
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setAddress(address);
        addressInfoDao.insert(addressInfo);
    }
}
