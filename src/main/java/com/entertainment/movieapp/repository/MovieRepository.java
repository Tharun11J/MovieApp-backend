package com.entertainment.movieapp.repository;

import com.entertainment.movieapp.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    // Custom query methods can be added here if needed
}
