package com.portfolio.backend.service;

import com.portfolio.backend.domain.dto.PersonalMentorRequest;
import com.portfolio.backend.domain.dto.PersonalMentorResponse;

import java.util.List;

public interface PersonalMentorService {
    PersonalMentorResponse createPersonalMentor(PersonalMentorRequest personalMentorRequest);
    PersonalMentorResponse updatePersonalMentor(Long id,PersonalMentorRequest personalMentorRequest);
    PersonalMentorResponse getPersonalMentor(Long id);
    List<PersonalMentorResponse> getAllPersonalMentors();
    void deletePersonalMentor(Long id);
}
