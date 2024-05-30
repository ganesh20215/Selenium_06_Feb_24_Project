package jan_2_24.alertexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
        WebElement textBoxElement = driver.findElement(By.id("name"));

        textBoxElement.sendKeys("Hello Everyone");

        alertBtn.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(3000);

        driver.close();
    }
}
