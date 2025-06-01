package com.esi.ms_link_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "link_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class LinkType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "link", length = 32)
    private String link;

}