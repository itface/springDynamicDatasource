package com.jd;

import java.io.Serializable;

/**
 * Created by wangrongtao on 15/6/2.
 */
public class AddressInfo implements Serializable {
    private int id;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
