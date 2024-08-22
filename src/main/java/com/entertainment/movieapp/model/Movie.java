package com.entertainment.movieapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "movies")
@Getter
@Setter
public class Movie {

    @Id
    private String id; // MongoDB ID field, not the movie ID

    private Integer userId;
    private Integer movieId;
    private String title;
    private Boolean completed;

    public void setId(String id) {
    }
}
