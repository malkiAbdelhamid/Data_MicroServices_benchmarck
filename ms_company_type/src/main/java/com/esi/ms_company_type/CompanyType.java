package com.esi.ms_company_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class CompanyType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "kind", length = 32)
    private String kind;

}