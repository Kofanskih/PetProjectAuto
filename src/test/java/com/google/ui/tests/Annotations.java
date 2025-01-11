package com.google.ui.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Annotations {
    /*
    * BeforeSuite Будет выполнен перед запуском первого тестового метода в текущем наборе тестов, определённом в теге <suite>
    * BeforeTest Запустится перед выполнением первого тестового метода в текущем тесте, определённом тегом <test>
    * BeforeClass Будет запущен перед выполнением первого теста в текущем классе тегов
    * BeforeGroups Запускается перед указанной группой тестов
    * BeforeMethod Будет запущен перед каждым тестом (методе) в этом классе
    * Test Это самая важная аннотация в TestNG, в которой находится основная логика теста. Все автоматизируемые функции находятся в методе с аннотацией @Test.
    * AfterMethod Будет запущен после каждого теста (метода) в этом классе
    * AfterGroups Запускается после выполнения всех методов в указанной группе
    * AfterClass Будет выполнен после завершения всех тестов в текущем классе
    * AfterTest Запустится после завершения всех тестов в текущем тесте, определённым тегом <test>
    * AfterSuite Будет выполнен после завершения всех тестовых методов в текущем наборе тестов, определённом в теге <suite>
    */

    @BeforeSuite
    void preConditionSuit(){
        System.out.println("Run Suit Preconditions");

    }

    @BeforeTest
    void preConditionTest(){
        System.out.println("Run Test Preconditions");

    }

    @BeforeGroups
    void preConditionGroups(){
        System.out.println("Run Groups Preconditions");

    }

    @BeforeClass
    void preConditions(){
        System.out.println("Run Class Preconditions");

    }
    @BeforeMethod
    void preConditionMethod(){
        System.out.println("Run Method Preconditions");

    }

    @Test // почему нужно перед каждым методом ставить @Test чтоб он выполнился?
    public void test1() {
        System.out.println("Test1");

    }


    @AfterMethod
    void postConditionMethod(){
        System.out.println("Run Method Postconditions");
        System.out.println();

    }

    @AfterClass
    void postConditions(){
        System.out.println("Run Class Postconditions");

    }

    @AfterGroups
    void postConditionGroups(){
        System.out.println("Run Groups Postconditions");

    }

    @AfterTest
    void postConditionTest(){
        System.out.println("Run Test Postconditions");

    }

    @AfterSuite
    void postConditionSuit(){
        System.out.println("Run Suit Postconditions");

    }
}
