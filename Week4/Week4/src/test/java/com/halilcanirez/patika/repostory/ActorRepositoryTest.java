package com.halilcanirez.patika.repostory;



import com.halilcanirez.patika.BaseIntegrationTest;
import com.halilcanirez.patika.repository.actor.ActorDao;
import com.halilcanirez.patika.repository.actor.ActorEntity;
import com.halilcanirez.patika.repository.actor.ActorRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorRepositoryTest extends BaseIntegrationTest {

    @Autowired
    ActorDao actorDao;

    @Autowired
    ActorRepository repository;

    @AfterAll
    public void tearDown() {
        repository.deleteAll();
    }


    @Test
    void should_actordao_create_actor_in_db(){

        // given
        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setId(1L);
        actorEntity.setName("denemelik actor");
        actorEntity.setBirthDate(LocalDateTime.of(2022, 1 ,21,12,00,00));

        //when
        actorDao.create(actorEntity);

       //then

       Optional<ActorEntity> searchEntity = repository.findById(1L);

        assertThat(searchEntity).isPresent();
        assertThat(searchEntity.get().getName()).isEqualTo(actorEntity.getName());
        assertThat(searchEntity.get().getId()).isEqualTo(actorEntity.getId());
        assertThat(searchEntity.get().getBirthDate()).isEqualTo(actorEntity.getBirthDate());






    }




}
