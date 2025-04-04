package com.portfolio.backend.domain.dto;

import com.portfolio.backend.domain.enums.Courses;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalMentorRequest {
    private String name;
    private String email;
    private Courses courses;
    private String preferredTime;
    private String preferredLanguage;
    private String additionalRequirements;
}
