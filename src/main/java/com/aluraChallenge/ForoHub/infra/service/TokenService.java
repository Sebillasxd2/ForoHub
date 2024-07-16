package com.aluraChallenge.ForoHub.infra.service;

import com.aluraChallenge.ForoHub.domain.user.User;

public interface TokenService {
    String getToken(User user);
    String getSubject(String token);
}
