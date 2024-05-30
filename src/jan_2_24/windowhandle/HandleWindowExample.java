package jan_2_24.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleWindowExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("openwindow")).click();
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);

        for (String s : allWindow) {
            if (!s.contentEquals(parentWindowId)) {
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                Thread.sleep(3000);
                driver.findElement(By.xpath("//a[text()='HOME']")).click();
                Thread.sleep(3000);
                driver.close();
            }
        }

        System.out.println("Parent Window Title " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();

    }
}
