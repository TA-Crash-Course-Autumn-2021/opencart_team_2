package steps;

import models.TaxClassesModel;
import org.testng.Assert;
import pages.AddTaxClassesPage;
import repository.TaxClassesModelRepository;

public class AddTaxClassesPageBL {

    AddTaxClassesPage addTaxClassesPage;

    public AddTaxClassesPageBL() {
        addTaxClassesPage = new AddTaxClassesPage();
    }

    public AddTaxClassesPageBL addTaxClasses() {
        TaxClassesModel taxClassesModel = TaxClassesModelRepository.getTaxClassesModel();
        inputTaxClassTitle(taxClassesModel.getTaxClassTitle());
        inputDescription(taxClassesModel.getDescription());
        clickAddRuleButton();
        clickTaxRateMenu();
        addTaxClassesPage.chooseTaxRateSubmenu(taxClassesModel.getTaxRate());
        clickBasedOnMenu();
        addTaxClassesPage.chooseBasedOnSubmenu(taxClassesModel.getBasedOn());
        inputPriority(taxClassesModel.getPriority());
        clickSaveButton();
        return this;
    }

    private void inputTaxClassTitle(String classTitle) {
        addTaxClassesPage.getTaxClassTitleInput().sendKeys(classTitle);
    }

    private void inputDescription(String description) {
        addTaxClassesPage.getDescriptionInput().sendKeys(description);
    }

    private void clickAddRuleButton() {
        addTaxClassesPage.getAddRuleButton().click();
    }

    private void clickTaxRateMenu() {
        addTaxClassesPage.getTaxRateMenu().click();
    }

    private void clickBasedOnMenu() {
        addTaxClassesPage.getBasedOnMenu().click();
    }

    private void inputPriority(String priority) {
        addTaxClassesPage.getPriorityInput().sendKeys(priority);
    }

    private void clickSaveButton() {
        addTaxClassesPage.getSaveButton().click();
    }

    public TaxClassesPageBL verifyAddNewTaxClasses() {
        String expectedMessage = "Success: You have modified tax classes!";
        Assert.assertTrue(addTaxClassesPage.getAlertSuccessAddTax().getText().contains(expectedMessage), "Incorrect alert");
        return new TaxClassesPageBL();
    }
}
