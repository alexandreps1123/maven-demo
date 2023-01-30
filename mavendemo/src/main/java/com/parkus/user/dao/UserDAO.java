package com.parkus.user.dao;

import com.parkus.user.dto.User;

public interface UserDAO {
    void create(User user);
    User read(int id);
}
