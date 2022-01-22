package com.halilcanirez.patika.repository.rate;

import java.util.List;

public interface RateDao {
    RateEntity giveRate(RateEntity entity);
    List<RateEntity> retriveByMovieId(Long movieId);
}
