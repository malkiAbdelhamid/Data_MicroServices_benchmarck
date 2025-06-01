package com.esi.ms_movie_link;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie_link")
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieLink {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "linked_movie_id")
    private Integer linkedmovieid;

    @Column(name = "link_type_id")
    private Integer linktypeid;

}