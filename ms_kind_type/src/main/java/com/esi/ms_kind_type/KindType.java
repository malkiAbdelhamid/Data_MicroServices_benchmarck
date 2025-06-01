package com.esi.ms_kind_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kind_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class KindType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "kind", length = 15)
    private String kind;

}