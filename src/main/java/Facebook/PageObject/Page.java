package Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Page {
    protected SelenideElement
              accontButton = $(byText("Create New Account")),
              firtNameInput = $(byName("firstname")),
              lastNameInput = $(byName("lastname"));

}
