package com.halilcanirez.patika.controller.request;




import com.halilcanirez.patika.service.watchlist.SWatchlist;
import lombok.Getter;

@Getter
public class WatchlistRequest {
    private String name;
    private Long memberId;

    public SWatchlist convertToWatchlist(){
        SWatchlist watchlist = new SWatchlist();
        watchlist.setName(name);
        watchlist.setMemberId(memberId);
        return watchlist;
    }

}
