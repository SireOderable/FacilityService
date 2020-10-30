package com.insta.facility.service;

import com.insta.facility.model.Participant;
import com.insta.facility.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> findByCode(String code) {
        return participantRepository.findByCode(code);
    }
}
