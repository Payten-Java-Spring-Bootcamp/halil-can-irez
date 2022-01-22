package com.halilcanirez.patika.controller.response;


import com.halilcanirez.patika.Genre;
import com.halilcanirez.patika.service.movie.Movie;
import lombok.Builder;


@Builder
public class MovieResponse {

    private String name;
    private String releaseYear;
    private String director;
    private Genre genre;

    public static MovieResponse convertFromMovie(Movie movie){
        return MovieResponse.builder()
                .name(movie.getName())
                .releaseYear(movie.getReleaseYear())
                .genre(movie.getGenre())
                .director(movie.getDirector())
                .build();
        }
    }



