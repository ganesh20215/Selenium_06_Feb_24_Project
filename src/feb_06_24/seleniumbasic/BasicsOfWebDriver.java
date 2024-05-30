package feb_06_24.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicsOfWebDriver {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        //ChromeDriver driver = new ChromeDriver();      //child class object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();

        driver.findElement(By.id("login1")).sendKeys("ganesh20215@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("ganesh");
        Thread.sleep(3000);

        driver.close();
    }
}
