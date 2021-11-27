package steps;

import models.TaxClassesModel;
import org.testng.Assert;
import pages.EditTaxClassPage;
import repository.TaxClassEditModelRepository;

public class EditTaxClassPageBL {

    EditTaxClassPage editTaxClassPage;

    public EditTaxClassPageBL() {
        editTaxClassPage = new EditTaxClassPage();
    }

    public EditTaxClassPageBL editTaxClasses() {
        TaxClassesModel taxClassesModel = TaxClassEditModelRepository.getTaxClassesModel();
        inputTaxClassTitle(taxClassesModel.getTaxClassTitle());
        inputDescription(taxClassesModel.getDescription());
        clickAddRuleButton();
        clickTaxRateMenu();
        editTaxClassPage.chooseTaxRateSubmenu(taxClassesModel.getTaxRate());
        clickBasedOnMenu();
        editTaxClassPage.chooseBasedOnSubmenu(taxClassesModel.getBasedOn());
        inputPriority(taxClassesModel.getPriority());
        clickSaveButton();
        return this;
    }

    private void inputTaxClassTitle(String classTitle) {
        editTaxClassPage.getTaxClassTitleInput().click();
        editTaxClassPage.getTaxClassTitleInput().clear();
        editTaxClassPage.getTaxClassTitleInput().sendKeys(classTitle);
    }

    private void inputDescription(String description) {
        editTaxClassPage.getDescriptionInput().click();
        editTaxClassPage.getDescriptionInput().clear();
        editTaxClassPage.getDescriptionInput().sendKeys(description);
    }

    private void clickAddRuleButton() {
        editTaxClassPage.getAddRuleButton().click();
    }

    private void clickTaxRateMenu() {
        editTaxClassPage.getTaxRateMenu().click();
    }

    private void clickBasedOnMenu() {
        editTaxClassPage.getBasedOnMenu().click();
    }

    private void inputPriority(String priority) {
        editTaxClassPage.getPriorityInput().click();
        editTaxClassPage.getPriorityInput().clear();
        editTaxClassPage.getPriorityInput().sendKeys(priority);
    }

    private void clickSaveButton() {
        editTaxClassPage.getSaveButton().click();
    }

    public TaxClassesPageBL verifyEditTaxClasses() {
        String expectedMessage = "Success: You have modified tax classes!";
        Assert.assertTrue(editTaxClassPage.getAlertSuccessAddTax().getText().contains(expectedMessage), "Incorrect alert");
        return new TaxClassesPageBL();
    }
}
