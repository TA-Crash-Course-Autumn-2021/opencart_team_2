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

    public ProductTypePageBL clickOnMacButtons() {
        menuPage.getMac().click();
        return new ProductTypePageBL();
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

    public ProductTypePageBL clickOnMonitorsButtons() {
        menuPage.getMonitors().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnTabletsButtons() {
        menuPage.getTabletsButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnSoftwareButtons() {
        menuPage.getSoftwareButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnPhones_PDAsButtons() {
        menuPage.getPhones_PDAsButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnCamerasButtons() {
        menuPage.getCamerasButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickMP3playerButtons() {
        menuPage.getMP3playerButton().click();
        return new ProductTypePageBL();
    }
}

