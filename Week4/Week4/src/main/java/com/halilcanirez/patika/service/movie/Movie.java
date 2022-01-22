package com.halilcanirez.patika.service.movie;

import com.homework3.Genre;
import com.homework3.repository.movie_repo.MovieEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Movie {
    private String name;
    private Genre genre;
    private String releaseYear;
    private String director;

    public MovieEntity convertToMovieEntity(){
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setName(name);
        movieEntity.setDirector(director);
        movieEntity.setReleaseYear(releaseYear);
        movieEntity.setGenre(genre);
        return movieEntity;
    }

    public static Movie convertfromMovieEntity(MovieEntity entity){
        return Movie.builder()
                .name(entity.getName())
                .genre(entity.getGenre())
                .releaseYear(entity.getReleaseYear())
                .director(entity.getDirector())
                .build();
    }
}
