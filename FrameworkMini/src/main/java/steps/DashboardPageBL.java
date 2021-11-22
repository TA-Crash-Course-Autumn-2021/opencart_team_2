package steps;

import pages.DashboardPage;

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
}
