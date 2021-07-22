package com.bido.kafkaconsumer.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MockedValues {

    private Long id;
    private Date CreatedOn;
    private Double FirstValue;
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
