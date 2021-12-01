package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.containers.ProductContainer;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Search']")
    private WebElement titleOfSearch;

    @FindBy(id = "input-search")
    private WebElement searchCriteria;

    @FindBy(id = "description")
    private WebElement searchInProductDescriptions;

    @FindBy(name = "category_id")
    private WebElement category;

    public WebElement chooseCategoryProduct(String product) {
        return driver.findElement(By.xpath("//option[text() = '" + product + "']")); //Cameras
    }

    @FindBy(name = "sub_category")
    private WebElement subCategory;

    @FindBy(id = "button-search")
    private WebElement buttonSearchGlobal;

    @FindBy(xpath = "//h2")
    private WebElement headerMeeting;

    @FindBy(xpath = "//p[text() = 'There is no product that matches the search criteria.']")
    private WebElement titleNoProduct;

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']//strong")
    private WebElement symbolСurrentCurrency;

    @FindBy(xpath = "//a[text()='iMac']/../following-sibling::p[@class='price']")
    private WebElement priceiMac;

    @FindBy(xpath = "//a[text()='iMac']/../following-sibling::p[@class='price']//span[@class='price-tax']")
    private WebElement taxiMac;

    @FindBy(xpath = "//*[contains(@class, 'product-layout product-grid')]")
    List<WebElement> products;

    public WebElement getTitleOfSearch() {
        return titleOfSearch;
    }

    public WebElement getSearchCriteria() {
        return searchCriteria;
    }

    public WebElement getSearchInProductDescriptions() {
        return searchInProductDescriptions;
    }

    public WebElement getCategory() {
        return category;
    }

    public WebElement getSubCategory() {
        return subCategory;
    }

    public WebElement getButtonSearchGlobal() {
        return buttonSearchGlobal;
    }

    public WebElement getHeaderMeeting() {
        return headerMeeting;
    }

    public WebElement getTitleNoProduct() {
        return titleNoProduct;
    }

    public WebElement getTitleOfSearchProduct(String product) {
        return driver.findElement(By.xpath("//h1[text()='Search - " + product + "']")); //HTC Touch HD
    }

    public WebElement getSymbolСurrentCurrency() {
        return symbolСurrentCurrency;
    }

    public WebElement getPriceiMac() {
        wait.until(ExpectedConditions.visibilityOf(priceiMac));
        return priceiMac;
    }

    public WebElement getTaxiMac() {
        wait.until(ExpectedConditions.visibilityOf(taxiMac));
        return taxiMac;
    }

    public List<ProductContainer> getProducts() {
        return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }

    @FindBy(xpath = "//img[contains(@title, 'Apple Cinema 30')]/../../../div//div[@class='button-group']//button[contains(@onclick,'cart.add')]")
    private WebElement buttonAddAppleCinema30;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    public WebElement getAddToCartAppleCinema30() {
        return buttonAddAppleCinema30;
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
}
