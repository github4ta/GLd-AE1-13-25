package by.vek.ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static Driver getDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        }
        return (Driver) driver;
    }

    public static void quit(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

