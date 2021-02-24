package company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    private static final String SEARCH_PAGE_URL ="http://";

    private By listButton = By.xpath("//a[@title =\"List\"]//i");
    private By listViewStyle = By.xpath("//*[@class=\"product_list row list\"]");
    private By gridViewStyle = By.xpath("//*[@class=\"product_list row grid\"]");
    private By requestedProductHeader = By.xpath("//*[@class=\"lighter\"]");
    private By addToCartListViewStyle = By.xpath("//a[@title = \"Add to cart\"][1]");
    private By addToGridListViewStyle;
    private By proceedToCheckoutButton = By.xpath("//*[@title='Proceed to checkout']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage openMainPage(){
        this.driver.navigate().to(SEARCH_PAGE_URL);
        return this;
    }

    public String cheackRequestedProductHeader(){
        return driver.findElement(requestedProductHeader).getText();
    }

    public void clickListButton(){
        driver.findElement(listButton).click();
    }

    public void clickAddToCartListViewStyle(){
            driver.findElement(addToCartListViewStyle).click();
    }

    public void clickProceedToCheckoutButton(){
        driver.findElement(proceedToCheckoutButton).click();
    }

//    public void clickProceedToCheckout() {
//        new WebDriverWait(driver, 10).
//                until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutButton).click();
//    }

    public String cheackListViewStyle(){
        return driver.findElement(listViewStyle).getText();
    }

//    public void clickSignInButton(){
//        driver.findElement(signInButton).click();
//    }
//
//    public void enterSearchInput (String searchProduct){
//        driver.findElement(searchInput).sendKeys(searchProduct);
//    }
//
    //a[@title = "Add to cart"][1]
    //a[@title = "Add to cart"][1]
//    private By searchInput = By.id("search_query_top");
//    private By submitSearchButton = By.xpath("//button[@name =\"submit_search\"]");
}
