package com.sorteio.sorteio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "student")
public class Student {
    private Long id;
    private String name;
}
