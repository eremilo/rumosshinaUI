import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Auth;
import pages.Lk;

public class TestAuth extends WebDriver{

    @Test(description = "Авторизация пользователя")
    public void auth() {
        Auth auth = new Auth();
        Lk lk = auth.login("mail@mail.ru", "password");
        Assert.assertEquals(lk.getPersonalInfo(),"IVANOV IVAN");

    }
    }
