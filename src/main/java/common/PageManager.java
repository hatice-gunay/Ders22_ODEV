package org.Ders22Odev.common;

import org.Ders22Odev.Drivers.DriverFactory;
import org.Ders22Odev.pages.ElementsPage;
import org.Ders22Odev.pages.WebTablesPage;

public class PageManager {
    public WebTablesPage webTablesPage;

    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablesPage = org.Ders22Odev.common.PageFactory.buildWebTablesPage();
        elementsPage = org.Ders22Odev.common.PageFactory.buildElementsPage();

    }
}
