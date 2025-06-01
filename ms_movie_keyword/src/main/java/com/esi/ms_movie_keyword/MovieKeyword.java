package com.esi.ms_movie_keyword;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie_keyword")
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieKeyword {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "keyword_id")
    private Integer keywordid;

}