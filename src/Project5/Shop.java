package Project5;

public class Shop {
    public static void main(String[] args) {

        Women woman = new Women();
        Men man = new Men();
        Buyer myAnd = new Buyer();

        System.out.print("Женщина: " + woman.getAge2() + " лет. ");
        woman.setAge(Women.age);
        System.out.print("Мужчина: " + woman.getAge2() + " лет. ");
        man.setAge(Men.age);

        int andAge = myAnd.getAndroid().getAge();
        System.out.println("Робот-гость (?): " + andAge + " лет.");
    }
}