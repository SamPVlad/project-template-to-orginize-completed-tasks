package company.units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class TestHelper {

    public static void sleepSecondsThread(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int randomInt() {
        Random rn = new Random();
        return rn.nextInt();
    }

    public static void sleepSecondsExplicityWait(int seconds, By locator, WebDriver driver) {
    WebElement dynamicElement = (new WebDriverWait(driver, seconds))
            .until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
