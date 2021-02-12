package company;

import company.pages.*;
import company.units.Config;
import company.units.TestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AccountCreationTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");

    private MainPage mainPage;
    private SignInPage signInPage;
    private AccountCreationPage accountCreationPage;
    private ControllerAuthenticationPage authenticationPage;

    @Test
    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(config.getProperty("baseurl"));

        mainPage = new MainPage(driver);

        TestHelper.sleepSecondsExplicityWait(10, By.xpath("//a[@title =\"Log in to your customer account\"]"), driver);
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title =\"Log in to your customer account\"]")));

        mainPage.clickSignInButton();
        
        signInPage = new SignInPage(driver);
            System.out.println("company.pages.SignInPage is open");
        signInPage.enterEmailCreateAccount("hhhfhgh@hjj.com");
        signInPage.clickCreateAccountButton();

        //TestHelper.sleep3SecondsThread();

        accountCreationPage = new AccountCreationPage(driver);
            System.out.println("company.pages.AccountCreationPage is open");

        TestHelper.sleepSecondsThread(3);
            
        accountCreationPage.enterFirstNamePI("firstNamePI");
        accountCreationPage.enterLastNamePI ("lastNamePI");
        accountCreationPage.enterPasswordPI ("lastName");
        accountCreationPage.enterFirstNameAddress ("firstNameAddress");
        accountCreationPage.enterLastNameAddress ("lastNameAddress");
        accountCreationPage.enterAddressInputAddress ("addressAddress");
        accountCreationPage.enterPostalCodeInputAddress ("enterPostalCodeInputAddress");
        accountCreationPage.enterMobilePhoneInputAddress ("mobilePhone");
        accountCreationPage.enterAddressReferenceAddress("addressReference");
        accountCreationPage.clickRegisterButton();
        authenticationPage = new ControllerAuthenticationPage(driver);
        TestHelper.sleepSecondsThread(3);

        String expecterMessage = "There are 6 errors";
        
        Assert.assertEquals(expecterMessage,authenticationPage.getErrorTitleMessage());
    }
}
