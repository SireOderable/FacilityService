package com.insta.facility.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String facilityCode;
    private String name;
    private String calendar;
    private Long percentage;

    public Participant(){}

    public Participant(Long id, String facilityCode, String name, String calendar, Long percentage) {
        this.id = id;
        this.facilityCode = facilityCode;
        this.name = name;
        this.calendar = calendar;
        this.percentage = percentage;
    }
}
