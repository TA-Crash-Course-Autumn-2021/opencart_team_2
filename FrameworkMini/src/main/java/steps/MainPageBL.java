package steps;

import steps.menu.MenuPageBL;

public class MainPageBL {
    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public MenuPageBL getMenuPageBL() {
        return new MenuPageBL();
    }
}
