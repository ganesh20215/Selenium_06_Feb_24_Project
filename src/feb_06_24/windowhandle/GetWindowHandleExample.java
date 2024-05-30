package feb_06_24.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandleExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        //GetWindowsHandle Method return single parent window Id.
        //GetWindowsHandle method has a String return type
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);

        //GetWindowsHandles Method return parent windows as well as child window Id.
        //GetWindowsHandle method has a Set<String> return type
        System.out.println("GetWindowHandles Method");
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow);

        driver.quit();
    }
}
