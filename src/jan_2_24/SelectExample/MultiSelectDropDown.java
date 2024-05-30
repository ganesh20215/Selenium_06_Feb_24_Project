package jan_2_24.SelectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement multiSelectDropDown = driver.findElement(By.id("multiple-select-example"));

        Select select = new Select(multiSelectDropDown);

        select.selectByValue("orange");
        Thread.sleep(3000);

        select.selectByIndex(0);
        Thread.sleep(3000);

        select.selectByVisibleText("Peach");
        Thread.sleep(3000);




        List<WebElement> allElement = select.getAllSelectedOptions();

        for (WebElement element : allElement){
            System.out.println(element.getText());
        }

        driver.close();
    }
}
