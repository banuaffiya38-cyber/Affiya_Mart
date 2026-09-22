package com.affiyamart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AFFIYA MART - Chocolate e-commerce application.
 * Tagline: "Sweet Moments. Happy Hearts. Easy Shopping."
 */
@SpringBootApplication
public class AffiyaMartApplication {

    public static void main(String[] args) {
        // Java 26 (and newer JDKs) vs Hibernate's bundled Byte Buddy:
        // without this flag Byte Buddy refuses unknown JVM versions and the
        // lazy-loading proxies would fail at runtime.
        System.setProperty("net.bytebuddy.experimental", "true");
        SpringApplication.run(AffiyaMartApplication.class, args);
    }
}
