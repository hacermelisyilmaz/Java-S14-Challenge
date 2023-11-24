package com.workintech.burger;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra12Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, String breadRollType) {
        super("Healthy Burger", meat, breadRollType);
    }
}
