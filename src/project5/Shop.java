package project5;

import guest.Human;

public class Shop {

    public static void main(String[] args) {
        Human myBuyer = new Buyer(20);
        Buyer android = new Robot(1);
        Apple a = new Apple(500, "000001");
        Potato p = new Potato(400, "000002");
        a.setQuantity(300);
        p.setQuantity(200);
        System.out.println("Общее количество, Яблоки: " + a.getQuantity() + " шт.");
        System.out.println("Общее количество, Картофель: " + p.getQuantity() + " шт.");

        Human olga = new Human(18, "female");
        System.out.print(olga);
        olga.setName(" Покупатель - Ольга.");
        System.out.println(olga.getName());


        myBuyer.take();
        Apple a1 = new Apple(50, "000003");
        Potato p1 = new Potato(70, "000004");
        System.out.println("Яблоки, " + a1.getQuantity() + " шт.");
        System.out.println("Картофель, " + p1.getQuantity() + " шт.");
        int a2 = a.getQuantity() - a1.getQuantity();
        int p2 = p.getQuantity() - p1.getQuantity();
        System.out.println("Остаток на полке: " + a2);
        System.out.println("Остаток на полке: " + p2);

        android.take();
        Apple a3 = new Apple(10, "000005");
        Potato p3 = new Potato(20, "000006");
        int a4 = a.getQuantity() - (a1.getQuantity() + a3.getQuantity());
        int p4 = p.getQuantity() - (p1.getQuantity() + p3.getQuantity());
        int count = 0;
        int count1 = 0;
        boolean spoiledFood = true;
        if (spoiledFood == true) {
            System.out.println("Убирает с полки испорченные продукты." + " Яблоки, " + a3.getQuantity() + " шт." + " Картофель, " + p3.getQuantity() + " шт.");

            while (count != a3.getQuantity()) {
                count++;
                System.out.print("Взято: " + count + " шт., яблок");
                System.out.println(" ,осталось: " + (a2 - count));

            }
            while (count1 != p3.getQuantity()) {
                count1++;
                System.out.print("Взято: " + count1 + " шт., картофеля");
                System.out.println(" ,осталось: " + (p2 - count1));
            }
            System.out.println("Остаток на полке: " + a4);
            System.out.println("Остаток на полке: " + p4);

        } else {
            System.out.println("Продолжает проверку полок.");

        }

    }
    //System.out.println(a3.equals(p3));
    //System.out.println(a3 == p3);  //без условия if невыполнимо

}

