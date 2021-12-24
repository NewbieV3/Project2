package guest;

public class Human {
    private int age;
    private String gender;
    private String name;
    //private Enum<String> genderEnum; //Тип списка с заранее определенными вариантами выбора.
    //private boolean isMale;

    public Human(int age) {
        this.age = age;
        this.gender = "female";
    }

    public Human(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return this.gender == "male";
    }

    public String toString() {
        return "Возраст: " + this.age + " лет. ";
    }

    public void take() {
        System.out.println("Берет с полки товар.");
    }
}
