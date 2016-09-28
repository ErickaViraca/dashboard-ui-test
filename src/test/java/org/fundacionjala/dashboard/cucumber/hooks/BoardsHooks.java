package org.fundacionjala.dashboard.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.fundacionjala.dashboard.ui.pages.HomePage;
import org.fundacionjala.dashboard.ui.pages.LoginPage;
import org.fundacionjala.dashboard.ui.pages.content.MyDashboard;
import org.fundacionjala.dashboard.ui.pages.menu.TopMenu;
import org.fundacionjala.dashboard.ui.pages.sidebar.SideBar;

/**
 * Created by ErickaViraca on 9/27/2016.
 */
public class BoardsHooks {

    HomePage homePage = LoginPage.loginAsPrimaryUser();

    @After @Before("@deleteAllBoardsMach2")
    public void deleteAllBoardsOnMach2(){
        // Go to board Section
        TopMenu topMenu = homePage.goToTopMenu();
        SideBar sideBar = topMenu.clickGeneralMenu();
        MyDashboard myDashboard = sideBar.clickMyDashBoardButton();
        myDashboard.deleteAllBoards();
    }

    @After ("@deleteSpecificBoardMach2")
    public void deleteBoardOnMach2(final String boardName){
        // Go to board Section
        TopMenu topMenu = homePage.goToTopMenu();
        SideBar sideBar = topMenu.clickGeneralMenu();
        MyDashboard myDashboard = sideBar.clickMyDashBoardButton();
        myDashboard.deleteSpecificBoard(boardName);
    }

}
