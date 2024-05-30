package feb_06_24.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetCookiesByName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        Cookie cookie =  new Cookie("company", "Edso Services");
        driver.manage().addCookie(cookie);

        Set<Cookie> allCookies2 = driver.manage().getCookies();

        for (Cookie c : allCookies2){
            System.out.println(c);
        }

        System.out.println("************************************************");
        System.out.println("Get Cookie By Name");
        System.out.println(driver.manage().getCookieNamed("company"));

        driver.close();
    }
}
