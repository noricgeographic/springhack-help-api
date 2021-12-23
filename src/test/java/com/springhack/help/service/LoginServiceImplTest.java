package com.springhack.help.service;

import com.springhack.help.accessor.S3Accessor;
import com.springhack.help.accessor.S3AccessorImpl;
import com.springhack.help.mock.accessor.S3AccessorImplMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginServiceImplTest {

    /**
     * テスト条件：XXX
     * 期待値：YYY
     */
    @Test
    public void login1() {
        var s3Accessor = new S3AccessorImpl();
        var loginServiceImpl = new LoginServiceImpl(s3Accessor);
        String login = loginServiceImpl.login("foo", "bar");

        System.out.println(login);
    }

    /**
     * テスト条件：XXX
     * 期待値：YYY
     */
    @Test
    public void login2() {
        var s3Accessor = new S3AccessorImplMock();
        var loginServiceImpl = new LoginServiceImpl(s3Accessor);
        String login = loginServiceImpl.login("foo", "bar");

        System.out.println(login);
    }
}
