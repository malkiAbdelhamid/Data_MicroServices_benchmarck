package com.esi.ms_title;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "title")
@Data @AllArgsConstructor @NoArgsConstructor
public class Title {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "imdb_index", length = 5)
    private String imdbindex;

    @Column(name = "kind_id")
    private Integer kindid;

    @Column(name = "production_year")
    private Integer productionyear;

    @Column(name = "imdb_id")
    private Integer imdbid;

    @Column(name = "phonetic_code", length = 5)
    private String phoneticcode;

    @Column(name = "episode_of_id")
    private Integer episodeofid;

    @Column(name = "season_nr")
    private Integer seasonnr;

    @Column(name = "episode_nr")
    private Integer episodenr;

    @Column(name = "series_years", length = 49)
    private String seriesyears;

    @Column(name = "md5sum", length = 32)
    private String md5sum;

}