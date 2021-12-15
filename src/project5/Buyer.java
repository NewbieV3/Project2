package project5;

import guest.Person;

public class Buyer {

private String name;
private Person per;

    public Buyer(){
name = "Кто-то (м) или (ж)";
per = new Person(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public void take() {
        System.out.println("Берет с полки товар.");
    }

}


