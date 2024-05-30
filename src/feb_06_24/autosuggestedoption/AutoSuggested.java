package feb_06_24.autosuggestedoption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggested {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.findElement(By.xpath("//span[text()='✕']")).click();

        WebElement searchTextBox = driver.findElement(By.name("q"));
                searchTextBox.sendKeys("mobile");

        Thread.sleep(3000);
        List<WebElement> allElements = driver.findElements(By.xpath("//li[@class='_3D0G9a']//following::div[@class='YGcVZO _2VHNef']"));

        for (WebElement element : allElements){
            if (element.getText().equalsIgnoreCase("mobile charger")){
                Thread.sleep(3000);
/*                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.presenceOfElementLocated(e));*/
                element.click();
                break;
            }
        }

        Thread.sleep(3000);

        driver.close();
    }
}
