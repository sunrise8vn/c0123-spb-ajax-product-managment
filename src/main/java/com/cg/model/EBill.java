package com.cg.model;

public enum EBill {

    ORDER("ORDER"),
    DONE("DONE"),
    CANCEL("CANCEL"),
    BOMB("BOMB");

    private final String value;

    EBill(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
