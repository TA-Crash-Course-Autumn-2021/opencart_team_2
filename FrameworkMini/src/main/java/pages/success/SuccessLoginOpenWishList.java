package pages.success;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SuccessLoginOpenWishList extends BasePage {
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement openWishList;

    public WebElement getOpenWishList() {
        return openWishList;
    }
}