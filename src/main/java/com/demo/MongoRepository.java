package com.demo;

public class MongoRepository implements IRepository {
    public void save(String data) {
        System.out.println("the " + data + " save to mongo!");
    }
}
