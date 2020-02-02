package com.study.toby.spring;

import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dUserDao = new DUserDao();

        User dUser = new User();
        dUser.setId("duser");
        dUser.setName("정용준");
        dUser.setPassword("password");

        dUserDao.add(dUser);

        System.out.println("dUser.getId = " + dUser.getId());

        User findDUser = dUserDao.get(dUser.getId());
        System.out.println("dUser = " + findDUser.getId());

        UserDao nUserDao = new NUserDao();

        User nUser = new User();
        nUser.setId("nuser");
        nUser.setName("정용준");
        nUser.setPassword("password");

        nUserDao.add(nUser);

        System.out.println("nUser.getId = " + nUser.getId());

        User findNUser = nUserDao.get(nUser.getId());
        System.out.println("nUser = " + findNUser.getId());


    }
}
