package feb_06_24.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ImplicitWaitExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        //Implicit Wait (Global Wait)
        // throws No Such Element Exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("openwindow")).click();

        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        System.out.println("GetWindowHandles Method");
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);


    }
}
