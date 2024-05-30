package jan_2_24.javascriptsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDownByPixcel {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;        //DownCasting
        javascriptExecutor.executeScript("window.scrollBy(0, 2500)");

        Thread.sleep(3000);
        javascriptExecutor.executeScript("window.scrollBy(0, -2000)");

        Thread.sleep(5000);
        driver.close();

    }
}
