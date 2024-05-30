package jan_2_24.datepickerandautosuggested;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerOption {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.abhibus.com/");
        //https://jqueryui.com/datepicker/
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Thread.sleep(4000);

        WebElement datePickerElement = driver.findElement(By.xpath("(//div[starts-with(@class,'input-prefix')])[3]"));
        datePickerElement.click();

        List<WebElement> allDate = driver.findElements(By.xpath("//div[@class='container date ']//child::span"));
        for (WebElement e : allDate){
            if (e.getText().contentEquals("30")){
                e.click();
                break;
            }
        }

        Thread.sleep(4000);
        driver.close();
    }
}
