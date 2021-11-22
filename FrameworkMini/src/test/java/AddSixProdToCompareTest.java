import navigation.Navigation;
import org.testng.annotations.Test;
import steps.AddToComparePageBL;
import steps.MainPageBL;

import static enums.URLs.BASE_URL;

public class AddSixProdToCompareTest extends BaseTest{
    @Test
    public void searchElementAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Iphone")
                .sendKeysSearchForCompareProdENTER()
                .clickOnIPhoneButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIPhone();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Canon")
                .sendKeysSearchForCompareProdENTER()
                .clickOnCanonEOS5DButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddCanonEOS5D();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Samsung")
                .sendKeysSearchForCompareProdENTER()
                .clickOnSamsungSyncMaster941BWButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddSamsungSyncMaster941BW();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("MacBook")
                .sendKeysSearchForCompareProdENTER()
                .clickOnMacBookButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacBook();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("MacBook")
                .sendKeysSearchForCompareProdENTER()
                .clickOnMacBookAirButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacAir();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("iPod")
                .sendKeysSearchForCompareProdENTER()
                .clickOnIPodClassicButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIPodClassic();
    }
}
