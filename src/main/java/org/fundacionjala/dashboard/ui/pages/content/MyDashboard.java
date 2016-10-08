package org.fundacionjala.dashboard.ui.pages.content;

import org.openqa.selenium.By;

import org.fundacionjala.dashboard.ui.pages.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by JimmyRomero on 9/23/2016.
 */
public class MyDashboard extends AbstractBasePage {

    @FindBy(xpath = "//span[contains(.,'My Dashboard')]")
    //@FindBy(css = "div[data-group-id='5jy9BtiPQDMHCAjhc'] > div[class='menu ui-sortable']")
    private WebElement boardsList;

    @FindBy(xpath = "//div[@class='truncated text item title' and text()='")
    private WebElement boardBase;

    public BoardOption rightClickBoardCard(final WebElement board) {
        WebElement boardName = board.findElement(By.className("inline-edit"));
        Action action = new Actions(driver)
                .contextClick(boardName).build();
        action.perform();
        return new BoardOption();
    }

    public void deleteAllBoards() {
        List<WebElement> allFormChildElements = boardsList.findElements(By.tagName("a"));
        for (WebElement element : allFormChildElements) {
            BoardOption boardOption = rightClickBoardCard(element);
            boardOption.deleteBoardMach();
        }
    }

}
