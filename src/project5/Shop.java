package project5;


public class Shop {

    public static void main(String[] args) {
        Buyer myBuyer = new Buyer();
        Buyer android = new Robot();
        //Buyer android = new Buyer();  // <- если указать так вместо предыдущей строки, должен сработать метод, полученный от класса Robot, но он не работает.

        myBuyer.setName("Ольга");
        System.out.println(myBuyer.getName());

        int personAge = myBuyer.getPerson().getAge();
        System.out.println(personAge);

        android.take();

    }
}