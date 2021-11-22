import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class AddProductToShoppingCart extends BaseTest {
    @Test
    public void addOneComplexProductToCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnAddToCartIMacButton()
                .verifyAddProductButton("iMac");
    }
}
