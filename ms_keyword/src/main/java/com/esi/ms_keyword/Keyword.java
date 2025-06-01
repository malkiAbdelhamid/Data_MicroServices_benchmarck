package com.esi.ms_keyword;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "keyword")
@Data @AllArgsConstructor @NoArgsConstructor
public class Keyword {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "phonetic_code", length = 5)
    private String phoneticcode;

}