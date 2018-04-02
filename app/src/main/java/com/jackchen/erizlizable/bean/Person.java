package com.jackchen.erizlizable.bean;

import java.io.Serializable;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/4/2 15:40
 * Version 1.0
 * Params:
 * Description:
*/
public class Person implements Serializable {

    private static final long serialVersionUID = -6919461967497580385L;

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
