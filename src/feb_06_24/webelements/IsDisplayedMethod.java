package feb_06_24.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement showBtn = driver.findElement(By.id("show-textbox"));

        System.out.println(textBox.isDisplayed());    //true
        hideBtn.click();
        Thread.sleep(3000);
        System.out.println(textBox.isDisplayed());    //false
        showBtn.click();
        Thread.sleep(3000);
        System.out.println(textBox.isDisplayed());    //true
        Thread.sleep(3000);

        driver.close();
    }
}
