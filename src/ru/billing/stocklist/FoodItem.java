package ru.billing.stocklist;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {

    private Date dateOfIncome;

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    private short expires;

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0, null, null, (short)0);
    }

    @Override
    public String toString() {
        return super.toString() + "; expires is: " + expires  + "; dateOfIncome: " + dateOfIncome +" .";
    }

    @Override
    public void printAll() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FoodItem)) {
            return false;
        }

        FoodItem foodItem = (FoodItem) obj;

        return  Objects.equals(getName(), foodItem.getName()) &&
                getPrice() == foodItem.getPrice() &&
                getCategory() == foodItem.getCategory();
    }

}
