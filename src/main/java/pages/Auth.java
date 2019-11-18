package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.Lk;
import pages.RegistrationPage;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class Auth {

    public Auth() {
        $(by("href", "/personal/")).click();
        $("title").getText().contains("Авторизация");
    }
    @Step("Создаем новый Аккаунт")
    public RegistrationPage createNewAccount() {
        $(By.xpath("//*[@id=\"layout\"]/div[2]/div/div/div[2]/div/div/form/div[4]/div[1]/a")).click();
        return new RegistrationPage();
    }

    @Step("Выполняем вход по {mail}")
    public Lk login(String mail, String pass) {
        $("#reg-field-1[type='text']").sendKeys(mail);
        $("#reg-field-1[type='password']").sendKeys(pass);
        $("#reg-field-1[type='password']").pressEnter();
        return new Lk();
    }
}
