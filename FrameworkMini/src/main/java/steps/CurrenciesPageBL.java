package steps;

import pages.CurrenciesPage;
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

    public CurrenciesPageBL clickOnEditCurrenciesButton(String currencyTitle){
        CurrenciesContainer currency = currenciesPage.getCurrencies()
                .stream()
                .filter(e -> e.getCurrencyTitle().equals(currencyTitle))
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        currency.getActionEditButton().click();
        return this;
    }
}
