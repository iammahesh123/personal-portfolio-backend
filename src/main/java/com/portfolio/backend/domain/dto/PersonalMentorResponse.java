package com.portfolio.backend.domain.dto;

import com.portfolio.backend.domain.enums.Courses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalMentorResponse {
    private Long id;
    private String name;
    private String email;
    private Courses courses;
    private String preferredTime;
    private String preferredLanguage;
    private String additionalRequirements;
}
