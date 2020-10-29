package com.insta.facility.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import com.insta.facility.model.Entity;

public class Facility {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String code;
    private Long amount;
    private String devise;
    private List<Entity> entities;

}
