package project5;

import guest.Human;

public class Buyer {

private String name;
private Human person;

    public Buyer(){
name = "Кто-то (м) или (ж)";
person = new Human(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getPerson() {
        return person;
    }

    public void setPerson(Human person) {
        this.person = person;
    }

    public void take() {
        System.out.println("Берет с полки товар.");
    }

}


