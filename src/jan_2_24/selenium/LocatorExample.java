package jan_2_24.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //By Id Locator
/*        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("Ganesh@gmail.com");*/

        //By classname locator
/*        WebElement element = driver.findElement(By.className("signinbtn"));
        element.click();*/

        //By name locator
/*        WebElement element = driver.findElement(By.name("login"));
        element.sendKeys("Ganesh@gmail.com");*/

        //By linktext()
/*        WebElement element = driver.findElement(By.linkText("Forgot Password?"));
        element.click();*/

        //By partial link text
/*        WebElement element = driver.findElement(By.partialLinkText("Forgot"));
        element.click();*/

        //By tagname
/*        List<WebElement> allLists = driver.findElements(By.tagName("input"));
        System.out.println(allLists.size());*/

        //By css Selector by id
        /*WebElement element = driver.findElement(By.cssSelector("input[id='login1']"));
        element.sendKeys("Ganesh@gmail.com");*/

/*        WebElement element = driver.findElement(By.cssSelector("input#login1"));
        element.sendKeys("Ganesh@gmail.com");*/

/*        WebElement element = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        element.click();*/

/*
        WebElement element = driver.findElement(By.cssSelector("input.signinbtn"));
        element.click();
*/

        //By the xpath axes
        WebElement element = driver.findElement(By.xpath("//input[@id='login1']"));
        element.sendKeys("Hello Everyone");

        Thread.sleep(3000);

        driver.close();
    }
}
