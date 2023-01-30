package com.parkus.user.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.parkus.user.dto.User;

public class UserDAOImplTest {
    
    @Test
    public void createShouldCreateAUser() {
        UserDAO dao = new UserDAOImpl();
        User user = new User();

        user.setId(1);
        user.setName("Alberto");
        user.setEmail("alberto@email.com");

        dao.create(user);

        User result = dao.read(1);

        assertNotNull(result);
        assertEquals("Alberto", result.getName());
    }
}
