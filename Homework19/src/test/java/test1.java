import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test1 {

    private WebDriver driver;
    private MainPage mainPage;
    private SignInPage signInPage;
    private AccountCreationPage accountCreationPage;
    private ControllerAuthenticationPage authenticationPage;

    @Test
    public void loginTest() {
        System.out.println("Starting loginTest");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yoga\\Desktop\\hillel\\Java Code\\Homework\\project-template-to-orginize-completed-tasks\\Homework19\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        
        mainPage = new MainPage(driver);
        mainPage.openMainPage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("MainPage is open");
        mainPage.clickSignInButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        signInPage = new SignInPage(driver);
            System.out.println("SignInPage is open");
        signInPage.enterEmailCreateAccount("hhhfhgh@hjj.com");
        signInPage.clickCreateAccountButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        accountCreationPage = new AccountCreationPage(driver);
            System.out.println("AccountCreationPage is open");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        accountCreationPage.enterFirstNamePI("firstNamePI");
        
        accountCreationPage.enterLastNamePI ("lastNamePI");
        
        //accountCreationPage.enterEmailPI ("emailPI");
        
        accountCreationPage.enterPasswordPI ("lastName");
        
        accountCreationPage.enterFirstNameAddress ("firstNameAddress");
        
        accountCreationPage.enterLastNameAddress ("lastNameAddress");
        
        accountCreationPage.enterAddressInputAddress ("addressAddress");
        
        accountCreationPage.enterPostalCodeInputAddress ("enterPostalCodeInputAddress");
        
       // signInPage.enterCountryInputAddress ("country");
        
        accountCreationPage.enterMobilePhoneInputAddress ("mobilePhone");
        
        accountCreationPage.enterAddressReferenceAddress("addressReference");
        
        accountCreationPage.clickRegisterButton();

        authenticationPage = new ControllerAuthenticationPage(driver);
        System.out.println("authenticationPage is open");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("There are 6 errors",authenticationPage.getErrorTitleMessage());
    }
}
