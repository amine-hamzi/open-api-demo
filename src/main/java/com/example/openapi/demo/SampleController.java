package com.example.openapi.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping("/sample")
    public ResponseEntity<String> sampleResource() {
        return ResponseEntity.ok("sample");
    }
}


