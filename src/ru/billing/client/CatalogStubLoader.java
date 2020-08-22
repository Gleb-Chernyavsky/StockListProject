package ru.billing.client;

import ru.billing.stocklist.*;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;
import java.util.Scanner;


class CatalogStubLoader implements CatalogLoader {

    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        GenericItem item12 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        item12.setID(item1.getID());
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short) 10);
        try {
            cat.addItem(item1);
            cat.addItem(item12);
            cat.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
           e.printStackTrace();
           throw new CatalogLoadException(e);
        }
    }
}
