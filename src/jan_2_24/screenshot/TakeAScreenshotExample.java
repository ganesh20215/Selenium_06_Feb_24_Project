package jan_2_24.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeAScreenshotExample {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f, new File("C:\\Users\\Ganesh\\OneDrive\\Desktop\\conference12.jpg"));

        driver.close();
    }
}
