package com.demo;

public class MysqlRepository implements IRepository {
    public void save(String data) {
        System.out.println("the " + data + " save to mysql!");
    }
}
