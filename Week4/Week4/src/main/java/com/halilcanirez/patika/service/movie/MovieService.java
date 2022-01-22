package com.halilcanirez.patika.service.movie;

public interface MovieService {

    Long saveMovie(Movie movie);
    Movie retrieve(Long id);
     void delete(Long id);


}
