package feb_06_24.uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("C:\\Users\\Ganesh\\OneDrive\\Desktop\\conference12.jpg");
        Thread.sleep(2000);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(2000);
        WebElement fileUploadedMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (fileUploadedMessage.isDisplayed()){
            System.out.println("File Uploaded Sucessfully.............");
        }else {
            System.out.println("File isn't uploaded sucessfully..........");
        }
        Thread.sleep(3000);

        driver.close();
    }
}
