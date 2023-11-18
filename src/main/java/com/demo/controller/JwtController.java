package com.demo.controller;

import com.demo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jwt-decoder")
public class JwtController {

    private final JwtService jwtService;

    @Autowired
    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping(value = "/decode", consumes = "text/plain")
    public String decodeJwt(@RequestBody String jwt) {
        return jwtService.decodeJwt(jwt);
    }
}
