package com.cg.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api/test")
public class TestAPI {

    @GetMapping
    public ResponseEntity<?> getTest() {
        Map<String, String> result = new HashMap<>();
        result.put("message", "Hello world");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
