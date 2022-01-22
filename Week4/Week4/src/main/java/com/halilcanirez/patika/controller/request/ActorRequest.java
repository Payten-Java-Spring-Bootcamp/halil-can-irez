package com.halilcanirez.patika.controller.request;

import com.halilcanirez.patika.service.actor.Actor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Setter
public class ActorRequest {

    @NotNull
    private String name;

    @NotBlank
    private LocalDateTime birthDate;

    public Actor convertToActor(){
        Actor actor = new Actor();
        actor.setName(name);
        actor.setBirthDate(birthDate);
        return actor;

    }
}
