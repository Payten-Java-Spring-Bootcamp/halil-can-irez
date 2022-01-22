package com.halilcanirez.patika.service.watchlist;



import com.halilcanirez.patika.repository.moviesinwatchlist.MoviesinWatchlistDao;
import com.halilcanirez.patika.repository.watchlist.WatchlistDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchlistServiceImp implements WatchlistService {

    private final WatchlistDao watchlistDao;

    private final MoviesinWatchlistDao moviesinWatchlistDao;

    @Override
    public void createWatchlist(SWatchlist watchlist) {
        watchlistDao.createWatchlist(watchlist.convertToWatchlistEntity());
    }

    @Override
    public void saveMovieInWatchlist(MoviesInWatchlist moviesinWatchlist) {
        moviesinWatchlistDao.save(moviesinWatchlist.convertToMoviesInWatchlistEntity());

    }
}
