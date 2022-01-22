package com.halilcanirez.patika.repostory;

import com.halilcanirez.patika.BaseIntegrationTest;
import com.halilcanirez.patika.repository.watchlist.WatchlistEntity;
import com.halilcanirez.patika.repository.watchlist.WatchlistJpaRepository;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class DatabaseIntegrationTest extends BaseIntegrationTest {

    @Autowired
    WatchlistJpaRepository repository;

    @AfterAll
    public void tearDown()  {
        repository.deleteAll();
    }

    @Test
    void should_save_and_fetch_watchlist(){
        // given
        WatchlistEntity watchlistEntity = new WatchlistEntity();
        watchlistEntity.setId(1001L);
        watchlistEntity.setName("yeni");
        watchlistEntity.setMemberId(1001L);

        //when
        repository.save(watchlistEntity);

        //then


       Optional<WatchlistEntity> savedEntity= repository.findById(1001L);

       assertThat(savedEntity).isPresent();


       }


}
