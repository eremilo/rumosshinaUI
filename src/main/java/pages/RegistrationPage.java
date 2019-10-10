package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public RegistrationPage() {
        $(By.cssSelector("title")).getText().contains("Регистрация");
    }

    public String registrationButton (){
        $(By.cssSelector(".button[name='AddUser[add]']")).click();
        return $(By.cssSelector("[style='color: #a94442;background-color: #f2dede;border: 1px solid #ebccd1;padding: 15px;border-radius: 4px;']")).getText();
    }
    public void fillCredential(String fio, String city, String email, String password) {
        $(By.id("reg-field-fio")).sendKeys(fio);
        $(By.id("reg-field-city")).sendKeys(city);
        $(By.id("reg-field-email")).sendKeys(email);
        $(By.id("reg-field-passwd")).sendKeys(password);
        $(By.id("reg-field-repeat_passwd")).sendKeys(password);

    }


}
