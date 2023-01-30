package com.parkus.user.bo;

import com.parkus.user.dao.UserDAO;
import com.parkus.user.dao.UserDAOImpl;
import com.parkus.user.dto.User;

public class UserBOImpl implements UserBO {

    private static UserDAO dao = new UserDAOImpl();

    @Override
    public void create(User user) {
        dao.create(user);        
    }

    @Override
    public User findUser(int id) {
        return dao.read(id);
    }
    
}
