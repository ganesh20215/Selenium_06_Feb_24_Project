package jan_2_24.javascriptsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByWebElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//a[text()='Disclaimer']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;        //DownCasting
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

        Thread.sleep(3000);

        driver.close();
    }
}
