package com.insta.facility.model;

import com.insta.facility.Devise;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.*;


@Entity
@Data
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String facilityCode;
    private String dealCode;
    private Long amount;
    private Devise devise;
}
