package ua.com.ranok.ui.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RanokSearchTest {
    public final String RANOK_MAIN_PAGE = "https://www.ranok.com.ua/";
    public final String SEARCH_REQUEST = "Буквар";

    @BeforeClass
    void preConditions() {
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
        System.out.println("Ranok class precondition");
    }

    @BeforeMethod
    void preConditionMethod() {
        System.out.println("Ranok method precondition");
    }

    @Test
    void userRanokSearch() throws InterruptedException {
        open(RANOK_MAIN_PAGE);
        Thread.sleep(5000);
        System.out.println("Page opened");
        $("[name=\"q\"]").setValue(SEARCH_REQUEST);
        //$("[name=\"field-keywords\"]").setValue("Keyboards");
        $("[data-button=\"search-find\"]").click();
        //$("[name=\"site-search\"]").click();
        System.out.println("Search was complete");
        Thread.sleep(5000);
        System.out.println("Sleep 2");
    }

    @AfterClass
    void postConditions() {
        System.out.println("Ranok Class Postconditions");

    }

    @BeforeMethod
    void postConditionMethod() {
        System.out.println("Ranok Method Postconditions");
    }
}
