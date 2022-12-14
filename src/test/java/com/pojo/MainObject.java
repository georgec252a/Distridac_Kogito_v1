package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class MainObject {

    private int i;

    private String id;
    private boolean stored;
    private IntrareCLE intrareCLE;

    public MainObject() {
    }

    public MainObject(boolean stored, IntrareCLE intrareCLE) {
        this.stored = stored;
        this.intrareCLE = intrareCLE;
    }

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    public IntrareCLE getIntrareCLE() {
        return intrareCLE;
    }

    public void setIntrareCLE(IntrareCLE intrareCLE) {
        this.intrareCLE = intrareCLE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "MainObject{" +
                "id='" + id + '\'' +
                ", stored=" + stored +
                ", intrareCLE=" + intrareCLE.toString() +
                '}';
    }
}
