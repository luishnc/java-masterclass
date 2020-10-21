package com.luis;

public class DeluxeBurger extends Burger{

    private String exclusiveAddition1;
    private String exclusiveAddition2;
    private double priceCombo;

    public DeluxeBurger(String rollType, String meat, double price, double priceCombo) {
        super(rollType, meat, price, "Deluxe");
        this.exclusiveAddition1 = "Chips";
        this.exclusiveAddition2 = "drink";
        this.priceCombo = priceCombo;
    }



    //b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.


    public double getPriceCombo() {
        return priceCombo;
    }

    public void setPriceCombo(double priceCombo) {
        this.priceCombo = priceCombo;
    }

    @Override
    public double itemizeBurger() {
        System.out.println("Added drink and chips, this combo does not accept any additions.");
        return getTotalPrice();

    }

    public double getTotalPrice (){
        return super.getPrice() + getPriceCombo();
    }
}
