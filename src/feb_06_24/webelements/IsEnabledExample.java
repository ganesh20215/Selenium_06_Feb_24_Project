package feb_06_24.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement enableBtn = driver.findElement(By.id("enabled-button"));

        System.out.println(textBox.isEnabled());    //true
        disableBtn.click();
        Thread.sleep(3000);
        System.out.println(textBox.isEnabled());    //false
        enableBtn.click();
        Thread.sleep(3000);
        System.out.println(textBox.isEnabled());    //true
        Thread.sleep(3000);

        driver.close();
    }
}
