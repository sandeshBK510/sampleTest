package com.sandesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("basic","sausage",300,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",20);
        hamburger.addHamburgerAddition2("lettuce",30);
        hamburger.addHamburgerAddition3("cheese",10);
        System.out.println("total price of the burger "+ hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("bacon", 200);
        healthyBurger.addHamburgerAddition1("egg", 30);
        healthyBurger.addHealthAddition1("cream", 20);
        System.out.println("the healthy burger price "+healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.itemizeHamburger();



    }
}
