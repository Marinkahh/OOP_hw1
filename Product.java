package org.example.seminar1.hw;

public abstract class Product {
    private String drink;
    private double volume;
    private Boolean sugar;


    public Product(){
    }

    public Product(String drink, double volume, Boolean sugar) {
        this.drink = drink;
        this.volume = volume;
        this.sugar = sugar;

    }

    public String getDrink() {return drink;}
    public double getVolume() {return volume;}
    public Boolean getSugar() {return sugar;}

}
