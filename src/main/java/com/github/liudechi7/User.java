package com.github.liudechi7;

/**
 * @author liuchi
 */
public class User {
    private String name;
    private int id;
    public User(String myName, int  myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}