package jan_2_24.SelectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptions {

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

        System.out.println(select.isMultiple());

/*        select.deselectByVisibleText("Peach");
        Thread.sleep(3000);

        select.deselectByIndex(1);
        Thread.sleep(3000);

        select.deselectByValue("apple");
        Thread.sleep(3000);*/

        select.deselectAll();
        Thread.sleep(3000);

        driver.close();
    }
}
