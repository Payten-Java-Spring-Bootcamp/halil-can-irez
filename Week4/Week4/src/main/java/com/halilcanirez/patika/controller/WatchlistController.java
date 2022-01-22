package com.halilcanirez.patika.controller;

import com.halilcanirez.patika.controller.request.MovieInWatchlistRequest;
import com.halilcanirez.patika.controller.request.WatchlistRequest;
import com.halilcanirez.patika.service.watchlist.SWatchlistService;
import com.homework3.controller.request.MovieInWatchlistRequest;
import com.homework3.controller.request.WatchlistRequest;
import com.homework3.service.watchlist.SWatchlistService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class WatchlistController {


    private final SWatchlistService watchlistService;

    @PostMapping("/watchlist")
    public void createWatchlist(@RequestBody @Valid WatchlistRequest watchlistRequest){
        watchlistService.createWatchlist(watchlistRequest.convertToWatchlist());
    }

    @PostMapping("/addmovietowatchlist")
    public void addMovieToWatchlist(@RequestBody @Valid MovieInWatchlistRequest request){
        watchlistService.saveMovieInWatchlist(request.convertToMovieInWatchlist());
        //System.out.println(request.getMovieId());
    }
}
