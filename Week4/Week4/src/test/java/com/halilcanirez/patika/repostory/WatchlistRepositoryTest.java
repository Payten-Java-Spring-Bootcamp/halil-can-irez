package com.halilcanirez.patika.repostory;

import com.halilcanirez.patika.BaseIntegrationTest;
import com.halilcanirez.patika.repository.watchlist.WatchlistDao;
import com.halilcanirez.patika.repository.watchlist.WatchlistEntity;
import com.halilcanirez.patika.repository.watchlist.WatchlistJpaRepository;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class WatchlistRepositoryTest extends BaseIntegrationTest {

    @Autowired
    WatchlistDao watchlistDao;

    @Autowired
    WatchlistJpaRepository repository;

    @AfterAll
    public void tearDown() {
        repository.deleteAll();
    }


    @Test
    void should_actordao_create_actor_in_db(){

        // given
        WatchlistEntity watchlistEntity = new WatchlistEntity();
        watchlistEntity.setId(1001L);
        watchlistEntity.setName("yeni");
        watchlistEntity.setMemberId(1001L);

        //when
        watchlistDao.createWatchlist(watchlistEntity);

       //then

       Optional<WatchlistEntity> searchEntity = repository.findById(1L);

        assertThat(searchEntity).isPresent();
        assertThat(searchEntity.get().getName()).isEqualTo(watchlistEntity.getName());
        assertThat(searchEntity.get().getId()).isEqualTo(watchlistEntity.getId());
        assertThat(searchEntity.get().getMemberId()).isEqualTo(watchlistEntity.getMemberId());


    }




}
