package com.example.demo.domain.general.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * This is sample model class.
 */
@Data
public class SamplePeople {

    /**
     * first name
     */
    private String firstName;

    /**
     * last name
     */
    private String lastName;

    /**
     * age
     */
    private int age;

    /**
     * birthday
     */
    private LocalDate birthday;

    /**
     * date of created
     */
    private LocalDate createdOn;
}
