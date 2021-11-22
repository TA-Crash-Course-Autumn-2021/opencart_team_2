package steps;

import models.LoginModel;
import org.openqa.selenium.Keys;
import pages.HeaderPage;
import pages.SearchPage;
import pages.SuccessLoginOpenWishList;
import repository.LoginModelRepository;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickSearch() {
        headerPage.getSearch().click();
        return this;
    }

    public SearchPageBL clickSearchHeaderButton() {
        headerPage.getButtonSearchHeader().click();
        return new SearchPageBL();
    }

    public HeaderPageBL clearSearch() {
        headerPage.getSearch().clear();
        return this;
    }

    public HeaderPageBL sendKeysSearch(String keyWords) {
        headerPage.getSearch().sendKeys(keyWords);
        return this;
    }

    public SearchPageBL sendKeysSearchENTER() {
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new SearchPageBL();
    }

    public AddToWishListPageBL sendKeysSearchProdENTER() {
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new AddToWishListPageBL();
    }
    public AddToComparePageBL sendKeysSearchForCompareProdENTER() {
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

    public HeaderPageBL clickOnWishListButton() {
        headerPage.getWishListButton().click();
        return this;
    }
    public WishListPageBL clickOnLoginButton() {
        headerPage.getLoginButton().click();
        return new WishListPageBL();
    }
    public CheckoutPageBL clickOnCheckoutButton() {
        headerPage.getCheckoutButton().click();
        return new CheckoutPageBL();
    }
}

