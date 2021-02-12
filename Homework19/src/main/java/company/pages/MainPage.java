package company.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    private By signInButton = By.xpath("//a[@title =\"Log in to your customer account\"]");
    private By searchInput = By.id("search_query_top");
    private By submitSearchButton = By.xpath("//button[@name =\"submit_search\"]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void enterSearchInput (String requestedProduct){
        driver.findElement(searchInput).sendKeys(requestedProduct);
    }

    public void clickSubmitSearchButton(){
        driver.findElement(submitSearchButton).click();
    }


}
