package com.esi.ms_aka_name;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "aka_name")
@Data @AllArgsConstructor @NoArgsConstructor
public class AkaName {

    @Id
    private Integer id;

    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "imdb_index", length = 12)
    private String imdbIndex;

    @Column(name = "name_pcode_cf", length = 5)
    private String namePcodeCf;

    @Column(name = "name_pcode_nf", length = 5)
    private String namePcodeNf;

    @Column(name = "surname_pcode", length = 5)
    private String surnamePcode;

    @Column(name = "md5sum", length = 32)
    private String md5sum;
}
