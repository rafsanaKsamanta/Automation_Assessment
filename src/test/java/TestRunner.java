
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class TestRunner extends Setup {
    String baseURL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Test
    public void doLogin(){
        driver.get(baseURL);
        Login_Page loginPage=new Login_Page(driver);
        //Test Data
        loginPage.doLogin("Admin","admin123");



    }





    }