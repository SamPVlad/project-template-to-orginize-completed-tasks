package company.pages;

import company.model.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage {
    private static final String ACCOUNT_CREATION_PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private WebDriver driver;

    @FindBy(id = "id_gender1")
    private WebElement genderMr;

    @FindBy(id = "id_gender2")
    private WebElement genderMrs;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameCustomerInput;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameCustomerInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "days")
    private WebElement dayDropDown;

    @FindBy(id = "months")
    private WebElement monthDropDown;

    @FindBy(id = "years")
    private WebElement yearDropDown;

    @FindBy(id = "firstname")
    private WebElement firstNameAddressInput;

    @FindBy(id = "lastname")
    private WebElement lastNameAddressInput;

    @FindBy(id = "address1")
    private WebElement address1Input;

    @FindBy(id = "address2")
    private WebElement address2Input;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement stateDropDown;

    @FindBy(id = "postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "id_country")
    private WebElement countryDropDown;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneInput;

    @FindBy(id = "alias")
    private WebElement aliasInput;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AccountCreationPage openSignInPage() {
        driver.navigate().to(ACCOUNT_CREATION_PAGE_URL);
        return this;
    }

    private AccountCreationPage selectGender(String gender) {
        if (gender.equals("Mr.")) {
            genderMr.click();
        } else {
            genderMrs.click();
        }
        return this;
    }

    public AccountCreationPage enterFirstNameCustomer(String firstNameCustomer) {
        firstNameCustomerInput.sendKeys(firstNameCustomer);
        return this;
    }

    public AccountCreationPage enterLastNameCustomer(String lastNameCustomer) {
        lastNameCustomerInput.sendKeys(lastNameCustomer);
        return this;
    }

    public AccountCreationPage enterEmail(String email) {
        if (!emailInput.getText().equals("")) {
            emailInput.sendKeys(email);
        } else {
            emailInput.clear();
            emailInput.sendKeys(email);
        }
        return this;
    }

    public AccountCreationPage enterPassword(String lastName) {
        passwordInput.sendKeys(lastName);
        return this;
    }

    private AccountCreationPage setBirthday(String day, String month, String year) {
        selectBirthDay(day);
        selectBirthMonth(month);
        selectBirthYear(year);
        return this;
    }

    private void selectBirthDay(String day) {
        Select value = new Select(dayDropDown);
        value.selectByValue(day);
    }

    private void selectBirthMonth(String month) {
        Select value = new Select(monthDropDown);
        value.selectByValue(month);
    }

    private void selectBirthYear(String year) {
        Select value = new Select(yearDropDown);
        value.selectByValue(year);
    }

    public AccountCreationPage enterFirstNameAddress(String firstNameAddress) {
        firstNameAddressInput.sendKeys(firstNameAddress);
        return this;
    }

    public AccountCreationPage enterLastNameAddress(String lastNameAddress) {
        lastNameAddressInput.sendKeys(lastNameAddress);
        return this;
    }

    public AccountCreationPage enterAddress1(String address1) {
        address1Input.sendKeys(address1);
        return this;
    }

    public AccountCreationPage enterAddress2(String address2) {
        address2Input.sendKeys(address2);
        return this;
    }

    public AccountCreationPage enterCity(String city) {
        cityInput.sendKeys(city);
        return this;
    }

    private AccountCreationPage selectState(String state) {
        Select value = new Select(stateDropDown);
        value.selectByVisibleText(state);
        return this;
    }

    public AccountCreationPage enterPostalCode(String PostalCodeAddress) {
        postalCodeInput.sendKeys(PostalCodeAddress);
        return this;
    }

    private AccountCreationPage selectCountry(String country) {
        Select value = new Select(countryDropDown);
        value.selectByVisibleText(country);
        return this;
    }

    public AccountCreationPage enterMobilePhone(String mobilePhone) {
        mobilePhoneInput.sendKeys(mobilePhone);
        return this;
    }

    public AccountCreationPage enterAlias(String alias) {
        aliasInput.sendKeys(alias);
        return this;
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    private AccountCreationPage fillAllRegistrationForm(Account account) {
        this.selectGender(account.getGender())
                .enterFirstNameCustomer(account.getFirstNameCustomer())
                .enterLastNameCustomer(account.getLastNameCustomer())
                .enterEmail(account.getEmail())
                .enterPassword(account.getPassword())
                .setBirthday(account.getDay(), account.getMonth(), account.getYear())
                .enterFirstNameAddress(account.getFirstNameAddress())
                .enterLastNameAddress(account.getLastNameAddress())
                .enterAddress1(account.getAddress1())
                .enterAddress2(account.getAddress2())
                .enterCity(account.getCity())
                .selectState(account.getState())
                .enterPostalCode(account.getPostcode())
                .selectCountry(account.getCountry())
                .enterMobilePhone(account.getPhone_mobile())
                .enterAlias(account.getAlias());
        return this;
    }
    public void fillAndSubmitAllRegistrationForm(Account account) {
         this.fillAllRegistrationForm(account)
                 .clickRegisterButton();
    }
}
