package dev.code.Helloworld.utils;

import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;

@Component
public class JwtUtil {
    private final String SECRET = "Dharshana";
    private final long EXPIRATION = 1000 * 60;
    private final Key securityKey= Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
}
