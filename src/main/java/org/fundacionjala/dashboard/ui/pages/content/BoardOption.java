package org.fundacionjala.dashboard.ui.pages.content;

import org.fundacionjala.dashboard.ui.pages.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ErickaViraca on 9/28/2016.
 */
public class BoardOption extends AbstractBasePage {

    @FindBy(xpath = "")
    private WebElement moveToGroup;
    @FindBy(xpath = "//button[@data-action='save-wizard-config']")
    private WebElement shareBoard;
    @FindBy(xpath = "//a=[@data-action='delete-board']")
    private WebElement deleteBoard;
    @FindBy(css = "div.ui.positive.button")
    private WebElement acceptDeleteButton;

    /**
     * Method to move a board to a group.
     *
     * @return .
     */
    public final void moveBoardToGroup() {
        moveToGroup.click();
    }
    /**
     * Method to share a board.
     *
     * @return .
     */
    public final void shareABoard() {
        shareBoard.click();
    }
    /**
     * Method to delete the board.
     *
     * @return .
     */
    public final void deleteBoardMach() {
        deleteBoard.click();
        acceptDeleteButton.click();
    }
}
