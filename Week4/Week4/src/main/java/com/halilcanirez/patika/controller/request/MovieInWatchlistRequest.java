package com.halilcanirez.patika.controller.request;



import com.halilcanirez.patika.service.watchlist.MoviesInWatchlist;
import lombok.Getter;


@Getter
public class MovieInWatchlistRequest {


    private Long watchlistId;

    private Long movieId;

    public MoviesInWatchlist convertToMovieInWatchlist(){
        MoviesInWatchlist watchlist = new MoviesInWatchlist();
        watchlist.setWatchlistId(watchlistId);
        watchlist.setMovieID(movieId);
        return watchlist;
    }
}
