package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver){
        super(driver);
    }
    
    String baseURL = "http://automationpractice.com/index.php";

    By contactUsButtonBy = By.id("contact-link");
    By shoppingCartButtonBy = By.id("header");

    By numberOfMostPopularProduct = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#homefeatured.product_list.grid.row.homefeatured.tab-pane.active li.ajax_block_product");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By numberOfBestSellersProduct = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#blockbestsellers.product_list.grid.row.blockbestsellers.tab-pane.active li.ajax_block_product");
    
    By signInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
   
    By tShirtButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By tShirtProductNameBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a"); 
    By addToCartButtonBy = By.xpath("//*[@id='add_to_cart']/button/span");
    By proceedToCheckoutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    By closeButtonBy = By.id("layer_cart"); 
   
    public HomePage basePage(){
        driver.get(baseURL);
        return this;
    }
    public HomePage verifySucessfullContactUsButton(String expectedText) {
        String actualTitle = readText(contactUsButtonBy);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    public HomePage verifypopularPageNumberOfProducts(int expected) {
        int actualNumberOfProducts = countItems(numberOfMostPopularProduct);
        assertIntegerEquals(expected, actualNumberOfProducts);
        return this;
    }
    public HomePage clickOnbestSellersButton() {
        click(bestSellersButtonBy);
        return this;
    }
    public HomePage bestSellersNumberOfProducts(int expected) {
        int actualNumberOfProducts = countItems(numberOfBestSellersProduct);
        assertIntegerEquals(expected, actualNumberOfProducts);
        return this;
    }
    public HomePage clickOnSignInButton() {
        click(signInButtonBy);
        return this; 
    }
    public HomePage clickOnSignOutButton() {
        click(signOutButtonBy);
        return this;
    } 
    public HomePage verifySucessfullSignOut() {
        assertElementVisible(signInButtonBy);
        return this;
    }
    public HomePage clickOnTshirtButton() {
        click(tShirtButtonBy);
        return this;
    }
    public HomePage clickOnProductName() {
        click(tShirtProductNameBy);
        return this;
    }
    public HomePage clickOnAddToCartButton() {
        click(addToCartButtonBy);
        return this;
    }
    public HomePage clickOnProceedToCheckout() {
        click (proceedToCheckoutButtonBy);
        return this;
    }
    public HomePage clickOnShoppingCartIcon() {
        click(shoppingCartButtonBy);
        return this;
    }
    public HomePage clickOnCloseWindow() {
        click(closeButtonBy);
        return this;
    }
}

    

    


    
        
        
    

    


