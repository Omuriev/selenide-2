import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertionsTests {
    @Test
    void shouldFindJUnit5ExampleText() {
        open("https://github.com/");
        $("[data-scoped-placeholder=Search]").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("[id=wiki-tab]").click();
        $(".wiki-rightbar .js-wiki-more-pages-link").click();
        $("[id=wiki-pages-box]").$(byText("SoftAssertions")).click();
        $("[id=wiki-body]").shouldHave(text("Using JUnit5 extend test class"));
    }
}
