package com.halilcanirez.patika.service.actor;

import com.halilcanirez.patika.repository.actor.ActorEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Actor {

    private String name;
    private LocalDateTime birthDate;

    public ActorEntity convertToActorEntity() {
        ActorEntity entity = new ActorEntity();
        entity.setName(name);
        entity.setBirthDate(birthDate);
        return entity;
    }
}
