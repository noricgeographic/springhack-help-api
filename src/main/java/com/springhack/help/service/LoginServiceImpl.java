package com.springhack.help.service;

import com.springhack.help.Accessor.S3Accessor;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final S3Accessor s3Accessor;

    public LoginServiceImpl(S3Accessor s3Accessor) {
        this.s3Accessor = s3Accessor;
    }

    public String login(String mail, String password) {
        String file = s3Accessor.get("foo", "bar");
        return file;
    }
}
