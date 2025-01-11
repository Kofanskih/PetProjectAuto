package es.thebookshop.ui.tests;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    //test user data
    //browser data
    //main page
    //login method
    public final String USER_EMAIL = "kofanski08@gmail.com";
    public final String USER_PASSWORD = "09876TYUI54321iuyt";
    public final String BOOKSHOP_LOGIN_PAGE = "https://www.thebookshop.es/account";
    public final String BOOKSHOP_MAIN_PAGE = "https://www.thebookshop.es/";

    @BeforeSuite
    void preConditions() {
        Configuration.browserSize = "1980x1080";
        Configuration.browser = "chrome";
        System.out.println("BookShop class precondition");
    }
}
