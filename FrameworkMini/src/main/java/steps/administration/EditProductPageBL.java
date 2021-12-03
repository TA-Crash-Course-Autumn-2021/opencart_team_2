package steps.administration;

import pages.administration.EditProductPage;

public class EditProductPageBL {

    EditProductPage editProductPageBL;

    public EditProductPageBL() {
        editProductPageBL = new EditProductPage();
    }

    public EditProductPageBL clickOnDataButton() {
        editProductPageBL.getDataButton().click();
        return this;
    }

    public EditProductPageBL clickOnTaxMenu() {
        editProductPageBL.getTaxMenu().click();
        return this;
    }

    public EditProductPageBL clickTaxableGoodsMenu() {
        editProductPageBL.getTaxableGoodsMenu().click();
        return this;
    }

    public EditProductPageBL clickSaveButton() {
        editProductPageBL.getSaveButton().click();
        return this;
    }
}
