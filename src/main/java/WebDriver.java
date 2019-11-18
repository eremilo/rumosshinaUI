import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class WebDriver {
    @BeforeClass
    public void WebDriver() {
        //Configuration.browser = WebDriverRunner.CHROME;
        //Configuration.browserSize = "1024x768"; //1920x1080
        open("http://www.mos-shina.ru");
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();

    }


}
