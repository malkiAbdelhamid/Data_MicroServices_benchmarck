package com.esi.ms_role_type;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "role_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class RoleType {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "role", length = 32)
    private String role;

}