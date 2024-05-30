package jan_2_24.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement enableElement = driver.findElement(By.id("enabled-button"));
        WebElement disableElement = driver.findElement(By.id("disabled-button"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));

        System.out.println(textBox.isEnabled());    //true
        disableElement.click();
        System.out.println(textBox.isEnabled());    //false
        enableElement.click();
        System.out.println(textBox.isEnabled());    //true

        driver.close();
    }
}
