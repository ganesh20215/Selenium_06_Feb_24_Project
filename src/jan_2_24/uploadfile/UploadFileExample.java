package jan_2_24.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUploadElement = driver.findElement(By.id("file-upload"));
        fileUploadElement.sendKeys("C:\\Users\\Ganesh\\OneDrive\\Desktop\\AWS-Certification-Training-Course-for-Solutions-Architect.pdf");
        Thread.sleep(3000);

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();

        WebElement fileUploadSuccessMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (fileUploadSuccessMessage.getText().equalsIgnoreCase("File Uploaded!")){
            System.out.println("Our File successfully Added");
        }else {
            System.out.println("Our File isn't successfully Added");
        }

        Thread.sleep(10000);

        driver.close();
    }
}
