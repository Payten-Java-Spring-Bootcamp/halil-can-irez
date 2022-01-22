package com.halilcanirez.patika.service.watchlist;

import com.halilcanirez.patika.repository.watchlist.WatchlistEntity;
import lombok.Setter;

@Setter
public class SWatchlist {
    private String name;
    private Long memberId;

    public WatchlistEntity convertToWatchlistEntity() {
        WatchlistEntity watchlistEntity = new WatchlistEntity();
        watchlistEntity.setName(name);
        watchlistEntity.setMemberId(memberId);
        return watchlistEntity;
    }
}