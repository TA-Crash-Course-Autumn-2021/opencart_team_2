import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.MiniCartPageBL;
import steps.products.AppleCinemaPageBL;

import static enums.URLs.BASE_URL;

public class AddOneComplexElementTest extends BaseTest {
    @Test
    public void addOneComplexElementTCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .inputSearchAddToCart("Apple Cinema")
                .clickOnAddToCartAppleCinema30()
                .registerAppleCinema();

        AppleCinemaPageBL appleCinemaPage = new AppleCinemaPageBL();
        appleCinemaPage.verifyAppleCinema();

        MiniCartPageBL miniCartPage = new MiniCartPageBL();
        miniCartPage.clickOnMiniCartButton();
        miniCartPage.verifyAppleCinemaInCardInTheCart();
    }
}