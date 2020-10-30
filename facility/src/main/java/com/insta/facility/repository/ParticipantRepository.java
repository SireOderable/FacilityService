package com.insta.facility.repository;

import com.insta.facility.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant,Integer> {

    @Query(value = "SELECT t FROM Participant t WHERE t.facilityCode = ?1")
    List<Participant> findByCode(String facilityCode);
}
