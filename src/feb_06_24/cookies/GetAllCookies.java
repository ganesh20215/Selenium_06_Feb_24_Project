package feb_06_24.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GetAllCookies {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        Set<Cookie> allCookies = driver.manage().getCookies();

        for (Cookie c : allCookies){
            System.out.println(c);
        }

        driver.close();
    }
}
