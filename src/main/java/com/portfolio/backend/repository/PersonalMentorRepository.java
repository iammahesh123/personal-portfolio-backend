package com.portfolio.backend.repository;

import com.portfolio.backend.domain.entity.PersonalMentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalMentorRepository extends JpaRepository<PersonalMentor,Long> {
}
