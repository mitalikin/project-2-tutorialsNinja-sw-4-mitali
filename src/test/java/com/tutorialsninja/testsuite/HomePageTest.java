package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import javafx.scene.control.Tab;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverToElementAndClickOnDesktops();
        //  1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectMenu("Show All Desktops");
        //1.3 Verify the text ‘Desktops
        String expectedText = "Desktops";
        Assert.assertEquals(homePage.desktops(), expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        // 2.1 Mouse hover on “Laptops & Notebooks”Tab and click
        homePage.mouseHoverToElementAndClickOnLaptopsNotebooks();
        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show All Laptops & Notebooks");
        //  2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(homePage.laptopsNotebook(), expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //   3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverToElementAndClickOnComponents();
        //  3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectMenu("Show All Components");
        //  3.3 Verify the text ‘Components’
        String expectedText = "Components";
        Assert.assertEquals(homePage.components(), expectedText);
    }


}