package com.tjhq.business.demo.po;

import java.io.Serializable;

public class Agency implements Serializable {
    //
    private String name;
    private String code;
    private String guid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
