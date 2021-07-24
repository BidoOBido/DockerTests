package com.bido.kafkaconsumer.model;

import java.util.Date;

public class MockedValues {

    private Date CreatedOn;

    private Double FirstValue;

    private Double SecondValue;

    public MockedValues(Date CreatedOn, Double FirstValue, Double SecondValue) {
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

        return String.format("First value: %f - Second value: %f", this.FirstValue, this.SecondValue);
    }

}
