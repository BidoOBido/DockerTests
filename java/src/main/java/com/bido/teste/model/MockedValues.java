package com.bido.teste.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "mocked_values")
public class MockedValues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "created_on")
    private Date CreatedOn;

    @Column(name = "first_value")
    private Double FirstValue;

    @Column(name = "second_value")
    private Double SecondValue;

    public MockedValues(Long id, Date CreatedOn, Double FirstValue, Double SecondValue) {
        this.id = id;
        this.setCreatedOn(CreatedOn);
        this.setFirstValue(FirstValue);
        this.setSecondValue(SecondValue);
    };

    public MockedValues() {
    };

    public Double getSecondValue() {
        return SecondValue;
    }

    public void setSecondValue(Double SecondValue) {
        this.SecondValue = SecondValue;
    }

    public Double getFirstValue() {
        return FirstValue;
    }

    public void setFirstValue(Double FirstValue) {
        this.FirstValue = FirstValue;
    }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    @Override
    public String toString() {

        return String.format("ID: %d - Created on: %s - First value: %f - Second value: %f", this.id,
                new SimpleDateFormat("dd-MM-yyyy HH:MM:ss").format(this.CreatedOn), this.FirstValue, this.SecondValue);
    }

}
