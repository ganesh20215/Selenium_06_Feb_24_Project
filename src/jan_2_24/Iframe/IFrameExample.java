package jan_2_24.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        List<WebElement> allList = driver.findElements(By.tagName("iframe"));
        System.out.println(allList.size());

        //jan_2_24.Iframe by Index
//        driver.switchTo().frame(4);

        //iframe with by name
//        driver.switchTo().frame("frame1");

        //iframe with WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());

        driver.switchTo().parentFrame();

        WebElement framesElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(framesElement.getText());


        driver.close();
    }
}
