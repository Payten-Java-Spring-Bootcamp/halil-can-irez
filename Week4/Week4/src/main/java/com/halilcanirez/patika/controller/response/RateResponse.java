package com.halilcanirez.patika.controller.response;

import com.halilcanirez.patika.service.rate.Rate;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Builder
public class RateResponse {

    private Long id;
    private LocalDateTime createdDate;
    private Long memberId;
    private Long movieId;
    private Integer point;


    public static RateResponse convertFromRate(Rate rate){
        return RateResponse.builder()
                .createdDate(rate.getCreatedDate())
                .movieId(rate.getMovieId())
                .memberId(rate.getMemberId())
                .point(rate.getPoint())
                .id(rate.getId())
                .build();
    }

    public static List<RateResponse> convertRateResponseListfromRateList(Set<Rate> rateList){
        return rateList.stream()
                .map(RateResponse::convertFromRate)
                //.map(rate -> convertFromRate(rate))
                .collect(Collectors.toList());
    }

    public static List<RateResponse> convertRateResponseListfromRateListv2(List<Rate> rateList){
        return rateList.stream()
                .map(RateResponse::convertFromRate)
                //.map(rate -> convertFromRate(rate))
                .collect(Collectors.toList());
    }

}
