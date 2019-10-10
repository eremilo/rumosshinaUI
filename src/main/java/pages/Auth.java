package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class Auth {

    public Auth() {
        $(by("href","/personal/")).click();
        $("title").getText().contains("Авторизация");

    }

     public RegistrationPage createNewAccount() {
        $(By.linkText("Создать новый аккаунт")).click();
        return new RegistrationPage();
    }

    public Lk login(String mail, String pass) {
        $("#reg-field-1[type='text']").sendKeys(mail);
        $("#reg-field-1[type='password']").sendKeys(pass);
        $("#reg-field-1[type='password']").pressEnter();
        return new Lk();
    }
}