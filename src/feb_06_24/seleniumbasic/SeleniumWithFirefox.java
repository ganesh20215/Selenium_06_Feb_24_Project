package feb_06_24.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumWithFirefox {

    public static void main(String[] args) throws InterruptedException {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();

        driver.findElement(By.id("login1")).sendKeys("ganesh20215@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("ganesh");
        Thread.sleep(3000);

        driver.close();
    }
}
