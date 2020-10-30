package com.insta.facility.service;


import com.insta.facility.model.Facility;
import com.insta.facility.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacilityService {
    @Autowired
    private FacilityRepository facilityRepository;


    public List<Facility> findAllFacilities() {
        return facilityRepository.findAll();
    }

    /*public Facility findFacility(String facility_code){

        return facilityRepository.findById(facility_code).get();
    }*/

    public Facility findByCode(String code){
        return facilityRepository.findByCode(code);
    }

}
