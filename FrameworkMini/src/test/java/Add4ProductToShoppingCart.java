import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class Add4ProductToShoppingCart extends BaseTest {

    @Test
    public void add4ProductToShoppingCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtons()
                .clickOnAddToCartIMacButton()
                .verifyAddProductButton("iMac");

        MainPageBL mainPageBL2 = new MainPageBL();
        mainPageBL2.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButtons()
                .clickOnAddToCartSamsungSyncMaster941BWButton()
                .verifyAddProductButton("Samsung SyncMaster 941BW");

        mainPageBL.getMenuPageBL()
                .clickOnTabletsButtons()
                .clickOnAddToCartSamsungGalaxyTab10Button()
                .verifyAddProductButton("Samsung Galaxy Tab 10.1");

        mainPageBL.getMenuPageBL()
                .clickOnSoftwareButtons()
                .verifySubtitleNoProductInCategory();

        mainPageBL.getMenuPageBL()
                .clickOnPhones_PDAsButtons()
                .clickOnAddToCartPalmTreoProButton()
                .verifyAddProductButton("Palm Treo Pro");
    }
}
