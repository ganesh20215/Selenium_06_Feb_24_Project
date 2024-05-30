package feb_06_24.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWithCustomBrowser {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);            //Upcasting
        driver.get("https://www.amazon.in");

        Thread.sleep(5000);

        driver.close();
    }
}
