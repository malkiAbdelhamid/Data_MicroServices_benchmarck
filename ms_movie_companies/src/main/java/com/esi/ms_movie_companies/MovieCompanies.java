package com.esi.ms_movie_companies;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie_companies")
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieCompanies {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieid;

    @Column(name = "company_id")
    private Integer companyid;

    @Column(name = "company_type_id")
    private Integer companytypeid;

    @Column(name = "note")
    private String note;

}