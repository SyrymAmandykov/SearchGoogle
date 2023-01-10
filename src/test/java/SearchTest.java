import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.net.PortProber.random;

public class SearchTest {
    @Test
     void successfulTest(){
        Configuration.holdBrowserOpen = true;
       open("https://www.google.kz/");
        $("[name=q]").setValue("instagram").pressEnter();
        $("[id=\"center_col\"]").shouldHave(text("https://www.instagram.com"));
    }

    void test(){
    }
}
