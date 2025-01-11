package es.thebookshop.ui.tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookShopEditAccountDetailsTest extends BaseTest{

    @BeforeMethod
    void userBookShopLogin() throws InterruptedException {
        open(BOOKSHOP_LOGIN_PAGE);
        Thread.sleep(500);
        $("[name=\"eml\"]").setValue(USER_EMAIL);
        $("[name=\"pwd\"]").setValue(USER_PASSWORD);
        Thread.sleep(500);
        $("[id=\"login\"]").click();


    }

    @Test
    void bookshopEditAccountDetails() throws InterruptedException {
        $("[href=\"/account/edit\"]").click();
        Thread.sleep(500);
        $("[name=\"billing[name]\"]").setValue("USER_NAME");
        Thread.sleep(500);
        $("[id=\"recaptcha-accessible-status\"]").findElement(By.xpath("https://www.thebookshop.es/logo.jpg"));
        Thread.sleep(500);
        $("id=\"saveaccountdetails\"").click();
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
