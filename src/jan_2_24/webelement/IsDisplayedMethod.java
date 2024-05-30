package jan_2_24.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement showElement = driver.findElement(By.id("show-textbox"));
        WebElement hideElement = driver.findElement(By.id("hide-textbox"));
        WebElement textBox = driver.findElement(By.id("displayed-text"));

        System.out.println(textBox.isDisplayed());    //true
        hideElement.click();
        System.out.println(textBox.isDisplayed());    //false
        showElement.click();
        System.out.println(textBox.isDisplayed());    //true

        driver.close();
    }
}
