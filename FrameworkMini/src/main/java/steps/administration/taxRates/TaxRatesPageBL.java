package steps.administration.taxRates;

import org.testng.Assert;
import pages.administration.taxRates.TaxRatesPage;
import pages.containers.TaxRatesContainer;

public class TaxRatesPageBL {
    TaxRatesPage taxRatesPage;

    public TaxRatesPageBL() {
        taxRatesPage = new TaxRatesPage();
    }

    public AddTaxRatesPageBL clickAddTaxButton() {
        taxRatesPage.getAddTaxButton().click();
        return new AddTaxRatesPageBL();
    }


    public EditTaxRatesPageBL clickOnEditTaxRatesButton(String taxTitle){
        TaxRatesContainer tax = taxRatesPage.getTaxes()
                .stream()
                .filter(e -> e.getTaxNameTitle().equals(taxTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        tax.getActionEditTaxButton().click();
        return new EditTaxRatesPageBL();
    }

    public TaxRatesPageBL clickChooseTaxRatesCheckbox(String currencyTitle){
        TaxRatesContainer currency = taxRatesPage.getTaxes()
                .stream()
                .filter(e -> e.getTaxNameTitle().equals(currencyTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        currency.getCheckboxChooseTaxRates().click();
        return this;
    }

    public TaxRatesPageBL clickOnDeleteTaxRatesButton() {
        taxRatesPage.getDeleteTaxRatesButton().click();
        return this;
    }

    public TaxRatesPageBL confirmDeleteTaxRates() {
        taxRatesPage.getAlertSubmitDeleteTaxRates().accept();
        return this;
    }

    public void verifyDeleteTaxRates() {
        String expectedMessage = "Success: You have modified tax rates!";
        Assert.assertTrue(taxRatesPage.getAlertSuccessDeleteTaxRates().getText().contains(expectedMessage), "Incorrect alert");
    }
}
