package steps.administration.taxRates;

import models.TaxRatesModel;
import org.testng.Assert;
import pages.administration.taxRates.EditTaxRatesPage;
import repository.taxRates.TaxRatesEditModelRepository;

public class EditTaxRatesPageBL {
    EditTaxRatesPage editTaxRatesPage;

    public EditTaxRatesPageBL() {
        editTaxRatesPage = new EditTaxRatesPage();
    }

    public EditTaxRatesPageBL registerEditTaxRates() throws InterruptedException {
        TaxRatesModel taxRatesModel = TaxRatesEditModelRepository.getTaxRatesEditModel();
        inputTaxNameTitle(taxRatesModel.getTaxName());
        inputTaxRate(taxRatesModel.getTaxRate());
        clickTypeMenu();
        editTaxRatesPage.chooseTypeSubmenu(taxRatesModel.getType()).click();
        clickGeoZoneMenu();
        Thread.sleep(40000);
        editTaxRatesPage.chooseGeoZoneSubmenu(taxRatesModel.getGeoZone()).click();
        Thread.sleep(40000);
        clickSaveButton();
        Thread.sleep(40000);
        return this;
    }

    private void inputTaxNameTitle(String taxName) {
        editTaxRatesPage.getTaxNameInput().click();
        editTaxRatesPage.getTaxNameInput().clear();
        editTaxRatesPage.getTaxNameInput().sendKeys(taxName);
    }

    private void inputTaxRate(String taxRate) {
        editTaxRatesPage.getTaxRateInput().click();
        editTaxRatesPage.getTaxRateInput().clear();
        editTaxRatesPage.getTaxRateInput().sendKeys(taxRate);
    }

    private void clickTypeMenu() {
        editTaxRatesPage.getTypeMenu().click();
    }

    private void clickGeoZoneMenu() {
        editTaxRatesPage.getGeoZoneMenu().click();
    }

    private void clickSaveButton() {
        editTaxRatesPage.getSaveButton().click();
    }

    public TaxRatesPageBL verifyEditTaxRates() {
        String expectedMessage = "Success: You have modified tax rates!";
        Assert.assertTrue(editTaxRatesPage.getAlertSuccessAddTax().getText().contains(expectedMessage), "Incorrect alert");
        return new TaxRatesPageBL();
    }
}
