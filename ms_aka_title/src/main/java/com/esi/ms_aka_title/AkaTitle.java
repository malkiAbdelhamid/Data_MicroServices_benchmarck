package com.esi.ms_aka_title;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aka_title")
@Data @AllArgsConstructor @NoArgsConstructor
public class AkaTitle {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "title")
    private String title;

    @Column(name = "imdb_index", length = 4)
    private String imdbindex;

    @Column(name = "kind_id")
    private Integer kindid;

    @Column(name = "production_year")
    private Integer productionyear;

    @Column(name = "phonetic_code", length = 5)
    private String phoneticcode;

    @Column(name = "episode_of_id")
    private Integer episodeofid;

    @Column(name = "season_nr")
    private Integer seasonnr;

    @Column(name = "episode_nr")
    private Integer episodenr;

    @Column(name = "note", length = 72)
    private String note;

    @Column(name = "md5sum", length = 32)
    private String md5sum;

}