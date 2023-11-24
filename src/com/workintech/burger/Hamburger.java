package com.workintech.burger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println(this);
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Class: ").append(getClass().getSimpleName().toUpperCase()).append("\n");
        builder.append("Name: ").append(name).append("\n");
        builder.append("Price: ").append(price).append("\n");
        builder.append("Meat: ").append(meat).append("\n");
        builder.append("Bread Roll Type: ").append(breadRollType).append("\n");

        builder.append("*Additions*").append("\n");
        if (!(addition1Name == null)) builder.append("Addition 1 name: ").append(addition1Name).append("\n")
                .append("Addition 1 price: ").append(addition1Price).append("\n");
        if (!(addition2Name == null)) builder.append("Addition 2 name: ").append(addition2Name).append("\n")
                .append("Addition 2 price: ").append(addition2Price).append("\n");
        if (!(addition3Name == null)) builder.append("Addition 3 name: ").append(addition3Name).append("\n")
                .append("Addition 3 price: ").append(addition3Price).append("\n");
        if (!(addition4Name == null)) builder.append("Addition 4 name: ").append(addition4Name).append("\n")
                .append("Addition 4 price: ").append(addition4Price).append("\n");
        return builder.toString();
    }
}
