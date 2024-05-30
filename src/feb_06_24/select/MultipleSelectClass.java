package feb_06_24.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDownElement = driver.findElement(By.id("multiple-select-example"));

        Select select = new Select(dropDownElement);

        Thread.sleep(3000);
        //select option with selectByIndex method
        select.selectByIndex(2);
        Thread.sleep(3000);

        //select option with selectByValue method
        select.selectByValue("orange");
        Thread.sleep(3000);

        //Select option with selectByVisible method
        select.selectByVisibleText("Apple");
        Thread.sleep(3000);

        driver.close();
    }
}
