package ru.billing.client;

import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

public interface CatalogLoader {

    void load(ItemCatalog cat) throws ItemAlreadyExistsException, CatalogLoadException;

}
