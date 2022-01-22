package com.halilcanirez.patika.repository.rate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateDaoImp implements  RateDao{

    private final RateRepository rateRepository;

    @Override
    public RateEntity giveRate(RateEntity entity) {

        return rateRepository.save(entity);
    }

    @Override
    public List<RateEntity> retriveByMovieId(Long movieId) {
        return rateRepository.findAllByMovieId(movieId);

    }
}
