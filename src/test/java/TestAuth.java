import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Auth;
import pages.Lk;

public class TestAuth extends WebDriver {
    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Сложение")
    @Test
    public void auth() {
        Auth auth = new Auth();
        Lk lk = auth.login("mail@mail.ru", "password");
        Assert.assertEquals(lk.getPersonalInfo(), "IVANOV IVAN");
    }
}
