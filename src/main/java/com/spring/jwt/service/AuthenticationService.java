package com.spring.jwt.service;

import com.spring.jwt.dao.request.SignUpRequest;
import com.spring.jwt.dao.request.SigninRequest;
import com.spring.jwt.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}