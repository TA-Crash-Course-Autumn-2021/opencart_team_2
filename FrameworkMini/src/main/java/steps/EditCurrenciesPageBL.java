package steps;

import models.CurrencyModel;
import org.testng.Assert;
import pages.EditCurrenciesPage;
import repository.CurrencyEditModelRepository;
import repository.CurrencyModelRepository;

public class EditCurrenciesPageBL {

    private EditCurrenciesPage editCurrenciesPage;

    public EditCurrenciesPageBL() {
        editCurrenciesPage = new EditCurrenciesPage();
    }

    public EditCurrenciesPageBL registerNewCurrency() {
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


    public EditCurrenciesPageBL registerEditCurrency() {
        CurrencyModel currencyEditModel = CurrencyEditModelRepository.getCurrencyEditModel();
        inputCurrencyTitle(currencyEditModel.getCurrencyTitle());
        inputCode(currencyEditModel.getCode());
        inputSymbolRight(currencyEditModel.getSymbolRight());
        inputDecimalPlaces(currencyEditModel.getDecimalPlaces());
        inputValue(currencyEditModel.getValue());
        clickStatusPopupMenu();
        chooseStatus(currencyEditModel.getStatus());
        clickOnSaveCurrencyButton();
        return this;
    }

    private void inputCurrencyTitle(String currencyTitle) {
        editCurrenciesPage.getCurrencyTitleInput().click();
        editCurrenciesPage.getCurrencyTitleInput().clear();
        editCurrenciesPage.getCurrencyTitleInput().sendKeys(currencyTitle);
    }

    private void inputCode(String code) {
        editCurrenciesPage.getCodeInput().click();
        editCurrenciesPage.getCodeInput().clear();
        editCurrenciesPage.getCodeInput().sendKeys(code);
    }

    private void inputSymbolLeft(String symbolLeft) {
        editCurrenciesPage.getSymbolLeftInput().click();
        editCurrenciesPage.getSymbolLeftInput().clear();
        editCurrenciesPage.getSymbolLeftInput().sendKeys(symbolLeft);
    }

    private void inputSymbolRight(String symbolRight) {
        editCurrenciesPage.getSymbolRightInput().click();
        editCurrenciesPage.getSymbolRightInput().clear();
        editCurrenciesPage.getSymbolRightInput().sendKeys(symbolRight);
    }

    private void inputDecimalPlaces(String decimalPlaces) {
        editCurrenciesPage.getDecimalPlacesInput().click();
        editCurrenciesPage.getDecimalPlacesInput().clear();
        editCurrenciesPage.getDecimalPlacesInput().sendKeys(decimalPlaces);
    }

    private void inputValue(String value) {
        editCurrenciesPage.getValueInput().click();
        editCurrenciesPage.getValueInput().clear();
        editCurrenciesPage.getValueInput().sendKeys(value);
    }

    private void clickStatusPopupMenu() {
        editCurrenciesPage.getStatusPopupMenu().click();
    }

    private void chooseStatus(int status) {
        editCurrenciesPage.getStatusAble(status).click();
    }

    private void clickOnSaveCurrencyButton() {
        editCurrenciesPage.getSaveCurrencyButton().click();
    }

    public void verifyEditCurrency() {
        String expectedMessage = "Success: You have modified currencies!";
        Assert.assertTrue(editCurrenciesPage.getAlertSuccessAddCurrency().getText().contains(expectedMessage), "Incorrect page title");
    }
}
