package feb_06_24.actiondemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class KeyBoardBaseMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
        actions.moveToElement(textBox)
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .pause(Duration.ofSeconds(2))
                .sendKeys("t shirt")
                .pause(Duration.ofSeconds(2))
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        Thread.sleep(4000);
        driver.close();
    }
}
