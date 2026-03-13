package dev.code.Helloworld.utils;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private final String SECRET = "Dharshana";
    private final long EXPIRATION = 1000 * 60;

}
