package org.fundacionjala.dashboard.ui.pages.menu;

import org.fundacionjala.dashboard.ui.pages.sidebar.SideBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.fundacionjala.dashboard.ui.pages.AbstractBasePage;
import org.fundacionjala.dashboard.ui.pages.content.BoardPage;

public class TopMenu extends AbstractBasePage {

    @FindBy(css = "i[class='needsclick plus icon']")
    private WebElement menuBoard;

    @FindBy(css = "div.menu.transition.visible > div[data-action='add-board']")
    private WebElement addBoard;

    @FindBy(css = "div.ui.needsclick.user.dropdown.item")
    private WebElement userMenu;

    @FindBy(css = "div.menu.transition.visible > a[class=\"item\"][href=\"/logout\"]")
    private WebElement logOutButton;

    @FindBy(xpath = "//a[@data-action='show-main-menu']")
    private WebElement generalMenu;

    @FindBy(css = "div.menu.transition.visible > a[class=\"item\"][href=\"/profile\"]")
    private WebElement profileButton;

    @FindBy(css = "a.brand.item")
    private WebElement jalasoftIcon;

    /**
     * this method click the button.
     */
    public void clickMenuBoard() {
        menuBoard.click();
    }

    public void clickUserMenu() {
        userMenu.click();
    }

    public void clickOnLogOut() {
        logOutButton.click();
    }

    public Profile clickOnProfileMenu() {
        clickUserMenu();
        profileButton.click();
        return new Profile();
    }

    /**
     * Method to perform a click on Profile menu.
     *
     * @return The general menu.
     */
    public SideBar clickGeneralMenu() {
        generalMenu.click();
        return new SideBar();
    }

    public BoardPage clickAddBoardMenu() {
        clickMenuBoard();
        addBoard.click();
        return new BoardPage();
    }

    public void clickJalasoftIcon() {
        jalasoftIcon.click();
    }
}
