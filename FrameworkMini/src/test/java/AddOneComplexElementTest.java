import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AppleCinemaPageBL;
import steps.MainPageBL;
import steps.MiniCartPageBL;

import static enums.URLs.BASE_URL;

public class AddOneComplexElementTest extends BaseTest {
    @Test
    public void addOneComplexElementTCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickSearch()
                .clearSearch()
                .sendKeysSearch("Apple Cinema")
                .sendKeysSearchENTER()
                .clickOnAddToCartAppleCinema30()
                .registerAppleCinema();

        AppleCinemaPageBL appleCinemaPage = new AppleCinemaPageBL();
        appleCinemaPage.verifyAppleCinema();

        MiniCartPageBL miniCartPage = new MiniCartPageBL();
        miniCartPage.clickOnMiniCartButton();
        miniCartPage.verifyAppleCinemaInCardInTheCart();
    }
}