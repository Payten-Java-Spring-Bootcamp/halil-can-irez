package com.halilcanirez.patika.repository.moviesinwatchlist;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "moviesinwatchlist")
public class MoviesinWatchlistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long watchlistId;

    @Column(nullable = false)
    private Long movieId;
}
