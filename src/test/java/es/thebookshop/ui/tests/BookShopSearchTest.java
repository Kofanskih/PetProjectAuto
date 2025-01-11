package es.thebookshop.ui.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookShopSearchTest {
    public final String BOOKSHOP_MAIN_PAGE = "https://www.thebookshop.es/";
    public final String SEARCH_REQUEST = "Little";

    @BeforeClass
    void preConditions() {
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
        System.out.println("BookShop class precondition");
    }

    @BeforeMethod
    void preConditionMethod() {
        System.out.println("BookShop method precondition");
    }

    @Test
    void userBookShopSearch() throws InterruptedException {
        open(BOOKSHOP_MAIN_PAGE);
        Thread.sleep(500);
        $("[name=\"s\"]").setValue(SEARCH_REQUEST);
        $("[class=\"searchform-button\"]").click();
        Thread.sleep(500);
    }

    @AfterClass
    void postConditions() {
        System.out.println("BookShop Class Postconditions");

    }

    @BeforeMethod
    void postConditionMethod() {
        System.out.println("BookShop Method Postconditions");
    }
}
