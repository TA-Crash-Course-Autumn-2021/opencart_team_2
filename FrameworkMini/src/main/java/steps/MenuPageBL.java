package steps;

import pages.MenuPage;

public class MenuPageBL {
    private MenuPage menuPage;

    public MenuPageBL() {
        menuPage = new MenuPage();
    }
    public MenuPageBL clickOnDesktopsButton() {
        menuPage.getDesktopsButton().click();
        return this;
    }
    public AddToComparePageBL clickOnMacButton() {
        menuPage.getMac().click();
        return new AddToComparePageBL();
    }
    public MenuPageBL clickOnLaptops_NotebooksButton() {
        menuPage.getLaptops_NotebooksButton().click();
        return this;
    }
    public MenuPageBL clickOnComponentsButton() {
        menuPage.getComponentsButton().click();
        return this;
    }
    public AddToComparePageBL clickOnMonitorsButton() {
        menuPage.getMonitors().click();
        return new AddToComparePageBL();
    }
    public MenuPageBL clickOnTabletsButton() {
        menuPage.getTabletsButton().click();
        return this;
    }


    public AddToComparePageBL clickOnSoftwareButton() {
        menuPage.getSoftwareButton().click();
        return new AddToComparePageBL();
    }
    public AddToComparePageBL clickOnPhones_PDAsButton() {
        menuPage.getPhones_PDAsButton().click();
        return new AddToComparePageBL();
    }
    public AddToComparePageBL clickOnCamerasButton() {
        menuPage.getCamerasButton().click();
        return new AddToComparePageBL();
    }
    public MenuPageBL clickMP3playerButton() {
        menuPage.getMP3playerButton().click();
        return this;
    }
}
