package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ProductAdminContainer extends BasePage {

    private WebElement rootElement;

    public ProductAdminContainer(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getCheckboxChooseProduct() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public String getNameProduct() {
        return rootElement.findElement(By.xpath(".//td[3]")).getText();
    }

    public WebElement getModel() {
        return rootElement.findElement(By.xpath(".//td[4]"));
    }

    public WebElement getPrice() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }

    public WebElement getQuantity() {
        return rootElement.findElement(By.xpath(".//td[6]"));
    }

    public WebElement getStatus() {
        return rootElement.findElement(By.xpath(".//td[7]"));
    }

    public WebElement getEditButton() {
        wait.until(ExpectedConditions.visibilityOf(rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"))));
        return rootElement.findElement(By.xpath(".//*[@data-original-title='Edit']"));
    }
}

