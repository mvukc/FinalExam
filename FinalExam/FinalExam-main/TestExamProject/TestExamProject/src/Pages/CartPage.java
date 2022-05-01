package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By shoppingCartConfirmationBy = By.id("cart_title");
    By nameOfaddedProductBy = By.xpath("//*[@id='product_1_1_0_0']/td[2]/p/a");
    By numberOfAddedProductBy = By.xpath("//*[@id='summary_products_quantity']");
   
    public CartPage verifyCartEntry(String expectedText) {
        String actualTitle = readText(shoppingCartConfirmationBy);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    public CartPage verifySucessfullTshirtName(String expectedText) {
        String acutalTitle = readText(nameOfaddedProductBy);
        assertTextEquals(expectedText,acutalTitle);
        return this;
    }
    public CartPage verifySucessfullNumberOfAddedProduct(String expectedText) {
        String acutalTitle = readText(numberOfAddedProductBy);
        assertTextEquals(expectedText,acutalTitle);
        return this;
    }
    public CartPage valydateTotalPrice( double total, double tax,double totalPrice) {
        assertDoubleEquals(total, tax, totalPrice);
        return this;
    }
}
    


   