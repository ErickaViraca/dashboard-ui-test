package org.fundacionjala.dashboard.cucumber.hooks;

import cucumber.api.java.Before;
import org.fundacionjala.dashboard.ui.pages.content.MyDashboard;
import org.fundacionjala.dashboard.ui.pages.menu.TopMenu;
import org.fundacionjala.dashboard.ui.pages.sidebar.SideBar;

/**
 * Created by ErickaViraca on 9/27/2016.
 */
public class BoardsHooks {

    /**
     * Method that delete all the existent boards on MACH2
     */
    @Before("@deleteAllBoards")
    public void deleteAllBoards(){
        SideBar sideBar = new TopMenu().clickGeneralMenu();
        MyDashboard myDashboard = sideBar.clickMyDashBoardButton();
        myDashboard.deleteAllBoards();
    }

}
