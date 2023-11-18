package com.demo.service;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

@Service
public class JwtService {

    public String decodeJwt(String jwt) {
        try {
            String[] splitToken = jwt.split("\\.");
            if (splitToken.length < 2) {
                return "Invalid JWT: JWT does not have enough segments";
            }

            // Decode the payload
            Base64 base64Url = new Base64(true);
            String payload = new String(base64Url.decode(splitToken[1]), StandardCharsets.UTF_8);

            return payload;
        } catch (Exception e) {
            return "Invalid JWT: " + e.getMessage();
        }
    }
}
