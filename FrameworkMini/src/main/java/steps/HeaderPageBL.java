package steps;

import org.openqa.selenium.Keys;
import pages.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickSearch() {
        headerPage.getSearch().click();
        return this;
    }

    public HeaderPageBL clearSearch() {
        headerPage.getSearch().clear();
        return this;
    }

    public HeaderPageBL sendKeysSearch(String keyWords) {
        headerPage.getSearch().sendKeys(keyWords);
        return this;
    }

    public SearchPageBL sendKeysSearchENTER() {
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new SearchPageBL();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

}
