package ru.billing.stocklist;

import java.util.Objects;

public class GenericItem {
    private float price;
    private int ID;
    private String name;
    private GenericItem analog;
    private Category category = Category.GENERAL;
    private static int currentID = 1;


    public GenericItem(String name, float price, Category category) {
        this();
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(name, price, (Category)null);
        this.analog = analog;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }


    public void printAll() {
        System.out.println(toString());
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Analog(name, price, category);
    }

    @Override
    public String toString() {
        if(analog != null) {

            return String.format("ID: %d; name: %s; price: %.2f; category: %s; analog: %s", ID, name, price, category, analog.name);
        } else {
            return String.format("ID: %d; name: %s; price: %.2f; category: %s; analog: %s", ID, name, price, category, "none");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof GenericItem)) {
            return false;
        }

        GenericItem genericItem = (GenericItem) obj;

        return ID == genericItem.ID &&
                Objects.equals(name, genericItem.name) &&
                price == genericItem.price &&
                category == genericItem.category;
    }
}
