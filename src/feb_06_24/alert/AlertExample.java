package feb_06_24.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

//        driver.findElement(By.id("alertbtn")).click();

        driver.findElement(By.id("confirmbtn")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

/*        String alertText = alert.getText();
        System.out.println(alertText);*/

//        alert.accept();

        alert.dismiss();

        Thread.sleep(3000);

        driver.close();
    }
}
