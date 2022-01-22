package com.halilcanirez.patika.repository.movie;

import com.halilcanirez.patika.repository.rate.RateEntity;
import com.homework3.Genre;
import com.homework3.repository.rate_repo.RateEntity;
import com.homework3.service.rate.Rate;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity(name = "movie") // entity vs table 4. hafta pazar part 3
@Table(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(nullable = false)
    private String releaseYear;

    @Column(nullable = false)
    private String director;

    @OneToMany(mappedBy = "movie")  // mant to one tarafında bunu eşleştridiğin değişken ismi 3. hafta pazar part 2 46.10
    private Set<RateEntity> rates;
}
