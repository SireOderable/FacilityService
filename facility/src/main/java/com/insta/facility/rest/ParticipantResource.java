package com.insta.facility.rest;

import com.insta.facility.model.Participant;
import com.insta.facility.repository.ParticipantRepository;
import com.insta.facility.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipantResource {

    @Autowired
    private ParticipantService participantService;

    @Autowired
    private ParticipantRepository participantRepository;

    @GetMapping("/api/v1/participants")
    List<Participant> getAllParticipants() {
        return this.participantRepository.findAll();
    }

    @GetMapping("/api/v1/participants/facility")
    List<Participant> getParticipantsFacility(@RequestParam String facility_code) {
        return this.participantRepository.findByCode(facility_code);
    }

    @PostMapping("/api/v1/participants")
    Participant create(@RequestBody Participant participant) {
        return participantRepository.save(participant);
    }
}
