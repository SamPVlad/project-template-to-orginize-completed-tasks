import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    private By signInButton = By.xpath("//a[@title =\"Log in to your customer account\"]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage(){
        driver.navigate().to(MAIN_PAGE_URL);
        System.out.println("openMainPage");
    }

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
        System.out.println("clickSignInButton");
    }
    
}
