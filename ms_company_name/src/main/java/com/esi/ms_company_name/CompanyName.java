package com.esi.ms_company_name;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company_name")
@Data @AllArgsConstructor @NoArgsConstructor
public class CompanyName {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "country_code", length = 6)
    private String countrycode;

    @Column(name = "imdb_id")
    private Integer imdbid;

    @Column(name = "name_pcode_nf", length = 5)
    private String namepcodenf;

    @Column(name = "name_pcode_sf", length = 5)
    private String namepcodesf;

    @Column(name = "md5sum", length = 32)
    private String md5sum;

}