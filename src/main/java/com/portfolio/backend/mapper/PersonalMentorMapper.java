package com.portfolio.backend.mapper;

import com.portfolio.backend.domain.dto.PersonalMentorResponse;
import com.portfolio.backend.domain.entity.PersonalMentor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonalMentorMapper {
   public PersonalMentorResponse toDTO(PersonalMentor personalMentor, ModelMapper modelMapper) {
        return modelMapper.map(personalMentor, PersonalMentorResponse.class);
    }
}
