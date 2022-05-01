package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;

public class MyAccountTests extends BaseTest {

    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public LoginPage loginPage;

    String myAccountPageTitle = "CREATE AN ACCOUNT";
    String emailaddress = "srdjandjokovic@gmail.com";
    String firstName = "Srdjan";
    String lastName = "Djokovic";
    String password = "rolangaros";
    String address = "Pere Perica 16";
    String city = "Beograd";
    String postalCode = "11000";
    String mobilePhone = "065123456";

    String userName = "srdjandjokovic@gmail.com";
    String myPassword = "rolangaros";
    String accountVerification = "Srdjan Djokovic";

@Test
public void createAnAccount() {
    
    homePage = new HomePage(driver);
    myAccountPage = new MyAccountPage(driver);
       
    homePage.basePage();
    homePage.clickOnSignInButton();
    myAccountPage.createAnnCount(emailaddress);
    myAccountPage.createFirstAndLastName(firstName, lastName);
    myAccountPage.createEmailAddressandPassword(emailaddress, password);
    myAccountPage.createDwelling(address, city);
    myAccountPage.createState();
    myAccountPage.createPostalCodeAndMobilePhone(postalCode, mobilePhone);
    myAccountPage.clickOnRegisterButton();
    }


}
