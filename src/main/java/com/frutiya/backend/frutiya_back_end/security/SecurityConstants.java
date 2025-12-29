package com.frutiya.backend.frutiya_back_end.security;

public class SecurityConstants {
    
    private SecurityConstants() {}
    
    public static final long JWT_EXPIRATION = 86400000; // 24 horas en milisegundos
    public static final String JWT_SECRET_KEY = System.getProperty(
            "JWT_SECRET_KEY",
            "404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970"
    );
}
