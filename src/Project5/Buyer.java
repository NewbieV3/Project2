package Project5;

import Guest.Robot;

public class Buyer {

    private Robot android;

    public Buyer(){
    android = new Robot(100);
    Men.age = 30;
    Women.age = 14;

    }

        public void setAge(int buyerAge){
        if (buyerAge<21) take();
        else {take1();}
    }

    public int getAge(){
        return Men.age;
    }

    public int getAge2(){
        return Women.age;
    }

    public Robot getAndroid() {
        return android;
    }

    public void setAndroid(Robot android) {
        this.android = android;
    }

    public void take(){
        System.out.println("Берет с полки товар.");
    }

    public void take1() {
        System.out.println("Берет с полки алкоголь.");
    }
}
