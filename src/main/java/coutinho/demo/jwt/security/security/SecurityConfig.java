package coutinho.demo.jwt.security.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    public static void setPREFIX(String prefix) {
        PREFIX = prefix;
    }

    public static void setKEY(String key) {
        KEY = key;
    }

    public static void setEXPIRATION(Long expiration) {
        EXPIRATION = expiration;
    }
}
