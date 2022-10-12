package com.sandesh;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("delux", "sausage", 350, "white");
        super.addHamburgerAddition1("chips", 40);
        super.addHamburgerAddition2("drink", 80);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add items to this ");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add items to this ");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add items to this ");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add items to this ");
    }
}
