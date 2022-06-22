package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class GettingStartedTest extends TestBase {
    @Test
    void gettingStartedTest() {

        step("Проверка текста на стартовом экране", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Переход на вторую страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("New ways to explore"));
        });

        step("Переход на третью страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Reading lists with sync"));
        });

        step("Переход на четвёртую страницу и проверка текста", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Send anonymous data"));
        });
    }
}
