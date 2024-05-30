package jan_2_24.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumOnEdgeBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\edgedriver_win32\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(4000);
        driver.close();
    }
}
