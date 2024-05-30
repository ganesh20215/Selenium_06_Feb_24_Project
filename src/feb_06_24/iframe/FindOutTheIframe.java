package feb_06_24.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindOutTheIframe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());

        driver.close();
    }
}
