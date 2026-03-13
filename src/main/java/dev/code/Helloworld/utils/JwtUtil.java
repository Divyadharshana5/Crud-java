package dev.code.Helloworld.utils;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private final String SECRET = "";
    private final long EXPIRATION = 1000*30;
}
