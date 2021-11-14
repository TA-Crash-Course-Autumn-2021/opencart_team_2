package steps;

import models.LoginModel;
import org.testng.Assert;
import pages.SuccessLoginOpenWishList;
import pages.WishListPage;
import repository.LoginModelRepository;

public class WishListPageBL {
    private WishListPage wishListPage;
    private SuccessLoginOpenWishList successLoginOpenWishList;

    public WishListPageBL() {
        wishListPage = new WishListPage();
    }
    public WishListPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();

        successLoginOpenWishList = new SuccessLoginOpenWishList();
        return this;
    }

    private void inputEmail(String email) {
        wishListPage.getEmailInput().clear();
        wishListPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        wishListPage.getPasswordInput().clear();
        wishListPage.getPasswordInput().sendKeys(password);

    }

    private void clickOnLoginButton() {
        wishListPage.getLoginButton().click();
    }

    public void verifyLoginInWishList() {
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginOpenWishList.getOpenWishList().getText(), expectedMessage, "Incorrect page title");
    }

}