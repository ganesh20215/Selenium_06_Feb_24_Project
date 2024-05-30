package jan_2_24.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStudy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //SendKeys Method
/*        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("Ganesh@gmail.com");*/

        //Click Method
/*        WebElement element = driver.findElement(By.className("signinbtn"));
        element.click();*/

        //clear Method
/*        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("Ganesh@gmail.com");
        Thread.sleep(3000);
        element.clear();*/

        //submit method
        /*WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("Ganesh@gmail.com");
        element.submit();*/

        //getText() Method
       /* WebElement element = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        System.out.println(element.getText());*/

        //getTagName() Method
/*        WebElement element = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        System.out.println(element.getTagName());*/

        //getAttribute() Method
        WebElement element = driver.findElement(By.id("login1"));
        String s = element.getAttribute("id");
        System.out.println(s);

        Thread.sleep(4000);
        driver.close();
    }
}
