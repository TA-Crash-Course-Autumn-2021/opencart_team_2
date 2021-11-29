package steps;

import org.testng.Assert;
import pages.AddToComparePage;

public class AddToComparePageBL {
    private AddToComparePage addToComparePage;

    public AddToComparePageBL() {
        addToComparePage = new AddToComparePage();
    }

    public AddToComparePageBL clickOnCanonEOS5DButton() {
        addToComparePage.getCanonEOS5DButton().click();
        return this;
    }
    public AddToComparePageBL clickOnAddToCompareButton() {
        addToComparePage.getAddToCompareButton().click();
        return this;
    }
    public AddToComparePageBL clickOnAddToWishListButton() {
        addToComparePage.getAddToWishListButton().click();
        return this;
    }
    public AddToComparePageBL clickOnIPhoneButton() {
        addToComparePage.getIPhoneButton().click();
        return this;
    }
    public AddToComparePageBL clickOnSamsungSyncMaster941BWButton() {
        addToComparePage.getSamsungSyncMaster941BWButton().click();
        return this;
    }
    public AddToComparePageBL clickOnAppleCinema30Button() {
        addToComparePage.getAppleCinema30Button().click();
        return this;
    }

    public AddToComparePageBL clickOnMacBookButton() {
        addToComparePage.getMacBookButton().click();
        return this;
    }

    public AddToComparePageBL clickOnMacBookAirButton() {
        addToComparePage.getMacBookAirButton().click();
        return this;
    }

    public AddToComparePageBL clickOnIPodClassicButton() {
        addToComparePage.getIPodClassicButton().click();
        return this;
    }

    public AddToComparePageBL clickOnIMacAirMenuButton() {
        addToComparePage.getIMacButton().click();
        return this;
    }
    public AddToComparePageBL clickOnSamsungGalaxyTab101Button() {
        addToComparePage.getSamsungGalaxyTab101Button().click();
        return this;
    }
    public AddToComparePageBL clickOnProductComparisonMac(){
        addToComparePage.getProductComparisonMac().click();
        return this;
    }
    public AddToComparePageBL clickOnProductComparisonIPhone(){
        addToComparePage.getProductComparisonIPhone().click();
        return this;
    }
    public AddToComparePageBL clickOnAddToShoppingCartButton(){
        addToComparePage.getAddToShoppingCart().click();
        return this;
    }

    public AddToComparePageBL clickOnRemoveButton(){
        addToComparePage.getRemoveBottom().click();
        return this;
    }
    public void verifyAddCanonEOS5D() {
        String expectedMessage = "Success";
        String nameItem = "Canon EOS 5D";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPhone() {
        String expectedMessage = "Success";
        String nameItem = "iPhone";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungSyncMaster941BW() {
        String expectedMessage = "Success";
        String nameItem = "Samsung SyncMaster 941BW";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacBook() {
        String expectedMessage = "Success";
        String nameItem = "MacBook";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacAir() {
        String expectedMessage = "Success";
        String nameItem = "MacBook Air";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPodClassic() {
        String expectedMessage = "Success";
        String nameItem = "iPod Classic";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIMac() {
        String expectedMessage = "Success";
        String nameItem = "iMac";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungGalaxyTab101() {
        String expectedMessage = "Success";
        String nameItem = "Samsung Galaxy Tab 10.1";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddAppleCinema30() {
        String expectedMessage = "Success";
        String nameItem = " Apple Cinema 30";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }

}
