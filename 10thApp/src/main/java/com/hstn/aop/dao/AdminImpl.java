package com.hstn.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AdminImpl implements AdminDAO {

    @Override
    public int addAdmin() {
        System.out.println("22222222222222222222222");
        System.out.println(getClass() + ": add user data from admin");
        return 8;
    }
}
