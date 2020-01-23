package dao;

import models.Users;

import java.util.List;

public interface userDao {

    void add(Users users);

    List<Users> getAll();

    Users findUserById(int id);

    void deleteUserById(int id);

    void clearAll();
}
