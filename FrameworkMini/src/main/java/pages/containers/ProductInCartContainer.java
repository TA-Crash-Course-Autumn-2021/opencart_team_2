package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ProductInCartContainer extends BasePage {
    private WebElement rootElement;

    public ProductInCartContainer(WebElement element) {
        this.rootElement = element;
    }

    public String getTitleCart() {
        return rootElement.findElement(By.xpath(".//*[@class = 'text-left']/a")).getText();
    }

    public WebElement getTitleButton() {
        return rootElement.findElement(By.xpath(".//*[@class = 'text-left']/a"));
    }


    public String getUnitPrice(){
        return rootElement.findElement(By.xpath(".//td[@class = 'text-right'][1]")).getText();
    }

    public String getTotalPrice(){
        return rootElement.findElement(By.xpath(".//td[@class = 'text-right'][2]")).getText();
    }

    public WebElement getUpDate(){
        return rootElement.findElement(By.xpath(".//*[@data-original-title = 'Update']"));
    }

    public WebElement getRemove(){
        return rootElement.findElement(By.xpath(".//*[@data-original-title = 'Remove']"));
    }

    public  WebElement getCount(){
        return rootElement.findElement(By.xpath(".//input[@class='form-control' and @size='1']"));
    }
}
