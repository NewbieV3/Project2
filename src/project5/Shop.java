package project5;

public class Shop {

    public static void main(String[] args) {
        Buyer myBuyer = new Buyer();
        Buyer android = new Robot();
        Apple a = new Apple(500);
        Potato p = new Potato(400);
        a.setQuantity(300);
        p.setQuantity(200);
        System.out.println("Общее количество, Яблоки: " + a.getQuantity() + " шт.");
        System.out.println("Общее количество, Картофель: " + p.getQuantity() + " шт.");

        myBuyer.setName("Покупатель: Ольга, возраст: " + myBuyer.getPerson().getAge() + " лет.");
        System.out.println(myBuyer.getName());

        myBuyer.take();
        Apple a1 = new Apple(50);
        Potato p1 = new Potato(70);
        System.out.println("Яблоки, " + a1.getQuantity() + " шт.");
        System.out.println("Картофель, " + p1.getQuantity() + " шт.");
        int a2 = a.getQuantity() - a1.getQuantity();
        int p2 = p.getQuantity() - p1.getQuantity();
        System.out.println("Остаток на полке: " + a2);
        System.out.println("Остаток на полке: " + p2);

        android.take();
        Apple a3 = new Apple(30);
        Potato p3 = new Potato(50);
        System.out.println("Яблоки, " + a3.getQuantity() + " шт.");
        System.out.println("Картофель, " + p3.getQuantity() + " шт.");
        int a4 = a.getQuantity() - (a1.getQuantity() + a3.getQuantity());
        int p4 = p.getQuantity() - (p1.getQuantity() + p3.getQuantity());
        System.out.println("Общий остаток на полке: " + a4);
        System.out.println("Общий остаток на полке: " + p4);

    }
}