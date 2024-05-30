package jan_2_24.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();

        driver.findElement(By.id("login1")).sendKeys("GaneshJadhav@gmail.com");
        driver.findElement(By.id("password")).sendKeys("GaneshJadhav");

        Thread.sleep(4000);

        driver.close();
    }
}
