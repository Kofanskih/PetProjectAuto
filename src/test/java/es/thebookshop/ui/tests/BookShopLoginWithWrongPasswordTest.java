package es.thebookshop.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class BookShopLoginWithWrongPasswordTest {
    public final String USER_EMAIL = "kofanski08@gmail.com";
    public final String WRONG_USER_EMAIL = "kofanskih08@gmail.com";
    public final String USER_PASSWORD = "09876TYUI54321iuyt";
    public final String BOOKSHOP_LOGIN_PAGE = "https://www.thebookshop.es/account";



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
    void userBookShopLogin() throws InterruptedException {
        open(BOOKSHOP_LOGIN_PAGE);
        Thread.sleep(500);
        $("[name=\"eml\"]").setValue(WRONG_USER_EMAIL);
        $("[name=\"pwd\"]").setValue(USER_PASSWORD);
        $("[id=\"login\"]").click();
        $("[id=\"loginerrornotification\"]").shouldHave(Condition.exactText(""));
        //$("[id=\"loginerrornotification\"]").shouldHave(Condition.exactText("Incorrect email address or password"));
        //$x("//div [@class=\"main\"]//div [@class=\"topbarnotification\"]").shouldHave(Condition.exactText(""));
        //$x("//div [@class=\"main\"]//div [@class=\"topbarnotification\"]").shouldHave(Condition.exactText("Incorrect email address or password"));


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
