package pages.success;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class SuccessCheckoutPage extends BasePage {
    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successTitle2;

    public WebElement getSuccessTitle2() {
        wait.until(ExpectedConditions.titleIs("Your order has been placed!"));
        return driver.findElement(By.xpath(".//*[@id='content']/h1"));
    }

}
