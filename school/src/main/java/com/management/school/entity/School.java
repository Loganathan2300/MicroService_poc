package com.management.school.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Builder
@Getter
@Setter
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String schoolName;

    @Column
    private String address;

}
