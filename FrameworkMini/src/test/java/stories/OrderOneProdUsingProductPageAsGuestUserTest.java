package stories;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.CheckoutPageBL;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class OrderOneProdUsingProductPageAsGuestUserTest extends StoriesBaseTest{
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void addProductToShoppingCartByProdPageAndCheckoutPerson()  {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCartButton()
                .verifyAddProductButton("iMac");

        //stepCheckoutPerson
        CheckoutPageBL checkoutPageBL= mainPageBL.getHeaderPageBL()
                .clickOnCheckoutButton()
                .checkoutPersonStep1()
                .checkoutPersonStep2ForGuest()
                .checkoutPersonStep4()
                .checkoutPersonStep5()
                .checkoutPersonStep6();

        checkoutPageBL.verifyCheckout();
    }

}
