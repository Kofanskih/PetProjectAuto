package ua.com.ranok.ui.tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.*;

public class RanokLoginTest {
    public final String USER_EMAIL = "kofanski08@gmail.com";
    public final String USER_PASSWORD = "09876TYUI54321iuyt";
    public final String RANOK_MAIN_PAGE = "https://www.ranok.com.ua/";



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
    void userRanokLogin() throws InterruptedException, AWTException {
        open(RANOK_MAIN_PAGE);
        Thread.sleep(500);
        System.out.println("Page opened");
        $("[data-for=\"popup-login\"]").click();
        System.out.println("Pop-up opened");
        Thread.sleep(500);
        $("[id=\"loginEmail\"]").setValue(USER_EMAIL);
        $("[id=\"loginPass\"]").setValue(USER_PASSWORD);
        //$("[class*=\"popup popup-login\"] button").click();
        $("[class*=\"popup popup-login\"] button").sendKeys(Keys.ENTER);



        Thread.sleep(10000);

    }



}
