package com.halilcanirez.patika.service.watchlist;



public interface SWatchlistService {

    void createWatchlist(SWatchlist watchlist);

    void saveMovieInWatchlist(MoviesInWatchlist entity);

}
