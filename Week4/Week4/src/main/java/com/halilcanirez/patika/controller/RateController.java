package com.halilcanirez.patika.controller;


import com.halilcanirez.patika.controller.request.RateRequest;
import com.halilcanirez.patika.controller.response.RateResponse;
import com.halilcanirez.patika.controller.response.RateResponseList;
import com.halilcanirez.patika.service.movie.MovieService;
import com.halilcanirez.patika.service.rate.Rate;
import com.halilcanirez.patika.service.rate.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;


@RestController
@RequiredArgsConstructor
public class RateController {
    private final RateService rateService;
    private final MovieService movieService;

    @PostMapping("/rate")
    @ResponseStatus(HttpStatus.CREATED)
    public RateResponse giveRate(@RequestBody @Valid RateRequest request){

       Rate rate = rateService.giveRate(request.convertToRate());
       return RateResponse.convertFromRate(rate);

    }

    @GetMapping("/rates")
    public RateResponseList retrieveByMovieId(@RequestParam Long movieId) {
        Set<Rate> rateList = rateService.retriveByMovieId(movieId);
        RateResponseList rateResponseList = new RateResponseList();
        rateResponseList.setRateResponseSet(RateResponse.convertRateResponseListfromRateList(rateList));
        return  rateResponseList;
    }

    /*
    @GetMapping("/rates")
    public List<RateResponse> retrieveByMovieId(@RequestParam Long movieId) {
        List<Rate> rateList = rateService.retriveByMovieIdv2(movieId);
        return RateResponse.convertRateResponseListfromRateListv2(rateList);
    } */

}
