package company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage {
    private WebDriver driver;

    private static final String SHOPPING_CART_SUMMARY_PAGE ="";

    private By totalProductsPrice = By.id("total_product");
    private By totalShippingPrice = By.id("total_shipping");
    private By totalPriceWithoutTax = By.id("total_price_without_tax");
    private By totalTax = By.id("total_tax");
    private By totalPrice = By.xpath("//*[@id=\'total_price\']");
    private By unitPrice = By.xpath("(//*[@data-title=\"Unit price\"]/span/span)[1]");
    private By deleteProductButton = By.xpath("//*[@title = \"Delete\"][1]");
    private By emptyCart = By.xpath("//*[@class=\'ajax_cart_no_product\']");

    public ShoppingCartSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCartSummaryPage openMainPage(){
        this.driver.navigate().to(SHOPPING_CART_SUMMARY_PAGE);
        return this;
    }

    public Double getTotalProductsPrice(){
        String result = driver.findElement(totalProductsPrice).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double getTotalShipping(){
        String result = driver.findElement(totalShippingPrice).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double getTotalPriceWithoutTax(){
        String result = driver.findElement(totalPriceWithoutTax).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double getTax(){
        String result = driver.findElement(totalTax).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double getTotalPrice(){
        String result = driver.findElement(totalPrice).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double getUnitPrice(){
        String result = driver.findElement(unitPrice).getText();
        return Double.valueOf(result.replaceAll("\\$", ""));
    }

    public Double countTotalProductsPrice(int productQuantity) {
        Double unitPrice = this.getUnitPrice();
        return unitPrice * productQuantity;
    }

    public Double countTotalPriceWithoutTax(int productQuantity) {
        Double totalProductsPrice = this.countTotalProductsPrice(productQuantity);
        Double totalShipping = this.getTotalShipping();
        return  totalProductsPrice + totalShipping;
    }

    public Double countTotalPrice(int productQuantity) {
        Double totalPriceWithoutTax = this.countTotalPriceWithoutTax(productQuantity);
        Double tax = this.getTax();
        return totalPriceWithoutTax + tax;
    }

    public boolean isCartEmpty(){
        String result = driver.findElement(emptyCart).getText();
        String empty = result.replaceAll("\\(|\\)", "");
        if(empty.equals("empty"))
            return true;
        else
            return false;
    }

    public void clickDeleteProductButton(){
        driver.findElement(deleteProductButton).click();
    }
}
