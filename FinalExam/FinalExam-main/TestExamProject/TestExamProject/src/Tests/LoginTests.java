package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;

public class LoginTests extends BaseTest {

    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public LoginPage loginPage;

    String wrongMyusername = "djokovicnovak@gmail.com";
    String wrongErrorExpectedtext = "Authentication failed.";

    String errorMessageMissingUsername = "An email address required.";
    String errorMessageMissingPassword = "Password is required.";

@Test
public void verifyWrongUsernameUnsucessfullSignIn() {

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
    
    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.signIn(wrongMyusername, Mypassword);
    loginPage.verifyUnsucessfullSignIn(wrongErrorExpectedtext);
}
@Test
public void verifySigninWithoutUsername() {
  
    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);

    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.signIn("",  Mypassword );
    loginPage.verifyUnsucessfullSignIn(errorMessageMissingUsername);
}
@Test
public void verifySignInWithoutPassword() {

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
    
    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.signIn(myUsername, "");
    loginPage.verifyUnsucessfullSignIn(errorMessageMissingPassword);
}
@Test
public void verifySucessfullSignOut() {

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
   
    homePage.basePage();
    homePage.clickOnSignInButton();
    loginPage.signIn(myUsername, Mypassword);
    homePage.clickOnSignOutButton();
    homePage.verifySucessfullSignOut();
   }
}
