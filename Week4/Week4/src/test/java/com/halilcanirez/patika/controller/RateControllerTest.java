package com.halilcanirez.patika.controller;

import com.halilcanirez.patika.BaseIntegrationTest;
import com.halilcanirez.patika.controller.request.RateRequest;
import com.halilcanirez.patika.controller.response.RateResponse;
import com.halilcanirez.patika.repository.movie.MovieJpaRepository;
import com.halilcanirez.patika.repository.rate.RateEntity;
import com.halilcanirez.patika.repository.rate.RateRepository;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


class RateControllerTest extends BaseIntegrationTest {

    @Autowired
    RateRepository rateRepository;

    @Autowired
    MovieJpaRepository movieJpaRepository;
    /*
    @BeforeEach
    void setUp() {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setId(1002L);
        movieEntity.setName("test movie");
        movieEntity.setDirector("test director");
        movieEntity.setGenre(Genre.ADVANTURE);
        movieEntity.setReleaseYear("2001");
        movieJpaRepository.save(movieEntity);
    }
    */


    @AfterEach
    void tearDown() {
        rateRepository.deleteAll();
        movieJpaRepository.deleteAll();
    }

    @Test
    @Sql(scripts = "/movie-create.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    void should_give_point_movie_and_create_rate_entity_in_db() {

        // given
        RateRequest request= new RateRequest();
        request.setMemberId(2L);
        request.setMovieId(1L);
        request.setPoint(5);
        // when

        ResponseEntity<RateResponse> response = testRestTemplate.postForEntity("/rate", request, RateResponse.class);


        // then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isNotNull();

        Optional<RateEntity> rateEntity =  rateRepository.findById(response.getBody().getId());
        assertThat(rateEntity).isPresent();

    }




}
