package com.portfolio.backend.service.impl;

import com.portfolio.backend.domain.dto.PersonalMentorRequest;
import com.portfolio.backend.domain.dto.PersonalMentorResponse;
import com.portfolio.backend.domain.entity.PersonalMentor;
import com.portfolio.backend.repository.PersonalMentorRepository;
import com.portfolio.backend.service.PersonalMentorService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalMentorServiceImpl implements PersonalMentorService {
    private final PersonalMentorRepository personalMentorRepository;

    public PersonalMentorServiceImpl(PersonalMentorRepository personalMentorRepository) {
        this.personalMentorRepository = personalMentorRepository;
    }

    @Override
    public PersonalMentorResponse createPersonalMentor(PersonalMentorRequest personalMentorRequest) {
        PersonalMentor personalMentor = new PersonalMentor();
        BeanUtils.copyProperties(personalMentorRequest, personalMentor);
        PersonalMentor savedMentor = personalMentorRepository.save(personalMentor);
        return null;
    }

    @Override
    public PersonalMentorResponse updatePersonalMentor(Long id, PersonalMentorRequest personalMentorRequest) {
        return null;
    }

    @Override
    public PersonalMentorResponse getPersonalMentor(Long id) {
        return null;
    }

    @Override
    public List<PersonalMentorResponse> getAllPersonalMentors() {
        return List.of();
    }

    @Override
    public void deletePersonalMentor(Long id) {

    }
}
