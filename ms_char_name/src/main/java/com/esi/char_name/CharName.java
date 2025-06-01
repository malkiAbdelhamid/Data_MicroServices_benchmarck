package com.esi.char_name;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "char_name")
@Data @AllArgsConstructor @NoArgsConstructor
public class CharName {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "imdb_index", length = 2)
    private String imdbindex;

    @Column(name = "imdb_id")
    private Integer imdbid;

    @Column(name = "name_pcode_nf", length = 5)
    private String namepcodenf;

    @Column(name = "surname_pcode", length = 5)
    private String surnamepcode;

    @Column(name = "md5sum", length = 32)
    private String md5sum;

}