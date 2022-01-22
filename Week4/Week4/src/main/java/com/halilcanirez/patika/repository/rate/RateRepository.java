package com.halilcanirez.patika.repository.rate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RateRepository extends JpaRepository<RateEntity,Long> {
        List<RateEntity> findAllByMovieId(Long movieId);
}
