package ru.billing.client;

import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

public class Main6 {
    public static void main(String[] args) throws ItemAlreadyExistsException, CatalogLoadException {
        String path = "C:\\Users\\gleb7\\Desktop\\projects_by_java\\StockListProject\\src\\ru\\billing\\client\\items";
        CatalogFileLoader cFL = new CatalogFileLoader(path);
        ItemCatalog iCat = new ItemCatalog();
        System.out.println("Catalog before: ");
        iCat.printItems();
        cFL.load(iCat);
        System.out.println("Catalog after: ");
        iCat.printItems();
    }
}
