package feb_06_24.actiondemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();

        WebElement dbClick = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(dbClick)
                .perform();

        Thread.sleep(4000);
        driver.close();
    }
}
