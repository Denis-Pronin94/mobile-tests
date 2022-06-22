package tests.browserstack;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class HistoryTests extends TestBase {
    @Test
    void historyTests() {

        back();

        step("Открыть историю и проверить ее отсутствие", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/nav_tab_search")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/history_empty_title"))
                 .shouldHave(Condition.text("No recently viewed articles"));
        });

        step("Ввести в поиск World of Tanks", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_card")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("World of Tanks");

        step("Проверка содержимого", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                 .shouldHave(CollectionCondition.sizeGreaterThan(0)));

        step("Открыть статью World of Tanks", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                 .find(Condition.text("World of Tanks")).click();
        });

        back();
        back();
        back();

        step("Проверка истории на World of Tanks", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                 .shouldHave(Condition.text("World of Tanks"));
            });
        });
    }
}
