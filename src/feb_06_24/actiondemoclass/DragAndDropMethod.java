package feb_06_24.actiondemoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();

        WebElement elementSrc = driver.findElement(By.id("draggable"));
        WebElement elementDesc = driver.findElement(By.id("droppable"));

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementSrc, elementDesc)
                .perform();

        Thread.sleep(5000);
        driver.close();
    }
}
