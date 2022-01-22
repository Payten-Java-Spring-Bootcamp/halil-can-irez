package com.halilcanirez.patika.service.rate;

import com.halilcanirez.patika.repository.movie.MovieDao;
import com.halilcanirez.patika.repository.movie.MovieEntity;
import com.halilcanirez.patika.repository.rate.RateDao;
import com.halilcanirez.patika.repository.rate.RateEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RateServiceImp implements RateService{

    private final MovieDao movieDao;
    private final RateDao rateDao;

    @Override
    public Rate giveRate(Rate rate) {

        MovieEntity movie = movieDao.retrieve(rate.getMovieId());
        RateEntity rateEntity = rate.convertToRateEntity(movie);
        return Rate.convertFromRateEntity(
                rateDao.giveRate(rateEntity));

    }

    @Override
    public Set<Rate> retriveByMovieId(Long movieId) {
        MovieEntity movieEntity = movieDao.retrieve(movieId);
        Set<RateEntity> rateEntities=  movieEntity.getRates();
        return rateEntities.stream()
                .map(rateEntity -> Rate.convertFromRateEntity(rateEntity))
                .collect(Collectors.toSet());
    }

    @Override
    public List<Rate> retriveByMovieIdv2(Long movieId) {
        return rateDao.retriveByMovieId(movieId).stream()
                .map(rateEntity -> Rate.convertFromRateEntity(rateEntity))
                .collect(Collectors.toList());
    }
}
