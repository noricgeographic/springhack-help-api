package com.springhack.help.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginServiceImplTest {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    /**
     * テスト条件：XXX
     * 期待値：YYY
     */
    @Test
    public void login1() {
        String login = loginServiceImpl.login("foo", "bar");
        Assertions.assertEquals(login, "expected");
    }

    /**
     * テスト条件：XXX
     * 期待値：YYY
     */
    @Test
    public void login2() {
        String login = loginServiceImpl.login("hoge", "fuga");
        Assertions.assertEquals(login, "expected");
    }
}
