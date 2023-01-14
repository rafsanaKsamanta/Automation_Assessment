import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestRunner extends Setup {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    String userName = "Admin";
    String password = "admin123";

    @Test(priority = 1)
    public void Login(){
        driver.get(baseUrl);
        Login_Page page = new Login_Page(driver);
        page.Dologin(userName,password);
    }

    @Test(priority = 2)
    public void CreateUser() throws InterruptedException{
        driver.get(baseUrl);
        PIM page = new PIM(driver);
        page.CreateUser();
    }
}
