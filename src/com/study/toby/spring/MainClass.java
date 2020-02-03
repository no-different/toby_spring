package com.study.toby.spring;

import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //git test

        UserDao userDao = new DaoFactory().userDao();

        User dUser = new User();
        dUser.setId("duser");
        dUser.setName("정용준");
        dUser.setPassword("password");

        userDao.add(dUser);

        System.out.println("dUser.getId = " + dUser.getId());

        User findDUser = userDao.get(dUser.getId());
        System.out.println("dUser = " + findDUser.getId());

    }
}
