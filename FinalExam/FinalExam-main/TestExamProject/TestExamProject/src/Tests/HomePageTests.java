package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;

public class HomePageTests extends BaseTest{
    
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public LoginPage loginPage;
    public CartPage cartPage;

    String contactUsVerification = "Contact us";
    String shoppigCartVerification = "SHOPPING-CART SUMMARY";
    int expected = 7;
    String signInVerification = "CREATE AN ACCOUNT";
    String tShirtVerification = "Faded Short Sleeve T-shirts";
    
    
public void verifythatHomePageisDisplayedProperly () {

    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);

    homePage.basePage();
    homePage.verifySucessfullContactUsButton(contactUsVerification);
    homePage.clickOnShoppingCartIcon();
    cartPage.verifyCartEntry(shoppigCartVerification);
    }
@Test
public void countPopularProducts() {

    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.verifypopularPageNumberOfProducts(expected);
    }
@Test
public void countBestSellersProducts() {

    homePage = new HomePage(driver);

    homePage.basePage();
    homePage.clickOnbestSellersButton();
    homePage.bestSellersNumberOfProducts(expected);
    }
@Test
public void verifySignInEntry() {
      
    homePage = new HomePage(driver);
    myAccountPage = new MyAccountPage(driver);
       
    homePage.basePage();
    homePage.clickOnSignInButton();
    myAccountPage.verifySignInEntry(signInVerification);
    }
@Test
public void addToCartTShirt() {

    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);
       
    homePage.basePage();
    homePage.clickOnTshirtButton();
    homePage.clickOnProductName();
    homePage.clickOnAddToCartButton();
    homePage.clickOnProceedToCheckout();
    cartPage.verifySucessfullTshirtName(tShirtVerification);
    }
}

