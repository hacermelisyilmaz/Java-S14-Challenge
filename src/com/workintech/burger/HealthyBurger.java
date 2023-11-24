package com.workintech.burger;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(super.toString() + this);
        return getPrice() + healthyExtra1Price + healthyExtra2Price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (!(healthyExtra1Name == null)) builder.append("Healthy Addition 1 name: ").append(healthyExtra1Name).append("\n");
        if (!(healthyExtra2Name == null)) builder.append("Healthy Addition 2 name: ").append(healthyExtra2Name).append("\n");
        return builder.toString();
    }
}
