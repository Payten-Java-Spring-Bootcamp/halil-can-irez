package com.halilcanirez.patika.repository.movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJpaRepository extends JpaRepository<MovieEntity,Long> {
}
