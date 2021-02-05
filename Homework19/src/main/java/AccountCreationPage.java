import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreationPage {
    private static final String ACCOUNT_CREATION_PAGE_URL ="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private WebDriver driver;

    private By firstNameInputPI = By.id("customer_firstname");
    private By lastNameInputPI = By.id("customer_lastname");
    private By emailInputPI = By.id("passwd");
    private By passwordInputPI = By.id("email");
    private By firstNameInputAddress = By.id("firstname");
    private By lastNameInputAddress = By.id("lastname");
    private By addressInputAddress = By.id("address1");
    private By cityInputAddress = By.id("city");
    private By stateSelectAddress = By.id("id_state");
    private By postalCodeInputAddress = By.id("postcode");
    private By countrySelectAddress = By.id("id_country");
    private By mobilePhoneInputAddress = By.id("phone_mobile");
    private By addressReferenceInputAddress = By.id("alias");
    private By registerButton = By.id("submitAccount");

    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignInPage(){
        driver.navigate().to(ACCOUNT_CREATION_PAGE_URL);
    }

    public void enterFirstNamePI (String firstNamePI){
        driver.findElement(firstNameInputPI).sendKeys(firstNamePI);
        System.out.println("enterFirstNamePI");
    }

    public void enterLastNamePI (String lastNamePI){
        driver.findElement(lastNameInputPI).sendKeys(lastNamePI);
        System.out.println("enterLastNamePI");
    }

    public void enterEmailPI (String emailPI){
        driver.findElement(emailInputPI).sendKeys(emailPI);
        System.out.println("enterEmailPI");
    }

    public void enterPasswordPI (String lastName){
        driver.findElement(passwordInputPI).sendKeys(lastName);
        System.out.println("enterPasswordPI");
    }

    public void enterFirstNameAddress (String firstNameAddress){
        driver.findElement(firstNameInputAddress).sendKeys(firstNameAddress);
        System.out.println("enterFirstNameAddress");
    }

    public void enterLastNameAddress (String lastNameAddress){
        driver.findElement(lastNameInputAddress).sendKeys(lastNameAddress);
        System.out.println("enterLastNameAddress");
    }

    public void enterAddressInputAddress (String addressAddress){
        driver.findElement(addressInputAddress).sendKeys(addressAddress);
        System.out.println("enterAddressInputAddress");
    }

    public void enterPostalCodeInputAddress (String PostalCodeAddress){
        driver.findElement(postalCodeInputAddress).sendKeys(PostalCodeAddress);
        System.out.println("enterCityInputAddress");
    }

//    public void enterCountrySelectAddress (String country){
//        driver.findElement(countrySelectAddress).sendKeys(country);
//        System.out.println("enterCountryInputAddress");
//    }

    public void enterMobilePhoneInputAddress (String mobilePhone){
        driver.findElement(mobilePhoneInputAddress).sendKeys(mobilePhone);
        System.out.println("enterMobilePhoneInputAddress");
    }
    
    public void enterAddressReferenceAddress (String addressReference){
        driver.findElement(addressReferenceInputAddress).sendKeys(addressReference);
        System.out.println("enterAddressReferenceAddressn");
    }

    public void clickRegisterButton (){
        driver.findElement(registerButton).click();
        System.out.println("clickRegisterButton");
    }
}
