package jan_2_24.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      //Global Wait
    }
}
