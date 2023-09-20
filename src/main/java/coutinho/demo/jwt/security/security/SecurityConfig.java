package coutinho.demo.jwt.security.security;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    public static String PREFIX = "Bearer";
    public static String KEY = "SECRET_KEY";
    public static Long EXPIRATION = 3600000L;

    public static String getPREFIX() {
        return PREFIX;
    }

    public static String getKEY() {
        return KEY;
    }

    public static Long getEXPIRATION() {
        return EXPIRATION;
    }

    public static void setPrefix(String prefix) {
        PREFIX = prefix;
    }

    public static void setKey(String key) {
        KEY = key;
    }

    public static void setExpiration(long expiration) {
        EXPIRATION = expiration;
    }
}
