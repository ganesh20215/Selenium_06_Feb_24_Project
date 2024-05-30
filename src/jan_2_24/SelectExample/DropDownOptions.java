package jan_2_24.SelectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownOptions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select select = new Select(dropDown);

        List<WebElement> allElement = select.getOptions();

        for (WebElement element : allElement){
            System.out.println(element.getText());
        }

        driver.close();
    }
}
