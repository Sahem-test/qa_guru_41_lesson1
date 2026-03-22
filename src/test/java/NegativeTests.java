import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class NegativeTests {

    @Test
        void lockedUserTest(){
            open("https://www.saucedemo.com/");
            $("#user-name").setValue("locked_out_user");
            $("[data-test=password]").setValue("secret_sauce");
            $(".submit-button").click();
            $("[data-test=error]").shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
            sleep(2000);
        }

    @Test
    void successfulDuckduckgoSearchTest() {
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=r1-0]").shouldHave(text("https://selenide.org"));
    }
}
