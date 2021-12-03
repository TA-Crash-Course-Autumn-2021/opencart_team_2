package steps.administration.currencies;

import org.testng.Assert;
import pages.administration.currencies.CurrenciesPage;
import pages.containers.CurrenciesContainer;

public class CurrenciesPageBL {
    CurrenciesPage currenciesPage;

    public CurrenciesPageBL(){
        currenciesPage = new CurrenciesPage();
    }

    public AddCurrenciesPageBL clickOnAddNewCurrencyButton() {
        currenciesPage.getAddNewCurrencyButton().click();
        return new AddCurrenciesPageBL();
    }

    public CurrenciesPageBL clickOnDeleteCurrencyButton() {
        currenciesPage.getDeleteCurrencyButton().click();
        return this;
    }

    public CurrenciesPageBL confirmDeleteCurrency() {
        currenciesPage.getAlertSubmitAddCurrency().accept();
        return this;
    }

    public EditCurrenciesPageBL clickOnEditCurrenciesButton(String currencyTitle){
        CurrenciesContainer currency = currenciesPage.getCurrencies()
                .stream()
                .filter(e -> e.getCurrencyTitle().equals(currencyTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        currency.getActionEditButton().click();
        return new EditCurrenciesPageBL();
    }

    public CurrenciesPageBL clickChooseCurrencyCheckbox(String currencyTitle){
        CurrenciesContainer currency = currenciesPage.getCurrencies()
                .stream()
                .filter(e -> e.getCurrencyTitle().equals(currencyTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        currency.getCheckboxChooseCurrency().click();
        return this;
    }

    public void verifyDeleteCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        Assert.assertTrue(currenciesPage.getAlertSuccessDeleteCurrency().getText().contains(expectedMessage), "Incorrect page title");
    }
}
