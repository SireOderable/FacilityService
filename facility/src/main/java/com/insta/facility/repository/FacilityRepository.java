package com.insta.facility.repository;

import com.insta.facility.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FacilityRepository extends JpaRepository<Facility,Integer> {

    Facility findByFacilityCode(String facilityCode);
}
