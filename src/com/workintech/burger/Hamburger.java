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

    public Hamburger(String name, String meat, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
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
