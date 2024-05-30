package feb_06_24.actiondemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .perform();
    }
}
