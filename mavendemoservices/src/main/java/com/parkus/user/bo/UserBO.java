package com.parkus.user.bo;

import com.parkus.user.dto.User;

public interface UserBO {
    void create(User user);
    User findUser(int id);
}
