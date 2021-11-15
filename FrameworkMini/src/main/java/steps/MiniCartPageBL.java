package steps;

import org.testng.Assert;
import pages.MiniCartPage;

public class MiniCartPageBL {

    private MiniCartPage miniCartPage;

    public MiniCartPageBL() {
        miniCartPage = new MiniCartPage();
    }

    public void verifyMacBookInCardInTheCart() {
        Assert.assertTrue(miniCartPage.getMacBookInCard().getText().equals("MacBook"), "Wrong items name in cart");
    }

    public void verifyMacBookAirInCardInTheCart() {
        Assert.assertTrue(miniCartPage.getMacBookAirInCard().getText().equals("MacBook Air"), "Wrong items name in cart");
    }

    public void verifyAppleCinemaInCardInTheCart() {
        Assert.assertTrue(miniCartPage.getAppleCinemaInCard().getText().equals("Apple Cinema 30\""), "Wrong items name in cart");
    }

    public void verifySamsungSyncMasterInTheCart() {
        Assert.assertTrue(miniCartPage.getSamsungSyncMasterInCard().getText().equals("Samsung SyncMaster 941BW"), "Wrong items name in cart");
    }

    public MiniCartPageBL clickOnMiniCartButton() {
        miniCartPage.getMiniCartButton().click();
        return new MiniCartPageBL();
    }
}
