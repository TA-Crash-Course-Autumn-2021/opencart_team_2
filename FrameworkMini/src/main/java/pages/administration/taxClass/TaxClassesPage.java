package pages.administration.taxClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.containers.TaxClassContainer;

import java.util.List;
import java.util.stream.Collectors;

public class TaxClassesPage extends BasePage {

    @FindBy(xpath = "//*[@data-original-title='Add New']")
    WebElement addTaxButton;

    @FindBy(xpath = "//tbody//tr")
    List<WebElement> taxes;

    @FindBy(xpath = "//*[@data-original-title='Delete']")
    WebElement deleteTaxClassesButton;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    WebElement alertSuccessDeleteTaxClasses;

    public WebElement getAddTaxButton(){
        wait.until(ExpectedConditions.visibilityOf(addTaxButton));
        return addTaxButton;
    }

    public List<TaxClassContainer> getTaxes() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='panel-title']"))));
        return taxes.stream().map(TaxClassContainer::new).collect(Collectors.toList());
    }

    public WebElement getDeleteTaxClassesButton(){
        return deleteTaxClassesButton;
    }

    public WebElement getAlertSuccessDeleteTaxClasses() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessDeleteTaxClasses));
        return alertSuccessDeleteTaxClasses;
    }

    public Alert getAlertSubmitDeleteTaxClasses() {
        return driver.switchTo().alert();
    }
}
