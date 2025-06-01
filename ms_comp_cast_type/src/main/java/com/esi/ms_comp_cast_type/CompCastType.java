package com.esi.ms_comp_cast_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comp_cast_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class CompCastType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "kind", length = 32)
    private String kind;

}