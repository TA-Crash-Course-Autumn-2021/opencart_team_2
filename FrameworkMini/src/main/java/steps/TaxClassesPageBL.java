package steps;


import org.testng.Assert;
import pages.TaxClassesPage;
import pages.containers.CurrenciesContainer;
import pages.containers.TaxClassContainer;

public class TaxClassesPageBL {

    TaxClassesPage taxClassesPage;

    public TaxClassesPageBL() {
        taxClassesPage = new TaxClassesPage();
    }

    public AddTaxClassesPageBL clickAddTaxButton() {
        taxClassesPage.getAddTaxButton().click();
        return new AddTaxClassesPageBL();
    }

    public EditTaxClassPageBL clickOnEditTaxButton(String taxTitle){
        TaxClassContainer tax = taxClassesPage.getTaxes()
                .stream()
                .filter(e -> e.getTaxClassTitle().equals(taxTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        tax.getActionEditTaxButton().click();
        return new EditTaxClassPageBL();
    }

    public TaxClassesPageBL clickChooseTaxClassesCheckbox(String currencyTitle){
        TaxClassContainer currency = taxClassesPage.getTaxes()
                .stream()
                .filter(e -> e.getTaxClassTitle().equals(currencyTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        currency.getCheckboxChooseTaxClass().click();
        return this;
    }

    public TaxClassesPageBL clickOnDeleteTaxClassesButton() {
        taxClassesPage.getDeleteTaxClassesButton().click();
        return this;
    }

    public TaxClassesPageBL confirmDeleteTaxClasses() {
        taxClassesPage.getAlertSubmitDeleteTaxClasses().accept();
        return this;
    }

    public void verifyDeleteTaxClasses() {
        String expectedMessage = "Success: You have modified tax classes!";
        Assert.assertTrue(taxClassesPage.getAlertSuccessDeleteTaxClasses().getText().contains(expectedMessage), "Incorrect alert");
    }
}
