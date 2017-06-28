package com.example.user.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestUser {

    User user;

    @Before
    public void before() {
        user = new User("Eddie");
    }

    @Test
    public void checkGetName() {
        assertEquals("Eddie", user.getName());
    }
}
