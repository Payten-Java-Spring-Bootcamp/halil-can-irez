package com.halilcanirez.patika.controller;

import com.halilcanirez.patika.BaseIntegrationTest;
import com.halilcanirez.patika.Genre;
import com.halilcanirez.patika.controller.response.MovieResponse;
import com.halilcanirez.patika.repository.movie.MovieJpaRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;



import static org.assertj.core.api.Assertions.assertThat;

class MovieControllerTest extends BaseIntegrationTest {



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
         movieJpaRepository.deleteAll();
    }

    @Test
    @Sql(scripts = "/movie-create.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    void retrive_movie () {

        // given

        // when

        ResponseEntity<MovieResponse> response = testRestTemplate.getForEntity("/movie/1", MovieResponse.class);


        // then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody()).isNotNull();

        assertThat(response.getBody())
                .extracting("director", "genre", "name")
                .containsExactly("test director", Genre.ADVANTURE,"test movie");





    }




}
