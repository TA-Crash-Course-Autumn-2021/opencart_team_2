import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class Add2ProductToShoppingCart extends BaseTest {
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void add2ProductToShoppingCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnAddToCartIMacButton()
                .verifyAddProductButton("iMac");

        mainPageBL.getMenuPageBL()
                .clickOnTabletsButton()
                .clickOnAddToCartSamsungGalaxyTab10Button()
                .verifyAddProductButton("Samsung Galaxy Tab 10.1");
    }
}

