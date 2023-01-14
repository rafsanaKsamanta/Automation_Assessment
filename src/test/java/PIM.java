import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIM {
    private WebDriver driver;
    public PIM(WebDriver driver){
        PageFactory.initElements(driver, this);
        driver=driver;
    }

    public void CreateUser() throws InterruptedException {

        List<WebElement> menus = driver.findElements(By.className("oxd-main-menu-item--name"));
        menus.get(1).click();

        List<WebElement> add_btn = driver.findElements(By.className("oxd-button"));
        add_btn.get(2).click();

        Thread.sleep(2000);

        List<WebElement> input = driver.findElements(By.className("oxd-input"));
        input.get(1).sendKeys("Rafsana");
        input.get(2).sendKeys("Kabir");
        input.get(3).sendKeys("Samanta");

        Thread.sleep(2000);

        List<WebElement> radio_btn = driver.findElements(By.className("oxd-switch-wrapper"));
        radio_btn.get(0).click();

        List<WebElement> input_ext = driver.findElements(By.className("oxd-input"));
        input.get(5).sendKeys("Samanta");
        input.get(6).sendKeys("Samanta@123");
        input.get(7).sendKeys("Samanta@123");

        List<WebElement> submit = driver.findElements(By.className("oxd-button"));
        submit.get(1).click();

    }
}
