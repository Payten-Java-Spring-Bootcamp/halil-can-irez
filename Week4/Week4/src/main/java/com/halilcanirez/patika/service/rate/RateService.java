package com.halilcanirez.patika.service.rate;

import java.util.List;
import java.util.Set;

public interface RateService {
    Rate giveRate(Rate rate);

    Set<Rate> retriveByMovieId(Long movieId);

    List<Rate> retriveByMovieIdv2(Long movieId);
}
