package company;

import company.WebDriverFactory.engine.Browsers;
import company.WebDriverFactory.engine.DriverType;
import company.WebDriverFactory.engine.WebDriverFactory;
import company.model.Account;
import company.pages.*;
import company.units.Config;
import company.units.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
    private Account account;
    private MyAccountPage myAccountPage;


    @Before
    public void setupAccount() {
        account = new Account.AccountBuilder()
                .withGender("Mr.")
                .withEmail("Sam"+ TestHelper.randomInt() +"@gmail.com")
                .withPassword("1234567890")
                .withFirstNameCustomer("FirstNameCustomer")
                .withLastNameCustomer("LastNameCustomer")
                .withBirthdayDay("1")
                .withBirthdayMonth("1")
                .withBirthdayYear("2000")
                .withFirstNameAddress("withFirstName")
                .withLastNameAddress("withLastName")
                .withCompany("withCompany")
                .withAddress1("withAddress1")
                .withAddress2("withAddress2")
                .withCity("withCity")
                .withState("Alabama")
                .withZipCode("00000")
                .withCountry("United States")
                .withPhoneMobile("00000")
                .withAliasAddress("withAliasAddress")
                .build();

        //driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver = Browsers.CHROME.create();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(config.getProperty("baseurl"));

        authenticationPage = new ControllerAuthenticationPage(driver);

        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title =\"Log in to your customer account\"]")));
    }

    @Test
    public void loginTest() {

        mainPage = new MainPage(driver);
        mainPage.clickSignInButton();
        signInPage = new SignInPage(driver);
        signInPage.enterEmailCreateAccount(account.getEmail())
                .clickBtnCreateAccount();
        accountCreationPage = new AccountCreationPage(driver);
        accountCreationPage.fillAndSubmitAllRegistrationForm(account);
        myAccountPage = new MyAccountPage(driver);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstNameCustomer();

        Assert.assertTrue("Success", actualResult.contains(expectedResult));
    }

    @After
    public void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

 //   @Test
 //   public void loginTestFailed() {

//        account = new Account.AccountBuilder()
//                .withGender("Mr.")
//                .withEmail("Sam"+ TestHelper.randomInt() +"@gmail.com")
//                .withPassword("1234567890")
//                .withFirstNameCustomer("withFirstNameCustomer")
//                .withLastNameCustomer("withLastNameCustomer")
//                .withBirthdayDay("1")
//                .withBirthdayMonth("1")
//                .withBirthdayYear("2000")
//                .withFirstNameAddress("withFirstName")
//                .withLastNameAddress("withLastName")
//                .withCompany("withCompany")
//                .withAddress1("withAddress1")
//                .withCity("withCity")
//                .withState("Alabama")
//                .withZipCode("00000")
//                .withCountry("United States")
//                .withPhoneMobile("00000")
//                .withAliasAddress("withAliasAddress")
//                .build();
//
//        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get(config.getProperty("baseurl"));
//
//        mainPage = new MainPage(driver);

        //TestHelper.sleepSecondsExplicityWait(10, By.xpath("//a[@title =\"Log in to your customer account\"]"), driver);

//        WebElement dynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title =\"Log in to your customer account\"]")));
        //mainPage = new MainPage(driver);
//        mainPage.clickSignInButton();
//
//        //signInPage = new SignInPage(driver);
//        signInPage.enterEmailCreateAccount(account.getEmail())
//                .clickBtnCreateAccount();
//
//        //accountCreationPage = new AccountCreationPage(driver);
//
//        TestHelper.sleepSecondsThread(1);
//
//        accountCreationPage.enterFirstNameCustomer(account.getFirstNameCustomer())
//                .enterLastNameCustomer(account.getLastNameCustomer())
//                .enterPassword(account.getPassword())
//                .enterFirstNameAddress(account.getFirstNameAddress())
//                .enterLastNameAddress(account.getLastNameAddress())
//                .enterAddress1(account.getAddress1())
//                .enterPostalCode(account.getPostcode())
//                .enterMobilePhone(account.getPhone_mobile())
//                .enterAlias(account.getAlias())
//                .clickRegisterButton();
//
//        authenticationPage = new ControllerAuthenticationPage(driver);
//
//        TestHelper.sleepSecondsThread(1);
//
//        String expectedMessage = "There are 6 errors";
//
//        Assert.assertEquals(expectedMessage, authenticationPage.getErrorTitleMessage());
//    }


}
