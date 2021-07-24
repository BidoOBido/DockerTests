package com.bido.kafkaconsumer.enumerator;

public enum InconsitenceType {
    INCONSITENT_VALUE("I");

    private String flag;

    private InconsitenceType(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

}
