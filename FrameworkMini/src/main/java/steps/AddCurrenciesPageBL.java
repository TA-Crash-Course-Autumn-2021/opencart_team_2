package steps;

import models.CurrencyModel;
import org.testng.Assert;
import pages.AddCurrenciesPage;
import repository.CurrencyModelRepository;

public class AddCurrenciesPageBL {

    private AddCurrenciesPage addCurrenciesPage;

    public AddCurrenciesPageBL() {
        addCurrenciesPage = new AddCurrenciesPage();
    }

    public AddCurrenciesPageBL registerNewCurrency() {
        CurrencyModel currencyModel = CurrencyModelRepository.getCurrencyModel();
        inputCurrencyTitle(currencyModel.getCurrencyTitle());
        inputCode(currencyModel.getCode());
        inputSymbolRight(currencyModel.getSymbolRight());
        inputDecimalPlaces(currencyModel.getDecimalPlaces());
        inputValue(currencyModel.getValue());
        clickStatusPopupMenu();
        chooseStatus(currencyModel.getStatus());
        clickOnSaveCurrencyButton();
        return this;
    }

    private void inputCurrencyTitle(String currencyTitle) {
        addCurrenciesPage.getCurrencyTitleInput().click();
        addCurrenciesPage.getCurrencyTitleInput().clear();
        addCurrenciesPage.getCurrencyTitleInput().sendKeys(currencyTitle);
    }

    private void inputCode(String code) {
        addCurrenciesPage.getCodeInput().click();
        addCurrenciesPage.getCodeInput().clear();
        addCurrenciesPage.getCodeInput().sendKeys(code);
    }

    private void inputSymbolLeft(String symbolLeft) {
        addCurrenciesPage.getSymbolLeftInput().click();
        addCurrenciesPage.getSymbolLeftInput().clear();
        addCurrenciesPage.getSymbolLeftInput().sendKeys(symbolLeft);
    }

    private void inputSymbolRight(String symbolRight) {
        addCurrenciesPage.getSymbolRightInput().click();
        addCurrenciesPage.getSymbolRightInput().clear();
        addCurrenciesPage.getSymbolRightInput().sendKeys(symbolRight);
    }

    private void inputDecimalPlaces(String decimalPlaces) {
        addCurrenciesPage.getDecimalPlacesInput().click();
        addCurrenciesPage.getDecimalPlacesInput().clear();
        addCurrenciesPage.getDecimalPlacesInput().sendKeys(decimalPlaces);
    }

    private void inputValue(String value) {
        addCurrenciesPage.getValueInput().click();
        addCurrenciesPage.getValueInput().clear();
        addCurrenciesPage.getValueInput().sendKeys(value);
    }

    private void clickStatusPopupMenu() {
        addCurrenciesPage.getStatusPopupMenu().click();
    }

    private void chooseStatus(int status) {
        addCurrenciesPage.getStatusAble(status).click();
    }

    private void clickOnSaveCurrencyButton() {
        addCurrenciesPage.getSaveCurrencyButton().click();
    }

    public CurrenciesPageBL verifyAddNewCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        Assert.assertTrue(addCurrenciesPage.getAlertSuccessAddCurrency().getText().contains(expectedMessage), "Incorrect alert");
        return new CurrenciesPageBL();
    }
}
