package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppleCinemaPage extends BasePage {

    public WebElement getRadioButton(int value) {  //value = 5 or 6 or 7
        return driver.findElement(By.xpath("//label//input[@type = 'radio' and @value = '" + value + "']"));
    }

    public WebElement getCheckbox(int value) {     //value = 8 or 9 or 10 or 11
        return driver.findElement(By.xpath("//label//input[@type = 'checkbox' and @value = '" + value + "']"));
    }

    @FindBy(xpath = "//button[starts-with(@id,'button-upload')]")
    private WebElement uploadFileButton;

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Text']/../input")
    private WebElement inputText;

    @FindBy(xpath = "//select[contains(@id, 'input-option')]")
    private WebElement selectButton;

    @FindBy(xpath = "//textarea[contains(@id, 'input-option')]")
    private WebElement inputTextarea;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD']")
    private WebElement inputDate;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='HH:mm']")
    private WebElement inputTime;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD HH:mm']")
    private WebElement inputDateAndTime;

    @FindBy(id = "input-quantity")
    private WebElement inputQuantity;

    @FindBy(id = "button-cart")
    private WebElement inputButtonAddToCart;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement successTitle;

    public WebElement getInputText() {
        wait.until(ExpectedConditions.visibilityOf(inputText));
        return inputText;
    }

    public WebElement getUploadFileButton() {
        wait.until(ExpectedConditions.visibilityOf(uploadFileButton));
        return uploadFileButton;
    }

    public WebElement getSelectButton() {
        wait.until(ExpectedConditions.visibilityOf(selectButton));
        return selectButton;
    }

    public WebElement chooseSelectOption(int value) {   //value = 5 or 6 or 7
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]//option[@value = '" + value + "']"));
    }

    public WebElement getInputTextarea() {
        wait.until(ExpectedConditions.visibilityOf(inputTextarea));
        return inputTextarea;
    }

    public WebElement getInputDate() {
        wait.until(ExpectedConditions.visibilityOf(inputDate));
        return inputDate;
    }

    public WebElement getInputTime() {
        wait.until(ExpectedConditions.visibilityOf(inputTime));
        return inputTime;
    }

    public WebElement getInputDateAndTime() {
        wait.until(ExpectedConditions.visibilityOf(inputDateAndTime));
        return inputDateAndTime;
    }

    public WebElement getInputQuantity() {
        wait.until(ExpectedConditions.visibilityOf(inputQuantity));
        return inputQuantity;
    }

    public WebElement getInputButtonAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(inputButtonAddToCart));
        return inputButtonAddToCart;
    }

    public WebElement getSuccessTitle() {
        wait.until(ExpectedConditions.visibilityOf(successTitle));
        return successTitle;
    }
}
