package com.jd;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: wangrongtao
 * Date: 15-5-31
 * Time: 下午11:01
 * To change this template use File | Settings | File Templates.
 */
public class UserInfo implements Serializable{

    private int id;
    private String userName;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
