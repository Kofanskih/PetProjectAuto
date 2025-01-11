package com.google.ui.tests;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest {
    public final String GOOGLE_MAIN_PAGE = "https://www.google.com/";


    @BeforeClass

    void preConditions(){
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
    }
    @BeforeMethod
    void preConditionMethod(){
        System.out.println("Premethod");

    }

    @Test
    public  void userCanSearch() throws InterruptedException {
        //Assert.assertEquals(1,2,"Actual result is not equal expected result");


        open(GOOGLE_MAIN_PAGE);
        Thread.sleep(10000);
        $("[name=\"q\"]").setValue("Selenide");
        $("[name=\"btnK\"]").click();
        Thread.sleep(100000000);

    }
}
