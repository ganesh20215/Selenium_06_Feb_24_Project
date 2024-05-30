package jan_2_24.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumOnFirefox {

    public static void main(String[] args) {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver drive= new FirefoxDriver(firefoxOptions);
        drive.get("https://www.selenium.dev/downloads/");
        drive.close();
    }
}
