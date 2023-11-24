package com.workintech.burger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String meat, String breadRollType) {
        super("Deluxe Burger", meat, 19.90, breadRollType);
        super.setAddition1Name("chips");
        super.setAddition2Name("drink");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot select additions.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot select additions.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot select additions.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot select additions.");
    }
}
