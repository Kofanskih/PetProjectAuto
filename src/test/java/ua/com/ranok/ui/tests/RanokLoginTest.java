package ua.com.ranok.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.*;

public class RanokLoginTest {
    public final String USER_EMAIL = "kofanski08@gmail.com";//kofanskih08@gmail.com
    public final String USER_PASSWORD = "09876TYUI54321iuyt";//09876TYUI54321iuyt
    public final String RANOK_MAIN_PAGE = "https://www.ranok.com.ua/";



    @BeforeClass
    void preConditions() {
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
        System.out.println("Ranok class precondition");
        Configuration.timeout = 10;
        Configuration.headless = true;
    }

    @BeforeMethod
    void preConditionMethod() {
        System.out.println("Ranok method precondition");
    }

    @Test
    void checkErrorMessageLogin_V1() throws InterruptedException, AWTException {
        open(RANOK_MAIN_PAGE);
        Thread.sleep(500);
        System.out.println("Page opened");
        $("[data-for=\"popup-login\"]").click();
        System.out.println("Pop-up opened");
        Thread.sleep(500);
        $("[id=\"loginEmail\"]").setValue(USER_EMAIL);
        $("[id=\"loginPass\"]").setValue(USER_PASSWORD);
        $("[class*=\"popup popup-login\"] button").click();
        //$("[class*=\"popup popup-login\"] button").sendKeys(Keys.ENTER);
        String error = $("[class=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").getText();
        System.out.println(error);
        Assert.assertEquals(error, "Невірний E-mail та / або пароль");
    }
    @Test
    void checkErrorMessageLogin_V2() throws InterruptedException, AWTException {
        open(RANOK_MAIN_PAGE);
        System.out.println("Page opened");
        $("[data-for=\"popup-login\"]").click();
        System.out.println("Pop-up opened");
        $("[id=\"loginEmail\"]").setValue(USER_EMAIL);
        $("[id=\"loginPass\"]").setValue(USER_PASSWORD);// $("[class=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").shouldHave(Condition.visible); shouldHave(Condition.exist);
        $("[class*=\"popup popup-login\"] button").click();
        System.out.println("Login click");
        //$("[class*=\"popup popup-login\"] button").sendKeys(Keys.ENTER);
        $("[class*=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").shouldHave(Condition.exactText("Невірний E-mail та / або пароль"));
        $("[class*=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").shouldHave(Condition.cssValue("color", "rgba(221, 0, 0, 1)"));
        //$("[class=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").shouldHave(Condition.exist);
        //$("[class=\"form-block error\"] #loginEmail").parent().$("[class=\"error\"]").shouldHave(Condition.visible);
        //Selenide.webdriver().driver();
        //WebDriverRunner.getWebDriver().findElement(By.cssSelector()).


    }



}
