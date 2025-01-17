package com.project.url_shortener.controller;

import com.project.url_shortener.dto.ShortenUrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @PostMapping("/shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest request) {

        return ResponseEntity.ok().build();
    }
}
