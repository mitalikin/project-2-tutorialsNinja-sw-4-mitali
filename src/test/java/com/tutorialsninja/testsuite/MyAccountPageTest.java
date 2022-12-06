package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        myAccountPage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        myAccountPage.verifyTextRegisterAccount();
        String expectedTextRegister = "Register Account";
        Assert.assertEquals(myAccountPage.verifyTextRegisterAccount(), expectedTextRegister, "Message is not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //1.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        myAccountPage.selectMyAccountOptions("Login");
        //1.3 Verify the text “Register Account”.
        myAccountPage.returningCustomer();
        String expectedTextRegister1 = "Returning Customer";
        Assert.assertEquals(myAccountPage.returningCustomer(), expectedTextRegister1, "Message is not displayed");
    }


    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        myAccountPage.selectMyAccountOptions("Register");
         // 3.3 Enter First Name
        myAccountPage.enterFirstName("clare");
        // 3.4 Enter Last Name
        myAccountPage.enterLastName("white");
        //3.5 Enter Email
        myAccountPage.enterEmail("pqr107@gmail.com");
        //3.6 Enter Telephone
        myAccountPage.enterPhoneNumber("07834675433");
        //3.7 Enter Password
        myAccountPage.enterPassword("pqr123");
        //3.8 Enter Password Confirm
        myAccountPage.enterConfirmPassword("pqr123");
        //3.9 Select Subscribe Yes radio button
        myAccountPage.clickSubscribe();
        //3.10 Click on Privacy Policy check box
        myAccountPage.clickOnCheckBox();
        //3.11 Click on Continue button
        myAccountPage.clickOnContinueRegister();
        //3.12 Verify the message “Your Account Has Been Created!”
        String expectedTextRegister1 = "Your Account Has Been Created!";
        Assert.assertEquals(myAccountPage.verifyAccountCreatedText(), expectedTextRegister1, "Message is not displayed");

        //3.13 Click on Continue button
        myAccountPage.clickOnContinueRegister2();
        //3.14 Clickr on My Account Link.
        myAccountPage.clickOnMyAccount();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        myAccountPage.selectMyAccountOptions("Logout");
        // 3.16 Verify the text “Account Logout”
      //  myAccountPage.verifyTextAccountLoggedOut();
       // String expectedText3 = "Account Logout";
      //  Assert.assertEquals(myAccountPage.verifyAccountCreatedText(), expectedText3, "Message is not displayed");

        //3.17 Click on Continue button
          myAccountPage.setClickContinue();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        myAccountPage.clickOnMyAccountTab();
        myAccountPage.selectMyAccountOptions("Login");
        myAccountPage.enterEmail("pqr103@gmail.com");
        myAccountPage.enterPassword("pqr123");
        myAccountPage.clickOnLoginLink();
        myAccountPage.clickOnMyAccountLinkLoginPage();
        myAccountPage.selectMyAccountOptions("Logout");
        String expectedText3 = "Account Logout";
        String actualText3 = myAccountPage.verifyTextAccountLoggedOut();
        Assert.assertEquals(actualText3, expectedText3, "Such message not displayed");
        myAccountPage.clickOnContinueLinkBottom();
        myAccountPage.clickOnMyAccountLinkLoginPage();
    }




}