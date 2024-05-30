package feb_06_24.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(3000);

        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Next']")).click();

        Thread.sleep(3000);

        String date = "25";

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::td/a"));

        for (WebElement e : allDates){
            if (e.getText().equalsIgnoreCase(date)){
                e.click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.close();
    }
}
