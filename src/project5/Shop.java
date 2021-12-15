package project5;


public class Shop {

    public static void main(String[] args) {
        Buyer myBuyer = new Buyer();
        Buyer android = new Robot();

        myBuyer.setName("Ольга");
        System.out.println(myBuyer.getName());

        int personAge = myBuyer.getPer().getAge();
        System.out.println(personAge);

        android.take();
    }
}