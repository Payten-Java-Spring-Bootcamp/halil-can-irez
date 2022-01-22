package com.halilcanirez.patika.service.movie;

import com.halilcanirez.patika.repository.movie.MovieDao;
import com.halilcanirez.patika.repository.movie.MovieEntity;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@EqualsAndHashCode
public class MovieServiceImp implements MovieService{

    private final MovieDao movieDao;

    @Override
    public Long saveMovie(Movie movie) {
        MovieEntity movieEntity=movie.convertToMovieEntity();
        return  movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Long id) {

       return  Movie.convertfromMovieEntity(movieDao.retrieve(id));
    }

    @Override
    public void delete(Long id) {

        movieDao.delete(id);
    }

}
