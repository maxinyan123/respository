package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDaoImpl implements IndexDao {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println(name);
        System.out.println("index");
    }
}
