package es.thebookshop.ui.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookShopLogoutTest {
    public final String USER_EMAIL = "kofanski08@gmail.com";
    public final String USER_PASSWORD = "09876TYUI54321iuyt";
    public final String BOOKSHOP_LOGIN_PAGE = "https://www.thebookshop.es/account";



    @BeforeClass
    void preConditions() {
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
        System.out.println("BookShop class precondition");
    }

    @BeforeMethod
    void userBookShopLogin() throws InterruptedException {
        open(BOOKSHOP_LOGIN_PAGE);
        Thread.sleep(500);
        $("[name=\"eml\"]").setValue(USER_EMAIL);
        $("[name=\"pwd\"]").setValue(USER_PASSWORD);
        $("[id=\"login\"]").click();
        Thread.sleep(500);
    }

    @Test
    void userBookShopLogout() throws InterruptedException {
        $("[href=\"/account/logout\"]").click();
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
