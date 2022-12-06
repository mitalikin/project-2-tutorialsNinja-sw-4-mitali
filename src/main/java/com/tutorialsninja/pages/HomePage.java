package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By mouseHoverAndClickOnDesktops = By.linkText("Desktops");

    public void mouseHoverToElementAndClickOnDesktops() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnDesktops);
    }

    public String desktops() {
        return getTextFromElement(mouseHoverAndClickOnDesktops);
    }

    By mouseHoverAndClickOnLaptopsNotebooks = By.linkText("Laptops & Notebooks");

    public void mouseHoverToElementAndClickOnLaptopsNotebooks() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnLaptopsNotebooks);
    }

    public String laptopsNotebook() {
        return getTextFromElement(mouseHoverAndClickOnLaptopsNotebooks);
    }

    By mouseHoverAndClickOnComponents = By.linkText("Components");

    public void mouseHoverToElementAndClickOnComponents() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnComponents);
    }

    public String components() {
        return getTextFromElement(mouseHoverAndClickOnComponents);
    }


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
}









