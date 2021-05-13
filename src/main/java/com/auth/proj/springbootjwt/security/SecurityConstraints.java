package com.auth.proj.springbootjwt.security;

public class SecurityConstraints {

    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000;
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/login";
    public static final String STATUS_URL = "/status";
}
