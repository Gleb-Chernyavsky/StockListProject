package ru.billing.stocklist;

import java.util.Objects;

public class TechnicalItem extends GenericItem {

    private short warrantyTime;

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void printAll() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " warrantyTime is: " + warrantyTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TechnicalItem)) {
            return false;
        }

        TechnicalItem technicalItem = (TechnicalItem) obj;

        return  Objects.equals(getName(), technicalItem.getName()) &&
                getPrice() == technicalItem.getPrice() &&
                getCategory() == technicalItem.getCategory();
    }
}
