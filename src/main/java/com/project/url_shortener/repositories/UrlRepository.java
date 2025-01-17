package com.project.url_shortener.repositories;

import com.project.url_shortener.entities.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String> {
}
