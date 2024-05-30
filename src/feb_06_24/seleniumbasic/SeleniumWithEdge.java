package feb_06_24.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWithEdge {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\edgedriver_win32\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        driver.close();
    }
}
