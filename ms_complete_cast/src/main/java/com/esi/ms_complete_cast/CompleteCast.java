package com.esi.ms_complete_cast;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "complete_cast")
@Data @AllArgsConstructor @NoArgsConstructor
public class CompleteCast {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "subject_id")
    private Integer subjectid;

    @Column(name = "status_id")
    private Integer statusid;

}