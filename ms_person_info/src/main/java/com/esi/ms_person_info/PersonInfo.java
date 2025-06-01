package com.esi.ms_person_info;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person_info")
@Data @AllArgsConstructor @NoArgsConstructor
public class PersonInfo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "person_id")
    private Integer personid;

    @Column(name = "info_type_id")
    private Integer infotypeid;

    @Column(name = "info")
    private String info;

    @Column(name = "note")
    private String note;

}