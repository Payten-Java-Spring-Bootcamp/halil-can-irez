package com.halilcanirez.patika.repository.movie;

public interface MovieDao {
    Long save(MovieEntity entity);
    MovieEntity retrieve(Long id);
    void delete(Long id);
}
