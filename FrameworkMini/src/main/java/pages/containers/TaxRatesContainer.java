package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class TaxRatesContainer extends BasePage {

    private WebElement rootElement;

    public TaxRatesContainer(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getCheckboxChooseTaxRates() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public String getTaxNameTitle() {
        return rootElement.findElement(By.xpath(".//td[2]")).getText();
    }

    public WebElement getTaxRate() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }

    public String getType() {
        return rootElement.findElement(By.xpath(".//td[4]")).getText();
    }

    public WebElement getGeoZone() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }

    public WebElement getDateAdded() {
        return rootElement.findElement(By.xpath(".//td[6]"));
    }

    public String getDateModified() {
        return rootElement.findElement(By.xpath(".//td[7]")).getText();
    }

    public WebElement getActionEditTaxButton() {
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"));
    }
}
