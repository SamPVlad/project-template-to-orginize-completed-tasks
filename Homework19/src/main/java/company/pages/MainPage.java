package company.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";

    @FindBy(xpath = "//a[@title =\"Log in to your customer account\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@name =\"submit_search\"]")
    private WebElement submitSearchButton;

    @FindBy(id = "search_query_top")
    private WebElement searchInput;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public SignInPage clickSignInButton(){
        signInButton.click();
        return new SignInPage(driver);
    }

    public MainPage enterSearchInput(String requestedProduct){
        searchInput.sendKeys(requestedProduct);
        return this;
    }

    public SearchPage clickSubmitSearchButton(){
        submitSearchButton.click();
        return new SearchPage(driver);
    }
}
