package com.jd.impl;

import com.jd.AddressInfo;
import com.jd.AddressInfoDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by wangrongtao on 15/6/2.
 */
@Repository
public class AddressInfoDaoImpl implements AddressInfoDao {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void insert(AddressInfo addressInfo) {
        sqlSessionTemplate.insert("AddressInfo.saveAddressInfo", addressInfo);
    }
}
