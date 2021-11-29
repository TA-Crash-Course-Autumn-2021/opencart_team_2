package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class TaxClassContainer extends BasePage {

    private WebElement rootElement;

    public TaxClassContainer(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getCheckboxChooseTaxClass() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public String getTaxClassTitle() {
        return rootElement.findElement(By.xpath(".//td[2]")).getText();
    }

    public WebElement getActionEditTaxButton() {
        wait.until(ExpectedConditions.visibilityOf(rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"))));
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"));
    }
}
