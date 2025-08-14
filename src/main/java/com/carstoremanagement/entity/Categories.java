package com.carstoremanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categories extends AbstractEntity<Long> implements Serializable {
    @Column(name = "Name", nullable = false, unique = true)
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Is_Active", nullable = false)
    private boolean isActive;
}
