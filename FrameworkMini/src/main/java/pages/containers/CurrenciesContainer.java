package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class CurrenciesContainer extends BasePage {

    private WebElement rootElement;

    public CurrenciesContainer(WebElement element) {
        this.rootElement = element;
    }

    private List<WebElement> getCurrencies() {
        return rootElement.findElements(By.xpath("//tbody//tr"));
    }

    public String getCurrencyTitle() {
        return rootElement.findElement(By.xpath("/td[3]")).getText();
    }

    public String getCode() {
        return rootElement.findElement(By.xpath("/td[3]")).getText();
    }

    public String getValue() {
        return rootElement.findElement(By.xpath("/td[4]")).getText();
    }

    public String getLastUpdate() {
        return rootElement.findElement(By.xpath("/td[5]")).getText();
    }

    public WebElement getActionEditButton() {
        wait.until(ExpectedConditions.visibilityOf(rootElement.findElement(By.xpath("//*[@data-original-title='Edit']"))));
        return rootElement.findElement(By.xpath("//*[@data-original-title='Edit']"));
    }
}
