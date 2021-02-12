package company.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private static final String SIGN_IN_PAGE_URL ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private WebDriver driver;

    private By emailInputCA = By.id("email_create");
    private By submitCA = By.id("SubmitCreate");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignInPage(){
        driver.navigate().to(SIGN_IN_PAGE_URL);
    }

    public void enterEmailCreateAccount(String emailCA){
        driver.findElement(emailInputCA).sendKeys(emailCA);
        System.out.println("enterEmailCreateAccount");
    }

    public void clickCreateAccountButton(){
        driver.findElement(submitCA).click();
        System.out.println("clickCreateAccountButton");
    }
}
