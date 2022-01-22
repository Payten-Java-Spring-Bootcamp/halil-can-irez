package com.halilcanirez.patika.repository.moviesinwatchlist;

import com.homework3.repository.watchlist.WatchlistDao;
import com.homework3.repository.watchlist.WatchlistEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MoviesinWatchlistDaoImp implements MoviesinWatchlistDao {
    private final MoviesinWatvhlistJpaRepo repo;

    @Override
    public void save(MoviesinWatchlistEntity entity) {
        repo.save(entity);
    }

}
