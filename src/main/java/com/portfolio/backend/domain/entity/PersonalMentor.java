package com.portfolio.backend.domain.entity;

import com.portfolio.backend.domain.enums.Courses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalMentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Courses courses;
    private String preferredTime;
    private String preferredLanguage;
    private String additionalRequirements;
}
