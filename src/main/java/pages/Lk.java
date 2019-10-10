package pages;

import static com.codeborne.selenide.Selenide.$;

public class Lk {
    public String getPersonalInfo() {
        return $(".content-box__wrapper .caption").getText();
    }
}
