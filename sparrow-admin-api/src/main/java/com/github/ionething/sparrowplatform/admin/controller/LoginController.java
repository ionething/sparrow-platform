package com.github.ionething.sparrowplatform.admin.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 */
@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("login", "test");
        return ResponseEntity.ok().body(map);
    }

}
