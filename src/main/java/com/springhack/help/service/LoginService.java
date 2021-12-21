package com.springhack.help.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    String login(String mail, String password);
}
