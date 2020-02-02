package com.study.toby.spring;

import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new UserDao();

        User user = new User();
        user.setId("yjjung1");
        user.setName("정용준1");
        user.setPassword("password1");

        dao.add(user);

        System.out.println("user.getId = " + user.getId());

        User user1 = dao.get(user.getId());
        System.out.println("user1 = " + user1.getId());
    }
}
