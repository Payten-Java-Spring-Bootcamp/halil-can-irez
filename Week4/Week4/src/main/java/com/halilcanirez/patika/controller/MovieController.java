package com.halilcanirez.patika.controller;



import com.halilcanirez.patika.controller.request.MovieRequest;
import com.halilcanirez.patika.service.movie.Movie;
import com.halilcanirez.patika.service.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class  MovieController {

    private final MovieService movieService;


    @PostMapping("/movie")
    @ResponseStatus(HttpStatus.CREATED)
    public Long addMovie(@RequestBody @Valid MovieRequest newMovie){
        Movie movie=newMovie.convertToMovie();
        return movieService.saveMovie(movie);

    }

    @GetMapping("/movie/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public MovieResponse retrieve(@PathVariable Long movieId){
          Movie movie= movieService.retrieve(movieId);
          return MovieResponse.convertFromMovie(movie);


    }

    @DeleteMapping("/movie/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        movieService.delete(id);

    }
}
