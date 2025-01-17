package com.project.url_shortener.controlleres;

import com.project.url_shortener.dtos.ShortenUrlDto;
import com.project.url_shortener.services.UrlService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten-url")
    public ResponseEntity<ShortenUrlDto> shortenUrl(@RequestBody ShortenUrlDto request,
                                           HttpServletRequest servletRequest) {
        return urlService.shortenUrl(request, servletRequest);
    }

    @GetMapping("{id}")
    public ResponseEntity<Void> redirect(@PathVariable("id") String id) {
        return urlService.redirectUrl(id);
    }
}
