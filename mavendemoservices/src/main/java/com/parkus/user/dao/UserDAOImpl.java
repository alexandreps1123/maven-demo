package com.parkus.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.parkus.user.dto.User;

public class UserDAOImpl implements UserDAO{
    
    Map<Integer, User> users = new HashMap<Integer,User>();

    @Override
    public void create(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User read(int id) {
        return users.get(id);
    }
}
