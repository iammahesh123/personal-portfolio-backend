package com.portfolio.backend;

import com.portfolio.backend.domain.dto.PersonalMentorRequest;
import com.portfolio.backend.domain.dto.PersonalMentorResponse;
import com.portfolio.backend.service.PersonalMentorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal-mentor")
public class PersonalMentorController {

    private final PersonalMentorService personalMentorService;

    public PersonalMentorController(PersonalMentorService personalMentorService) {
        this.personalMentorService = personalMentorService;
    }

    @PostMapping
    public ResponseEntity<PersonalMentorResponse> createPersonalMentor(@RequestBody PersonalMentorRequest personalMentorRequest) {
        return ResponseEntity.ok(personalMentorService.createPersonalMentor(personalMentorRequest));
    }

    @PutMapping("/{personal_mentor_id}")
    public ResponseEntity<PersonalMentorResponse> updatePersonalMentor(@PathVariable("personal_mentor_id") Long id, @RequestBody PersonalMentorRequest personalMentorRequest) {
        return ResponseEntity.ok(personalMentorService.updatePersonalMentor(id, personalMentorRequest));
    }

    @GetMapping("/{personal_mentor_id}")
    public ResponseEntity<PersonalMentorResponse> readPersonalMentor(@PathVariable("personal_mentor_id") Long id) {
        return ResponseEntity.ok(personalMentorService.getPersonalMentor(id));
    }

    @GetMapping
    public ResponseEntity<List<PersonalMentorResponse>> readAllPersonalMentor() {
        return ResponseEntity.ok(personalMentorService.getAllPersonalMentors());
    }

    @DeleteMapping("/{personal_mentor_id}")
    public ResponseEntity<HttpStatus> deletePersonalMentor(@PathVariable("personal_mentor_id") Long id) {
        personalMentorService.deletePersonalMentor(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
