package by.vek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyDriver {
    private static WebDriver driver;

    private MyDriver() {
    }

    public static MyDriver getDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        }
        return (MyDriver) driver;
    }

    public static void quit(){
        if(driver != null) {
            driver.quit();
        }
    }
}

