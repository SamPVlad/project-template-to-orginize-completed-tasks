package company;

import company.pages.*;
import company.units.Config;
import company.units.TestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SmokeTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");

    private MainPage mainPage;
    private SearchPage searchPage;
    private ShoppingCartSummaryPage shoppingCartSummaryPage;


    @Test
    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(config.getProperty("baseurl"));

        mainPage = new MainPage(driver);

        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name =\"submit_search\"]")));

        String requestedProduct = "Blouse";

        mainPage.enterSearchInput(requestedProduct);

        mainPage.clickSubmitSearchButton();

        searchPage = new SearchPage(driver);

        WebElement dynamicElement2 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title =\"List\"]//i")));

        //Assert.assertEquals(requestedProduct, searchPage.cheackRequestedProductHeader());

        searchPage.clickListButton();

        searchPage.clickAddToCartListViewStyle();

        WebElement dynamicElement3 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='Proceed to checkout']")));

        searchPage.clickProceedToCheckoutButton();

        shoppingCartSummaryPage = new ShoppingCartSummaryPage(driver);

        int quantity = 1;
        Double shippingPrice = Double.valueOf(2);
        Double tax = Double.valueOf(0);

        WebElement dynamicElement4 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@data-title=\"Unit price\"]/span/span)[1]")));

        Assert.assertEquals(shoppingCartSummaryPage.countTotalProductsPrice(quantity), shoppingCartSummaryPage.getTotalProductsPrice());
        Assert.assertEquals(shippingPrice, shoppingCartSummaryPage.getTotalShipping());
        Assert.assertEquals(shoppingCartSummaryPage.countTotalPriceWithoutTax(quantity), shoppingCartSummaryPage.getTotalPriceWithoutTax());
        Assert.assertEquals(tax, shoppingCartSummaryPage.getTax());
        Assert.assertEquals(shoppingCartSummaryPage.countTotalPrice(quantity), shoppingCartSummaryPage.getTotalPrice());

        shoppingCartSummaryPage.clickDeleteProductButton();

        Assert.assertEquals(true, shoppingCartSummaryPage.isCartEmpty());
    }
}
