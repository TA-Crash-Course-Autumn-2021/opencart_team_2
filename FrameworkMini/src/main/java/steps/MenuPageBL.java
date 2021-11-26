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

    public MenuPageBL clickOnLaptops_NotebooksButton() {
        menuPage.getLaptops_NotebooksButton().click();
        return this;
    }

    public MenuPageBL clickOnComponentsButton() {
        menuPage.getComponentsButton().click();
        return this;
    }


    public AddToComparePageBL clickOnMonitorsButtonAddToComparePage() {
        menuPage.getMonitors().click();
        return new AddToComparePageBL();
    }

    public AddToComparePageBL clickOnMacButtonAddToComparePage() {
        menuPage.getMac().click();
        return new AddToComparePageBL();
    }

    public AddToComparePageBL clickOnSoftwareButtonAddToComparePage() {
        menuPage.getSoftwareButton().click();
        return new AddToComparePageBL();
    }

    public AddToComparePageBL clickOnPhones_PDAsButtonAddToComparePage() {
        menuPage.getPhones_PDAsButton().click();
        return new AddToComparePageBL();
    }

    public AddToComparePageBL clickOnCamerasButtonAddToComparePage() {
        menuPage.getCamerasButton().click();
        return new AddToComparePageBL();
    }

    public MenuPageBL clickMP3playerButton() {
        menuPage.getMP3playerButton().click();
        return this;
    }

    public ProductTypePageBL clickOnMonitorsButton() {
        menuPage.getMonitors().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnTabletsButton() {
        menuPage.getTabletsButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnSoftwareButton() {
        menuPage.getSoftwareButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnPhones_PDAsButton() {
        menuPage.getPhones_PDAsButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnCamerasButton() {
        menuPage.getCamerasButton().click();
        return new ProductTypePageBL();
    }

    public ProductTypePageBL clickOnMacButton() {
        menuPage.getMac().click();
        return new ProductTypePageBL();
    }
}

