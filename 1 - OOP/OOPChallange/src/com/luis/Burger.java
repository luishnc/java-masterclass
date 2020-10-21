package com.luis;

public class Burger {


    private String rollType;
    private String meat;
    private double price;
    private String name;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Burger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }


    public Burger(String meat, double price) {
        this.meat = meat;
        this.price = price;
    }

    public void addHamburguerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;

    }

    public void addHamburguerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;

    }

    public void addHamburguerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;

    }

    public void addHamburguerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;

    }


    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.rollType + " roll. Price is: " + this.price);



            if (this.addition1Name != null) {
                burgerPrice += this.addition1Price;
                System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            }

            if (this.addition2Name != null) {
                burgerPrice += this.addition2Price;
                System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            }

            if (this.addition3Name != null) {
                burgerPrice += this.addition3Price;
                System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            }

            if (this.addition4Name != null) {
                burgerPrice += this.addition4Price;
                System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            }


        return burgerPrice;
    }

    public double getPrice() {
        return price;
    }
}
