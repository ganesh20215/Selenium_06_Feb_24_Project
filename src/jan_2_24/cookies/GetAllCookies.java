package jan_2_24.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //UpCasting
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

/*        System.out.println("Before Adding Cokie");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c :allCookies){
            System.out.println(c);
        }*/

        System.out.println("------------------------------------------------");
        System.out.println("After Adding Cokie");
        Cookie cok = new Cookie("company", "Edso Services");
        driver.manage().addCookie(cok);

        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c :allCookies2){
            System.out.println(c);
        }

/*        System.out.println("*****************************************************");
        System.out.println("Get the cookie by name");
        System.out.println(driver.manage().getCookieNamed("company"));*/

        System.out.println("*****************************************************");
/*        System.out.println("Delete cookie");
        driver.manage().deleteCookie(cok);*/

/*        System.out.println("Delete cookie by name");
        driver.manage().deleteCookieNamed("company");*/

        System.out.println("Delete All Cookie");
        driver.manage().deleteAllCookies();

        Set<Cookie> allCookies3 = driver.manage().getCookies();
        for (Cookie c :allCookies3){
            System.out.println(c);
        }

        driver.close();
    }
}
