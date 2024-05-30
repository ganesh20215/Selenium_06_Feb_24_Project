package feb_06_24.locator.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

/*        WebElement element = driver.findElement(By.xpath("//input[@id='login1']"));
        element.sendKeys("Hello Everyone");*/

//        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
//        driver.findElement(By.xpath("//u[starts-with(text(),'Create')]")).click();
//        driver.findElement(By.xpath("//input[starts-with(@id,'login1')]")).sendKeys("Hello");
        

        Thread.sleep(3000);

        driver.close();
    }
}
