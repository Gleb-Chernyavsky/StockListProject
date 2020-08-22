package ru.billing.client;

import ru.billing.stocklist.*;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        TechnicalItem PC = new TechnicalItem();
        PC.setWarrantyTime((short)25);
        PC.setCategory(Category.EQUIPMENT);
        PC.setID(2364);
        PC.setName("Computer");
        PC.setPrice(34.30f);
        PC.setAnalog(new Analog("Phone", 341.34f, Category.EQUIPMENT));

        FoodItem sandwich = new FoodItem("Sandwich", 1.25f,  (short) 453);
        sandwich.setAnalog(new Analog("Burger", 34.34f, Category.FOOD));
        sandwich.setDateOfIncome(new Date());

        FoodItem bread = new FoodItem("bread", 1.78f, (short)28);
        bread.setAnalog(new Analog("ice cream", 34.14f, Category.FOOD));
        bread.setDateOfIncome(new Date());

        FoodItem cheese = new FoodItem("Sandwich", 1.25f, (short) 453);
        cheese.setAnalog(new Analog("Burger", 34.34f, Category.FOOD));
        cheese.setDateOfIncome(new Date());

        GenericItem[] array = new GenericItem[] {sandwich, PC};
        for (GenericItem item : array) {
            item.printAll();
        }

        System.out.println("cheese == sandwich? " + cheese.equals(sandwich));
        System.out.println("sandwich == bread? " + sandwich.equals(bread));
        System.out.println("bread.toString() = " + bread.toString());
        System.out.println("sandwich clone is: " + sandwich.clone().toString());

    }
}
