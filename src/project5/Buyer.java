package project5;

import guest.Human;

public class Buyer extends Human {


    public Buyer(int age) {
        super(age);

    }

    public void take() {
        System.out.println("Берет с полки товар.");
    }

}


