package steps;

import models.TaxRatesModel;
import org.testng.Assert;
import pages.AddTaxRatesPage;
import repository.TaxRatesModelRepository;

public class AddTaxRatesPageBL {
    AddTaxRatesPage addTexRatesPage;

    public AddTaxRatesPageBL() {
        addTexRatesPage = new AddTaxRatesPage();
    }

    public AddTaxRatesPageBL addTaxRates() {
        TaxRatesModel taxRatesModel = TaxRatesModelRepository.getTaxRatesModel();
        inputTaxNameTitle(taxRatesModel.getTaxName());
        inputTaxRate(taxRatesModel.getTaxRate());
        clickTypeMenu();
        addTexRatesPage.chooseTypeSubmenu(taxRatesModel.getType());
        clickGeoZoneMenu();
        addTexRatesPage.chooseGeoZoneSubmenu(taxRatesModel.getGeoZone());
        clickSaveButton();
        return this;
    }

    private void inputTaxNameTitle(String taxName) {
        addTexRatesPage.getTaxNameInput().sendKeys(taxName);
    }

    private void inputTaxRate(String taxRate) {
        addTexRatesPage.getTaxRateInput().sendKeys(taxRate);
    }

    private void clickTypeMenu() {
        addTexRatesPage.getTypeMenu().click();
    }

    private void clickGeoZoneMenu() {
        addTexRatesPage.getGeoZoneMenu().click();
    }

    private void clickSaveButton() {
        addTexRatesPage.getSaveButton().click();
    }

    public TaxRatesPageBL verifyAddNewTaxRates() {
        String expectedMessage = "Success: You have modified tax rates!";
        Assert.assertTrue(addTexRatesPage.getAlertSuccessAddTax().getText().contains(expectedMessage), "Incorrect alert");
        return new TaxRatesPageBL();
    }
}
