package com.esi.ms_cast_info;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cast_info")
@Data @AllArgsConstructor @NoArgsConstructor
public class CastInfo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "person_id")
    private Integer personid;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "person_role_id")
    private Integer personroleid;

    @Column(name = "note")
    private String note;

    @Column(name = "nr_order")
    private Integer nrorder;

    @Column(name = "role_id")
    private Integer roleid;

}