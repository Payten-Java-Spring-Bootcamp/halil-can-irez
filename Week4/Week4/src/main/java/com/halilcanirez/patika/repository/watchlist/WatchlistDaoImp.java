package com.halilcanirez.patika.repository.watchlist;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchlistDaoImp implements WatchlistDao{
    private  final WatchlistJpaRepository watchlistJpaRepository;


    @Override
    public void createWatchlist(WatchlistEntity watchlistEntity) {
        watchlistJpaRepository.save(watchlistEntity);
    }
}
