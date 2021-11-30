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

    public DashboardPageBL clickMenuSystem() {
        dashboardPage.getMenuSystem().click();
        return this;
    }

    public DashboardPageBL clickSubmenuLocalisation() {
        dashboardPage.getSubmenuLocalisation().click();
        return this;
    }

    public CurrenciesPageBL clickSubmenuCurrencies() {
        dashboardPage.getSubmenuCurrencies().click();
        return new CurrenciesPageBL();
    }

    public DashboardPageBL clickSubmenuTaxes() {
        dashboardPage.getSubmenuTaxes().click();
        return this;
    }

    public TaxClassesPageBL clickSubmenuTaxClasses() {
        dashboardPage.getSubmenuTaxClasses().click();
        return new TaxClassesPageBL();
    }

    public TaxRatesPageBL clickSubmenuTaxRates() {
        dashboardPage.getSubmenuTaxRates().click();
        return new TaxRatesPageBL();
    }
}
