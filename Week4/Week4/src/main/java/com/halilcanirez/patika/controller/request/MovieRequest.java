package com.halilcanirez.patika.controller.request;

import com.halilcanirez.patika.Genre;
import com.halilcanirez.patika.service.movie.Movie;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String genre;

    @NotBlank
    private String releaseyear;

    @NotBlank
    private String director;

    public Movie convertToMovie(){
        return Movie.builder()
                .name(name)
                .director(director)
                .genre(Genre.valueOf(genre))
                .releaseYear(releaseyear)
                .build();
    }
}
