package com.halilcanirez.patika.repository.actor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorDaoImp implements ActorDao{

    private final ActorRepository actorRepository;

    @Override
    public void create(ActorEntity actorEntity) {
        actorRepository.save(actorEntity);
    }
}
