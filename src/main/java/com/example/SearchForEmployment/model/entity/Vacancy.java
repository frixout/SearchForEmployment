package com.example.SearchForEmployment.model.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vacancy")
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "requiredWorkExperience", nullable = false)
    private String requiredWorkExperience;
    @Column(name = "salary")
    private String salary;
    @Column(name = "requirements", nullable = false)
    private String requirements;
    @Column(name = "conditions", nullable = false)
    private String conditions;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id") //если что, поставь внешний ключ FK
    private User ownerVacancy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscriber_id") //если что, поставь внешний ключ FK
    private User subscriberVacancy;
}
