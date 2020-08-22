package ru.billing.client;

import ru.billing.stocklist.ItemCatalog;
import ru.billing.stocklist.*;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class MainLab4 {
    public static void main(String[] args) throws ItemAlreadyExistsException, CatalogLoadException {
        ItemCatalog itemCatalog = new ItemCatalog();
        GenericItem g1 = new GenericItem();
        GenericItem g2 = new GenericItem();
        GenericItem g3 = new GenericItem();
        GenericItem g4 = new GenericItem();
        GenericItem g5 = new GenericItem();
        GenericItem g6 = new GenericItem();
        GenericItem g7 = new GenericItem();
        GenericItem g8 = new GenericItem();
        GenericItem g9 = new GenericItem();
        GenericItem g10 = new GenericItem();
        GenericItem[] genericItems = {g1, g2, g3, g4, g5, g6, g7, g8, g9, g10};

        for (GenericItem item : genericItems) {
            itemCatalog.addItem(item);
        }

        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++) itemCatalog.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        ItemCatalog cat = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);
        cat.printItems();
    }
}


