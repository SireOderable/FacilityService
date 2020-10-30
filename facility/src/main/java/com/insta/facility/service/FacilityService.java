package com.insta.facility.service;


import com.insta.facility.model.Facility;
import com.insta.facility.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService {
    @Autowired
    private FacilityRepository facilityRepository;


    public List<Facility> findAllFacilities() {
        return facilityRepository.findAll();
    }


    public Facility findByCode(String code){
        return facilityRepository.findByFacilityCode(code);
    }

}
