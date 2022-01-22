package com.halilcanirez.patika.repository.rate;

import com.halilcanirez.patika.repository.movie.MovieEntity;
import com.homework3.repository.movie_repo.MovieEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "rate")
public class RateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private Long memberId;

    @Column(nullable = false)
    private Integer point;

    @ManyToOne
    @JoinColumn(nullable = false)
    private MovieEntity movie;
}
