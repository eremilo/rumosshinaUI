import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Auth;
import pages.RegistrationPage;


public class TestRegistration extends WebDriver {

    @Test(description = "Регистрация пользователя")
    public void registration() {

        Auth auth = new Auth();
        RegistrationPage registrationPage = auth.createNewAccount();
        registrationPage.fillCredential("Ivanov Ivan", "Ivanovo", "mail@mail.ru", "password");
        String result = registrationPage.registrationButton();
        Assert.assertEquals(result, "Пользователь с логином \"mail@mail.ru\" уже существует.");
    }




}
