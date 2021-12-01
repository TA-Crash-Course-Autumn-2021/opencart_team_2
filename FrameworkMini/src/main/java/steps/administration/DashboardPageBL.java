package steps.administration;

import pages.administration.DashboardPage;
import steps.administration.currencies.CurrenciesPageBL;
import steps.administration.taxClass.TaxClassesPageBL;
import steps.administration.taxRates.TaxRatesPageBL;

public class DashboardPageBL {
    DashboardPage dashboardPage;

    public DashboardPageBL() {
        dashboardPage = new DashboardPage();
    }

    public DashboardPageBL clickMenu(String nameMenu) {
        dashboardPage.chooseMenu(nameMenu).click();
        return this;
    }
    public DashboardPageBL clickMenuSystem() {
        dashboardPage.getMenuSystem().click();
        return this;
    }
    public DashboardPageBL clickMenuCatalog() {
        dashboardPage.getMenuCatalog().click();
        return this;
    }

    public CurrenciesPageBL clickSubmenuCurrencies() {
        dashboardPage.getSubmenuCurrencies().click();
        return new CurrenciesPageBL();
    }

    public TaxClassesPageBL clickSubmenuTaxClasses() {
        dashboardPage.getSubmenuTaxClasses().click();
        return new TaxClassesPageBL();
    }

    public ProductsPageBL clickSubmenuProducts() {
        dashboardPage.getSubmenuProducts().click();
        return new ProductsPageBL();
    }

    public TaxRatesPageBL clickSubmenuTaxRates() {
        dashboardPage.getSubmenuTaxRates().click();
        return new TaxRatesPageBL();
    }
}
