package project5;

import guest.Human;

public class Shop {

    public static void main(String[] args) {
        Human myBuyer = new Buyer(20);
        Buyer android = new Robot(1);
        Apple appTotal = new Apple(500, "000001");
        Potato potTotal = new Potato(400, "000002");
        appTotal.setQuantity(200);
        potTotal.setQuantity(150);
        System.out.println("Общее количество, Яблоки: " + appTotal.getQuantity() + " шт.");
        System.out.println("Общее количество, Картофель: " + potTotal.getQuantity() + " шт.");

        Human olga = new Human(18, "female");
        System.out.print(olga);
        olga.setName(" Покупатель - Ольга.");
        System.out.println(olga.getName());

        myBuyer.take();
        Apple appOlga = new Apple(20, "000003");
        Potato potOlga = new Potato(15, "000004");
        int appShelf = appTotal.getQuantity() - appOlga.getQuantity();
        int potShelf = potTotal.getQuantity() - potOlga.getQuantity();
        int count = 0;
        int count1 = 0;
        while (count < appOlga.getQuantity()) {
            count++;
            System.out.print("Взято: " + count + " шт., яблок");
            System.out.println(" ,осталось: " + (appTotal.getQuantity() - count));
        }
        while (count1 < potOlga.getQuantity()) {
            count1++;
            System.out.print("Взято: " + count1 + " шт., картофеля");
            System.out.println(" ,осталось: " + (potTotal.getQuantity() - count1));
        }
        System.out.println("Остаток яблок на полке после покупки Ольги: " + appShelf + " шт.");
        System.out.println("Остаток картофеля на полке после покупки Ольги: " + potShelf + " шт.");

        android.take();
        Apple appSpoiled = new Apple(10, "000005");
        Potato potSpoiled = new Potato(20, "000006");
        int appTakenByRobot = appTotal.getQuantity() - (appOlga.getQuantity() + appSpoiled.getQuantity());
        int potTakenByRobot = potTotal.getQuantity() - (potOlga.getQuantity() + potSpoiled.getQuantity());

        boolean isSpoiledFood = true;
        if (isSpoiledFood) {
            System.out.println("Убирает с полки испорченные продукты: ");
            System.out.println("Яблоки, " + appSpoiled.getQuantity() + " шт.");
            System.out.println("Картофель, " + potSpoiled.getQuantity() + " шт.");
            System.out.println("Остаток на полке: " + appTakenByRobot);
            System.out.println("Остаток на полке: " + potTakenByRobot);
        } else {
            System.out.println("Продолжает проверку полок. ");
            System.out.println("Остаток на полке: " + appShelf);
            System.out.println("Остаток на полке: " + potShelf);
        }
    }

}
