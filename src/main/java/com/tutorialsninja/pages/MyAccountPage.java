package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
    //1.1 Click on My Account Link.

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccountTab() {
        clickOnElement(myAccount);
    }

    //1.3 Verify the text “Register Account”.
    By registerAccount = By.xpath("//h1[contains(text(),'Register Account')]");

    public String verifyTextRegisterAccount() {
        return getTextFromElement(registerAccount);
    }

    //2.3 Verify the text “Returning Customer”.
    By returningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");

    public String returningCustomer() {
        return getTextFromElement(returningCustomer);
    }


    // 3.3 Enter First Name
    By firstNameField = By.id("input-firstname");

    public void enterFirstName(String firstName) {
        sendTexTooElement(firstNameField, firstName);
    }

    //3.4 Enter Last Name
    By lastNameField = By.id("input-lastname");

    public void enterLastName(String lastName) {

        sendTexTooElement(lastNameField, lastName);
    }

    //3.5 Enter Email
    By emailField = By.id("input-email");

    public void enterEmail(String email) {
        sendTexTooElement(emailField, email);
    }

    //3.6 Enter Telephone
    By telephoneField = By.name("telephone");

    public void enterPhoneNumber(String phoneNumber) {
        sendTexTooElement(telephoneField, phoneNumber);
    }

    //3.7 Enter Password
    By passwordField = By.id("input-password");

    public void enterPassword(String password) {
        sendTexTooElement(passwordField, password);
    }

    //3.8 Enter Password Confirm
    By confirmPasswordField = By.id("input-confirm");

    public void enterConfirmPassword(String confirmPassword) {
        sendTexTooElement(confirmPasswordField, confirmPassword);
    }

    //3.9 Select Subscribe Yes radio button
    By subscribeYes = By.xpath("//input[@name='newsletter'and@value='1']");

    public void clickSubscribe() {
        clickOnElement(subscribeYes);
    }

    //3.10 Click on Privacy Policy check box
    By privacyPolicyCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");

    public void clickOnCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
    }

    //3.11 Click on Continue button
    By continueRegister = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    public void clickOnContinueRegister() {
        clickOnElement(continueRegister);
    }

    //3.12 Verify the message “Your Account Has Been Created!”
    By accountHasBeenCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    public String verifyAccountCreatedText() {
        return getTextFromElement(accountHasBeenCreated);
    }

    //3.13 Click on Continue button
    By continueRegister2 = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinueRegister2() {
        clickOnElement(continueRegister2);
    }

    //3.14 Click on My Account Link.
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccount() {
        clickOnElement(myAccountLink);
    }

    //3.16 Verify the text “Account Logout”
    By accountLogoutLink = By.xpath("//div[@id='content']//h1[text()='Account Logout']");

    public String verifyTextAccountLoggedOut() {
        return getTextFromElement(accountLogoutLink);
    }

    //3.17 Click on Continue button
    By clickContinue = By.xpath("//a[contains(text(),'Continue')]");

    public void setClickContinue() {
        clickOnElement(clickContinue);
    }

    //3.18**
    By loginLink = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    //3'19
    By myAccountLinkLoginPage = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccountLinkLoginPage() {
        clickOnElement(myAccountLinkLoginPage);
    }

    //3.20
    By continueLinkBottom = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinueLinkBottom() {
        clickOnElement(continueLinkBottom);
    }

    //**********
    public static String getAlphaNumericString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

}
