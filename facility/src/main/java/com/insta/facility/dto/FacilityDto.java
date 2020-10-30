package com.insta.facility.dto;

import com.insta.facility.model.Facility;
import lombok.Data;

import java.util.List;

@Data
public class FacilityDto {

    private String deal_code;
    private List<Facility> facilities;

    public FacilityDto(String deal_code, List<Facility> facilities) {
        this.deal_code = deal_code;
        this.facilities = facilities;
    }
}
