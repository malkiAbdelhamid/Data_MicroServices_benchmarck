package com.esi.ms_movie_info;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie_info")
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieInfo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "info_type_id")
    private Integer infotypeid;

    @Column(name = "info")
    private String info;

    @Column(name = "note")
    private String note;

}