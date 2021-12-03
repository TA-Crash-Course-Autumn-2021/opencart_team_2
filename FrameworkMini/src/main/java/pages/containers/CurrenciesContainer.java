package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;


public class CurrenciesContainer extends BasePage {

    private WebElement rootElement;

    public CurrenciesContainer(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getCheckboxChooseCurrency() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public String getCurrencyTitle() {
        return rootElement.findElement(By.xpath(".//td[2]")).getText();
    }

    public String getCode() {
        return rootElement.findElement(By.xpath(".//td[3]")).getText();
    }

    public String getValue() {
        return rootElement.findElement(By.xpath(".//td[4]")).getText();
    }

    public String getLastUpdate() {
        return rootElement.findElement(By.xpath(".//td[5]")).getText();
    }

    public WebElement getActionEditButton() {
        wait.until(ExpectedConditions.visibilityOf(rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"))));
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"));
    }
}
