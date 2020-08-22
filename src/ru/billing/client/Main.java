package ru.billing.client;

import ru.billing.stocklist.Analog;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.GenericItem;

public class Main {
    public static void main(String[] args) {
        GenericItem gI1 = new GenericItem("Laptop", 34.50f, Category.EQUIPMENT);
        GenericItem gI2 = new GenericItem("Tomato", 50.25f, Category.FOOD);
        GenericItem gI3 = new GenericItem("Keyboard", 75.50f, Category.EQUIPMENT);

        gI1.setAnalog(new Analog("Notebook", 445.23f, Category.EQUIPMENT));
        gI2.setAnalog(new Analog("Potato", 18.3f, Category.FOOD));
        gI3.setAnalog(new Analog("VoiceAssistant", 34.2f, Category.EQUIPMENT));

        gI1.printAll();
        gI2.printAll();
        gI3.printAll();
    }
}
