package com.halilcanirez.patika.controller.request;

import com.halilcanirez.patika.service.rate.Rate;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RateRequest{


   private Long memberId;

   @NotNull
   private Long movieId;

   @NotNull
   private Integer point;

    public Rate convertToRate(){
       return Rate.builder()
               .memberId(memberId)
               .movieId(movieId)
               .point(point)
               .build();
    }

}
