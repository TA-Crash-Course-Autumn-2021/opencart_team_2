package steps;

import models.AppleCinemaModel;
import org.testng.Assert;
import pages.AppleCinemaPage;
import repository.AppleCinemaModelRepository;
import util.DriverUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class AppleCinemaPageBL {

    private AppleCinemaPage appleCinemaPage;

    public AppleCinemaPageBL() {
        appleCinemaPage = new AppleCinemaPage();
    }

    public AppleCinemaPageBL registerAppleCinema() {
        AppleCinemaModel appleCinemaModel = AppleCinemaModelRepository.getAppleCinemaModel();
        inputText(appleCinemaModel.getText());
        chooseRadio(appleCinemaModel.getRadio());
        chooseCheckbox(appleCinemaModel.getCheckbox());
        chooseSelect(appleCinemaModel.getSelect());
        inputTextarea(appleCinemaModel.getTextarea());
        inputDate(appleCinemaModel.getDate());
        inputTime(appleCinemaModel.getTime());
        inputDateAndTime(appleCinemaModel.getDateAndTime());
        inputQuantity(appleCinemaModel.getQty());
        uploadFileByButton(appleCinemaModel.getFile());
        clickOnAddToCartButton();
        return this;
    }

    private void chooseRadio(int value) {
        new DriverUtils().clickOnElementJS(appleCinemaPage.getRadioButton(value));
    }

    private void chooseCheckbox(int value) {
        new DriverUtils().clickOnElementJS(appleCinemaPage.getCheckbox(value));
    }

    private void clickText() {
        appleCinemaPage.getInputText().click();
    }

    private void clearText() {
        appleCinemaPage.getInputText().clear();
    }

    private void inputText(String str) {
        clickText();
        clearText();
        appleCinemaPage.getInputText().sendKeys(str);
    }

    private void clickSelect() {
        appleCinemaPage.getSelectButton().click();
    }

    private void chooseSelect(int value) {
        clickSelect();
        appleCinemaPage.chooseSelectOption(value).click();
    }

    private void clickTextarea() {
        appleCinemaPage.getInputTextarea().click();
    }

    private void clearTextarea() {
        appleCinemaPage.getInputTextarea().clear();
    }

    private void inputTextarea(String str) {
        clickTextarea();
        clearTextarea();
        appleCinemaPage.getInputTextarea().sendKeys(str);
    }

    private void clickDate() {
        appleCinemaPage.getInputDate().click();
    }

    private void clearDate() {
        appleCinemaPage.getInputDate().clear();
    }

    private void inputDate(String str) {
        clickDate();
        clearDate();
        appleCinemaPage.getInputDate().sendKeys(str);
    }

    private void clickTime() {
        appleCinemaPage.getInputTime().click();
    }

    private void clearTime() {
        appleCinemaPage.getInputTime().clear();
    }

    private void inputTime(String str) {
        clickTime();
        clearTime();
        appleCinemaPage.getInputTime().sendKeys(str);
    }

    private void clickDateAndTime() {
        appleCinemaPage.getInputDateAndTime().click();
    }

    private void clearDateAndTime() {
        appleCinemaPage.getInputDateAndTime().clear();
    }

    private void inputDateAndTime(String str) {
        clickDateAndTime();
        clearDateAndTime();
        appleCinemaPage.getInputDateAndTime().sendKeys(str);
    }

    private void clickInputQuantity() {
        appleCinemaPage.getInputQuantity().click();
    }

    private void clearInputQuantity() {
        appleCinemaPage.getInputQuantity().clear();
    }

    private void inputQuantity(String qty) {
        clickInputQuantity();
        clearInputQuantity();
        appleCinemaPage.getInputQuantity().sendKeys(qty);
    }

    private void uploadFileByButton(String path) {
        File file = new File(path);
        StringSelection absolutePath = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(absolutePath, null);
        appleCinemaPage.getUploadFileButton().click();
       // appleCinemaPage.getUploadFileButton().sendKeys(path);
        try {
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private void clickOnAddToCartButton() {
        appleCinemaPage.getInputButtonAddToCart().click();
    }

    public void verifyAppleCinema() {
        String expectedMessage = "Success";
        String nameItem = "Apple Cinema 30";
        Assert.assertTrue(appleCinemaPage.getSuccessTitle().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(appleCinemaPage.getSuccessTitle().getText().contains(nameItem), "Other item");
    }
}
