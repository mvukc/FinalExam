package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    
    public LoginPage (WebDriver driver) {
        super(driver);
    }

    By emailAddressBy = By.id("email");
    By passwordBy = By.id("passwd");
    By signInSecondButtonBy = By.xpath("//*[@id='SubmitLogin']/span");
    By accountTitleBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span");
    By wrongUserMessageBy = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    
    public LoginPage signIn (String username, String password) {
        writeText(emailAddressBy, username);
        writeText(passwordBy, password);
        click(signInSecondButtonBy);
        return this;
    }
    public LoginPage clickOnSignInSecondButton() {
        click(signInSecondButtonBy);
        return this;
    }
    public LoginPage verifyAccountTitle (String expectedText) {
        String actualTitle = readText(accountTitleBy);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    public LoginPage verifyUnsucessfullSignIn(String expectedText) {
        String actualTitle = readText(wrongUserMessageBy);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
}