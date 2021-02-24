package company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    private WebDriver driver;

    private static final String MY_ACCOUNT_PAGE_URL = "http://automationpractice.com/index.php?controller=my-account";

    @FindBy(xpath = "//*[@href = \'http://automationpractice.com/index.php?controller=my-account\'] [@class]")
    private WebElement accountBtn;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MyAccountPage openMainPage() {
        this.driver.navigate().to(MY_ACCOUNT_PAGE_URL);
        return this;
    }

    public String getAccountName() {
        return accountBtn.getText();
    }
}

