package com.insta.facility.rest;

import com.insta.facility.model.Facility;
import com.insta.facility.repository.FacilityRepository;
import com.insta.facility.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacilityResource {

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private FacilityRepository facilityRepository;

    @GetMapping("/api/v1/facilities")
    List<Facility> getAllFacilities(){

        return this.facilityRepository.findAll();
    }

    @GetMapping("/api/v1/facilities/{facility_code}")
    Facility getFacility(@PathVariable("facility_code") String facilityCode){
        return facilityService.findByCode(facilityCode);
    }

    @PostMapping("/api/v1/facilities")
    Facility create(@RequestBody Facility facility) {
        return facilityRepository.save(facility);
    }
}
