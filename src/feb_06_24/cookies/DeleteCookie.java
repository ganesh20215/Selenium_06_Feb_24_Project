package feb_06_24.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookie {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();            //Upcasting
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        Cookie cookie =  new Cookie("company", "Edso Services");
        driver.manage().addCookie(cookie);

        Set<Cookie> allCookies2 = driver.manage().getCookies();
        System.out.println("Before Deletion of cookies");
        for (Cookie c : allCookies2){
            System.out.println(c);
        }

        System.out.println("##############################################################");
        System.out.println("After deletation of cookie");
//        driver.manage().deleteCookie(cookie);
//        driver.manage().deleteCookieNamed("company");
        driver.manage().deleteAllCookies();

        Set<Cookie> allCookies3 = driver.manage().getCookies();
        System.out.println("Before Deletion of cookies");
        for (Cookie c : allCookies3){
            System.out.println(c);
        }
    }
}
