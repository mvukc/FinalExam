package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
    super(driver);
    }
    
    By signInConfirmationBy = By.xpath("//*[@id='create-account_form']/h3");
    By createAnAccountButtonBy = By.xpath("//*[@id='SubmitCreate']/span");
    By emailAdrressFieldBy = By.xpath("//*[@id='email_create']");
    By firstNameBy = By.xpath("//*[@id='customer_firstname']");
    By lastNameBy = By.xpath("//*[@id='customer_lastname']");
    By emailBy = By.xpath("//*[@id='email']");
    By passwordBy = By.xpath("//*[@id='passwd']");
    By addressBy = By.xpath("//*[@id='address1']");
    By cityBy = By.xpath("//*[@id='city']");
    By stateButtonBy = By.xpath("//*[@id='id_state']");
    String state = "Alaska";
    By zipPostalCodeBy = By.xpath("//*[@id='postcode']");
    By mobilePhoneBy = By.xpath("//*[@id='phone_mobile']");
    By registerButtonBy = By.xpath("//*[@id='submitAccount']/span");

    public MyAccountPage verifySignInEntry (String expectedText) {
        String actualTitle = readText(signInConfirmationBy);
        assertTextEquals(expectedText, actualTitle);
        return this;
    }
    public MyAccountPage createAnnCount (String emailAddress) {
        writeText(emailAdrressFieldBy, emailAddress);
        click(createAnAccountButtonBy);
        return this;
    }
    public MyAccountPage createFirstAndLastName (String firstName, String lastName) {
        writeText(firstNameBy, firstName );
        writeText(lastNameBy, lastName);
        return this;
    }
    public MyAccountPage createEmailAddressandPassword (String emailAdress, String password ) {
        writeText(emailBy ,emailAdress);
        writeText(passwordBy,password);
        return this;
    }
    public MyAccountPage createDwelling (String address, String city) {
        writeText(addressBy, address);
        writeText(cityBy, city);
        return this;
    }
    public MyAccountPage createState() {
        WebElement mySelectedElement = driver.findElement(By.xpath("//*[@id='id_state']"));
        Select dropdown= new Select(mySelectedElement);
        dropdown.selectByVisibleText("Alaska");
        return this;
    }
    public MyAccountPage createPostalCodeAndMobilePhone (String postalCode, String MobilePhone) {
        writeText(zipPostalCodeBy, postalCode);
        writeText(mobilePhoneBy, MobilePhone);
        return this;
    }
    public MyAccountPage clickOnRegisterButton() {
        click(registerButtonBy);
        return this;
    }
}
