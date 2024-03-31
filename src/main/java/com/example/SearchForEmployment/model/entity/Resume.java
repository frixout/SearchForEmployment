package com.example.SearchForEmployment.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "workExperience", nullable = false)
    private String workExperience;

    @Column(name = "education", nullable = false)
    private String education;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return Objects.equals(id, resume.id) && Objects.equals(name, resume.name) && Objects.equals(workExperience, resume.workExperience) && Objects.equals(education, resume.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, workExperience, education);
    }
}
