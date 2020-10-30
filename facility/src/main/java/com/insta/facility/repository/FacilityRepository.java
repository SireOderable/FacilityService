package com.insta.facility.repository;

import com.insta.facility.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility,Integer> {

    @Query(value = "SELECT t FROM Facility t WHERE t.facilityCode = ?1")
     Facility findByCode(String facilityCode);
}
