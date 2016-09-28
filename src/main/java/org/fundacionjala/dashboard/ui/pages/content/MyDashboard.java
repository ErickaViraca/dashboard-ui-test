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

    @FindBy(xpath = "//div[@class='truncated text item title' and text()='")
    private WebElement boardBase;

    public BoardOption rightClickBoardCard(final String boardName) {
        driver.findElement(By.xpath("//div[@class='truncated text item title' and text()='" + boardName + "']"));
        Action action = new Actions(driver)
                .doubleClick().build(); //method to get the RigthClick()
        action.perform();
        return new BoardOption();
    }

    public void deleteAllBoards() {
        WebElement formElement = driver.findElement(By.cssSelector("div.menu.ui-sortable"));
        List<WebElement> allFormChildElements = formElement.findElements(By.cssSelector("span.inline-edit"));
        for (int i = 0; i < allFormChildElements.size() ; i ++) {
            BoardOption boardOption = rightClickBoardCard(allFormChildElements.get(i).getText());
            boardOption.deleteBoardMach();
        }
    }

    public void deleteSpecificBoard(final String boardName) {
            BoardOption boardOption = rightClickBoardCard(boardName);
            boardOption.deleteBoardMach();
    }

}
