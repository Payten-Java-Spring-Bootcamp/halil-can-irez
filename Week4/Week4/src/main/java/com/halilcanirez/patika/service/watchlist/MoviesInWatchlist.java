package com.halilcanirez.patika.service.watchlist;

import com.halilcanirez.patika.repository.moviesinwatchlist.MoviesinWatchlistEntity;
import com.homework3.repository.moviesinwatchlist.MoviesinWatchlistEntity;
import com.homework3.repository.watchlist.WatchlistEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Setter
@Getter
public class MoviesInWatchlist {

    private Long movieID;

    private Long watchlistId;


    public MoviesinWatchlistEntity convertToMoviesInWatchlistEntity() {
        MoviesinWatchlistEntity watchlistEntity = new MoviesinWatchlistEntity();
        watchlistEntity.setMovieId(movieID);
        watchlistEntity.setWatchlistId(watchlistId);
        return watchlistEntity;
    }
}
