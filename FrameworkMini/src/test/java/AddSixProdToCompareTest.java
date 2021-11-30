import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.menu.AddToComparePageBL;

import static enums.URLs.BASE_URL;

public class AddSixProdToCompareTest extends BaseTest{
    @Test
    public void searchElementAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getHeaderPageBL()
                .inputSearchCompare("Iphone")
                .clickOnIPhoneButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIPhone();

        mainPageBL.getHeaderPageBL()
                .inputSearchCompare("Canon")
                .clickOnCanonEOS5DButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddCanonEOS5D();

        mainPageBL.getHeaderPageBL()
                .inputSearchCompare("Samsung")
                .clickOnSamsungSyncMaster941BWButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddSamsungSyncMaster941BW();

        mainPageBL.getHeaderPageBL()
                .inputSearchCompare("MacBook")
                .clickOnMacBookButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacBook();

        mainPageBL.getHeaderPageBL()
                .inputSearchCompare("MacBook")
                .clickOnMacBookAirButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacAir();

        mainPageBL.getHeaderPageBL()
                .inputSearchCompare("iPod")
                .clickOnIPodClassicButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIPodClassic();
    }
}
