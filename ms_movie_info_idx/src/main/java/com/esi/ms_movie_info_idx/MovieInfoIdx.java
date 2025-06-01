package com.esi.ms_movie_info_idx;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie_info_idx")
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieInfoIdx {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "info_type_id")
    private Integer infotypeid;

    @Column(name = "info")
    private String info;

    @Column(name = "note", length = 1)
    private String note;

}