package com.jd.impl;

import com.jd.UserInfo;
import com.jd.UserInfoDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: wangrongtao
 * Date: 15-5-31
 * Time: 下午11:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void insert(UserInfo userInfo) {
        //sqlSessionTemplate.insert("", userInfo);
        sqlSessionTemplate.insert("UserInfo.saveUserInfo", userInfo);
    }

}
