import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
    @Test
    public void verifyLoginScenario(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.verifyLogin("admin", "admin123");
    }

    @Test
    public void verifyLoginFailure(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.verifyLogin("shiva", "shiva123");
        Assert.assertEquals("⚠\uFE0F Invalid username or password. Please try again.", "Invalid username or password. Please try again.");

    }



}
