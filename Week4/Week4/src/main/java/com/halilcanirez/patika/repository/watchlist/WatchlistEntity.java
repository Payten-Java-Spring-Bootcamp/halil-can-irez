package com.halilcanirez.patika.repository.watchlist;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Columns;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "watchlist")
public class WatchlistEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long memberId;

}
