package com.halilcanirez.patika.repository.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieDaoImp implements MovieDao{

    private final MovieJpaRepository movieJpaRepository;


    @Override
    public Long save(MovieEntity entity) {
        MovieEntity movieEntity = movieJpaRepository.save(entity);
        return movieEntity.getId();
    }

    @Override
    public MovieEntity retrieve(Long id) {
        Optional<MovieEntity> movieEntityOptional = movieJpaRepository.findById(id);
        if (movieEntityOptional.isPresent()){
            return movieEntityOptional.get(); }
        else{
            System.out.println("kodu doğru yaz gavat");
            throw new RuntimeException();
        }
    }

    @Override
    public void delete(Long id) {
        movieJpaRepository.deleteById(id);
    }
}
