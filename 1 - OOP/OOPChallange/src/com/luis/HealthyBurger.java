package com.luis;

public class HealthyBurger extends Burger {

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("brown rye", meat, price, "Healthy");
    }

    public void addHamburguerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;

    }

    public void addHamburguerAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;

    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if (this.addition5Name != null) {
            burgerPrice += this.addition5Price;
            System.out.println("Added " + this.addition5Name + " for an extra " + this.addition5Price);
        }

        if (this.addition6Name != null) {
            burgerPrice += this.addition6Price;
            System.out.println("Added " + this.addition6Name + " for an extra " + this.addition6Price);
        }

        return burgerPrice;

    }

    //a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).
}
