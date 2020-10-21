package com.timbuchalka;

public class Television {
    private boolean isTurnedOn;
    private String brand;

    public Television(boolean isTurnedOn, String brand) {

        this.isTurnedOn = isTurnedOn;
        this.brand = brand;
    }

    public void turnTvOn() {
        isTurnedOn = true;

    }

    public void displayLogo() {
        System.out.println("logo displayed");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public String getBrand() {
        return brand;
    }
}
