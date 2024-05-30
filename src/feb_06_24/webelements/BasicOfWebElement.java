package feb_06_24.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfWebElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
/*
        //sendkeys()
        WebElement element = driver.findElement(By.id("login1"));
        element.sendKeys("ganesh20215@gmail.com");
        Thread.sleep(3000);

        //clear()
        element.clear();
        Thread.sleep(3000);*/

        //submit()
/*        WebElement submitBtn = driver.findElement(By.className("signinbtn"));
        submitBtn.submit();*/

        //getText()
/*        WebElement element = driver.findElement(By.xpath("//div[@class='create-new-account']"));
        String text = element.getText();
        System.out.println(text);*/

        //getTagName()
        WebElement tagName = driver.findElement(By.xpath("//div[@class='create-new-account']"));
        System.out.println(tagName.getTagName());

        Thread.sleep(3000);

        driver.close();
    }
}
