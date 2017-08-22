package com.lft.secretgarden.link;

/**
 * Created by liufeitian on 17/6/15.
 */
public class LinkedVo {
    private String name;
    private LinkedVo next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedVo getNext() {
        return next;
    }

    public void setNext(LinkedVo next) {
        this.next = next;
    }
}
