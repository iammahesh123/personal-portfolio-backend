package com.portfolio.backend.service.impl;

import com.portfolio.backend.domain.dto.PersonalMentorRequest;
import com.portfolio.backend.domain.dto.PersonalMentorResponse;
import com.portfolio.backend.domain.entity.PersonalMentor;
import com.portfolio.backend.mapper.PersonalMentorMapper;
import com.portfolio.backend.repository.PersonalMentorRepository;
import com.portfolio.backend.service.PersonalMentorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonalMentorServiceImpl implements PersonalMentorService {
    private final PersonalMentorRepository personalMentorRepository;
    private final PersonalMentorMapper personalMentorMapper;
    private final ModelMapper modelMapper;

    public PersonalMentorServiceImpl(PersonalMentorRepository personalMentorRepository, PersonalMentorMapper personalMentorMapper, ModelMapper modelMapper) {
        this.personalMentorRepository = personalMentorRepository;
        this.personalMentorMapper = personalMentorMapper;
        this.modelMapper = modelMapper;
    }

    @Override
    public PersonalMentorResponse createPersonalMentor(PersonalMentorRequest personalMentorRequest) {
        PersonalMentor personalMentor = new PersonalMentor();
        BeanUtils.copyProperties(personalMentorRequest, personalMentor);
        PersonalMentor savedMentor = personalMentorRepository.save(personalMentor);
        return personalMentorMapper.toDTO(savedMentor,modelMapper);
    }

    @Override
    public PersonalMentorResponse updatePersonalMentor(Long id, PersonalMentorRequest personalMentorRequest) {
        PersonalMentor existingMentor = personalMentorRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(personalMentorRequest, existingMentor);
        PersonalMentor updatedMentor = personalMentorRepository.save(existingMentor);
        return personalMentorMapper.toDTO(updatedMentor,modelMapper);
    }

    @Override
    public PersonalMentorResponse getPersonalMentor(Long id) {
        PersonalMentor existingMentor = personalMentorRepository.findById(id).orElse(null);
        return personalMentorMapper.toDTO(existingMentor,modelMapper);
    }

    @Override
    public List<PersonalMentorResponse> getAllPersonalMentors() {
        List<PersonalMentor> personalMentors = personalMentorRepository.findAll();
        return personalMentors.stream().map(personalMentor -> personalMentorMapper.toDTO(personalMentor,modelMapper)).collect(Collectors.toList());
    }

    @Override
    public void deletePersonalMentor(Long id) {
        PersonalMentor existingMentor = personalMentorRepository.findById(id).orElse(null);
        personalMentorRepository.delete(existingMentor);
    }
}
