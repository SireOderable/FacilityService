package com.insta.facility.rest;

import com.insta.facility.repository.FacilityRepository;
import com.insta.facility.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacilityResource {

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private FacilityRepository facilityRepository;
}
