package feb_06_24.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleScenario {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        System.out.println("GetWindowHandles Method");
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);

        for (String s : allWindow) {
            if (!parentWindowId.contentEquals(s)) {
                driver.switchTo().window(s);         //Switch from parent to child window
                Thread.sleep(2000);
                driver.findElement(By.xpath("//a[text()='ALL COURSES']")).click();
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
        Thread.sleep(2000);
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.close();
    }
}
