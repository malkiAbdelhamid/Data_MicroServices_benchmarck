package com.esi.ms_info_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "info_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class InfoType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "info", length = 32)
    private String info;

}