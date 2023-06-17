package com.seddik_commons.entities;



import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
//lombok annotation
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseEntity {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @lombok.Setter(AccessLevel.NONE)
    private Long id;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
