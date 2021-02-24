package company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;

    private static final String SIGN_IN_PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @FindBy(id = "email_create")
    private WebElement emailCreateAccountInput;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreateAccount;

    @FindBy(id = "withEmail")
    private WebElement emailFieldAlreadyRegistered;

    @FindBy(id = "passwd")
    private WebElement passwdFieldAlreadyRegistered;

    @FindBy(id = "SubmitLogin")
    private WebElement signInBtnAlreadyRegistered;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SignInPage openSignInPage() {
        this.driver.navigate().to(SIGN_IN_PAGE_URL);
        return this;
    }

    public SignInPage enterEmailCreateAccount(String email) {
        emailCreateAccountInput.clear();
        emailCreateAccountInput.sendKeys(email);
        return this;
    }

    public void clickBtnCreateAccount() {
        waitOnElement(submitCreateAccount).click();
    }

    public SignInPage typeEmail(String email) {
        return setUserData(email, emailFieldAlreadyRegistered);
    }

    public SignInPage typePassword(String passwd) {
        return setUserData(passwd, passwdFieldAlreadyRegistered);
    }

    //private AlreadyRegistered setUserData(@NotNull String passwd, @NotNull WebElement element)

    private SignInPage setUserData(String passwd, WebElement element) {
        if (element.getText().isEmpty()) {
            element.sendKeys(passwd);
        } else {
            element.clear();
            element.sendKeys(passwd);
        }
        return this;
    }

    public void clickSingInBtn() {
        waitOnElement(signInBtnAlreadyRegistered).click();
    }

    private WebElement waitOnElement(WebElement xpath) {
        return (new WebDriverWait(driver, 30)).until(
                ExpectedConditions.elementToBeClickable(xpath)
        );
    }
}
