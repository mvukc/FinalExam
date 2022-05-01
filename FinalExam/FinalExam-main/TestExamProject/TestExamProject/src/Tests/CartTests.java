package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;

public class CartTests extends BaseTest {

    public CartPage cartPage;
    public LoginPage loginPage;
    public HomePage homePage;

    String numberOfaddedProduct = "1 Product";
    double totalProducts = 16.51;
    double totalShipping = 2.00;
    double totalPrice = 18.51;
    
@Test
  public void verifyAddedProduct () {

    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);

    homePage.basePage();
    homePage.clickOnTshirtButton();
    homePage.clickOnProductName();
    homePage.clickOnAddToCartButton();
    homePage.clickOnProceedToCheckout();
    cartPage.verifySucessfullNumberOfAddedProduct(numberOfaddedProduct);
  }
@Test
public void valydateTotalPriceIsDisplayedProperly () {

    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);

    homePage.basePage();
    homePage.clickOnTshirtButton();
    homePage.clickOnProductName();
    homePage.clickOnAddToCartButton();
    homePage.clickOnCloseWindow();
    homePage.clickOnShoppingCartIcon();
    cartPage.valydateTotalPrice(totalProducts,totalShipping,totalPrice);
  }
}
