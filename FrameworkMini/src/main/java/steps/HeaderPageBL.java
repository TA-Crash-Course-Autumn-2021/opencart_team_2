package steps;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.HeaderPage;
import steps.menu.AddToComparePageBL;
import steps.user.LoginUserByWishListPageBL;
import steps.user.RegisterPageBL;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public SearchPageBL clickSearchHeaderButton() {
        headerPage.getButtonSearchHeader().click();
        return new SearchPageBL();
    }

    public SearchPageBL inputSearchAddToCart(String keyWords) {
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearch().sendKeys(keyWords);
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new SearchPageBL();
    }

    public AddToWishListPageBL inputSearchWishList(String keyWords) {
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearch().sendKeys(keyWords);
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new AddToWishListPageBL();
    }

    public AddToComparePageBL inputSearchCompare(String keyWords) {
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearch().sendKeys(keyWords);
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new AddToComparePageBL();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public WishListPageBL clickWishListButton(){
        headerPage.getWishListButton().click();
        return new WishListPageBL();
    }

    public HeaderPageBL clickOnWishListButton() {
        headerPage.getWishListButton().click();
        return this;
    }

    public LoginUserByWishListPageBL clickOnLoginButton() {
        headerPage.getLoginButton().click();
        return new LoginUserByWishListPageBL();
    }

    public CheckoutPageBL clickOnCheckoutButton() {
        headerPage.getCheckoutButton().click();
        return new CheckoutPageBL();
    }

    public HeaderPageBL clickOnCurrencyButton() {
        headerPage.getCurrencyButton().click();
        return this;
    }

    public HeaderPageBL clickOnUAHButton() {
        headerPage.getUAHButton().click();
        return this;
    }

    public HeaderPageBL getSymbolСurrentCurrency() {
        System.out.println(headerPage.getSymbolСurrentCurrency().getText());
        return this;
    }

    public String getTaxMacbookStringType() {
        String temp = headerPage.getTaxMacbook().getText().replace("Ex Tax: ", "");
        return temp.replace(headerPage.getSymbolСurrentCurrency().getText(), "");
    }

    public String getPriceMacbookStringType() {
        String withoutSymbol = headerPage.getPriceMacbook().getText().replace(headerPage.getSymbolСurrentCurrency().getText(), "");
        String temp = headerPage.getTaxMacbook().getText().replace(headerPage.getSymbolСurrentCurrency().getText(), "");
        withoutSymbol = withoutSymbol.replace("\n","");
        return withoutSymbol.replace(temp,"");
    }

    public HeaderPageBL verifyMacBookPrice() {
        String expectedMessage = "19.47";
        Assert.assertTrue(this.getPriceMacbookStringType().contains(expectedMessage), "Incorrect price MacBook");
        return this;
    }

    public HeaderPageBL verifyMacBookTax() {
        String expectedMessage = "18.83";
        Assert.assertTrue(this.getTaxMacbookStringType().contains(expectedMessage), "Incorrect tax MacBook");
        return this;
    }

}

