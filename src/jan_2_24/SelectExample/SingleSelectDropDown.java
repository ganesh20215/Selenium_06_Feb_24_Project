package jan_2_24.SelectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select select = new Select(dropDown);

        //Select By Index
        select.selectByIndex(2);
        Thread.sleep(3000);

        //Select by Value
        select.selectByValue("bmw");
        Thread.sleep(3000);

        //Select By Visible Text
        select.selectByVisibleText("Benz");
        Thread.sleep(3000);

        driver.close();
    }
}
