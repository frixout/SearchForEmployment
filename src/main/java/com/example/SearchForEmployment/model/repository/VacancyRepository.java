package com.example.SearchForEmployment.model.repository;

import com.example.SearchForEmployment.model.entity.User;
import com.example.SearchForEmployment.model.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VacancyRepository extends JpaRepository<Vacancy, Long> {
    List<Vacancy> findByOwnerVacancy(User ownerVacancy);
}
