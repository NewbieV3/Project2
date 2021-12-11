package Project5;

public abstract class Buyer {

    private int age;

    public void setAge(int buyerAge){
        if (buyerAge<21) take();
           else {take1();}
    }

    public int getAge(){
        return age;
    }

    public void take(){
        System.out.println("Берет с полки товар.");
    }

    public void take1() {
        System.out.println("Берет с полки алкоголь.");
    }
}
