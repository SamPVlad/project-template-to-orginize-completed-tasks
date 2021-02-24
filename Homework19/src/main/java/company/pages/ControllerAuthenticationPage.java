package company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ControllerAuthenticationPage {
    private static final String CONTROLLER_AUTHENTICATION_PAGE_URL ="http://automationpractice.com/index.php?controller=authentication";
    private WebDriver driver;

    private By errorTitleMessage = By.xpath("//*[@id=\"center_column\"]/div/p");

    public ControllerAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public ControllerAuthenticationPage openMainPage(){
        this.driver.navigate().to(CONTROLLER_AUTHENTICATION_PAGE_URL);
        return this;
    }

    public void openControllerAuthenticationPage(){
        driver.navigate().to(CONTROLLER_AUTHENTICATION_PAGE_URL);
        System.out.println("openControllerAuthenticationPage");
    }
    
    public String getErrorTitleMessage(){
        System.out.println("getErrorTitleMessage");
        return driver.findElement(errorTitleMessage).getText();
    }
}
