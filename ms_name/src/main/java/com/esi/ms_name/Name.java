package com.esi.ms_name;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "name")
@Data @AllArgsConstructor @NoArgsConstructor
public class Name {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "imdb_index", length = 9)
    private String imdbindex;

    @Column(name = "imdb_id")
    private Integer imdbid;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "name_pcode_cf", length = 5)
    private String namepcodecf;

    @Column(name = "name_pcode_nf", length = 5)
    private String namepcodenf;

    @Column(name = "surname_pcode", length = 5)
    private String surnamepcode;

    @Column(name = "md5sum", length = 32)
    private String md5sum;

}