package ru.billing.client;

import ru.billing.stocklist.FoodItem;

public class MainLab3 {
    public static void main(String[] args) {
        String string = "Конфеты 'Маска';45;120";
        String[] strings = string.split(";");
        FoodItem foodItem1 = new FoodItem(strings[0], Float.parseFloat(strings[1]), Short.parseShort(strings[2]));
        foodItem1.printAll();
    }


}
