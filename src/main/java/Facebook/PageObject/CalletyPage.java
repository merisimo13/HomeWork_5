package Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalletyPage {
    protected SelenideElement
    GoToArtFairsPage = $(byText("Art Fairs"));
}
