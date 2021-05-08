import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomeWork_5 {
    @Test
    public void HomeWork_5(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.facebook.com/");
        $(byText("Create New Account")).click();
        $(byName("firstname")).setValue("Meri");
        $(byName("lastname")).setValue("Simonishvili");
        $(byName("reg_email__")).setValue("592836161");
        $(byName("reg_passwd__")).setValue("Fortako");
        $(byName("birthday_month")).selectOption("Oct");
        $(byName("birthday_day")).selectOption("29");
        $(byName("birthday_year")).selectOption("1994");
        $(byText("Custom")).click();
        $(byText("Select your pronoun")).shouldBe(Condition.visible);
        $(byName("preferred_pronoun")).click();
        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $(byText("Female")).click();
        $(byText("Select your pronoun")).shouldNotBe(Condition.visible);
        sleep (4000);



    }

}
