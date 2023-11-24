package com.workintech.burger;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", 19.910, String.valueOf(com.workintech.burger.breadRollType.DOUBLE_SANDWICH));
        setMeat("Double");
        setAddition1Name("chips");
        setAddition2Name("drink");
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
