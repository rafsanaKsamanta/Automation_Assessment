import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login_Page {
    @FindBy(className = "oxd-input")
    List<WebElement> txtCreds;

    @FindBy(css = "[type=submit")
    WebElement btnsubmit;

    public Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Dologin(String username, String password) {
        txtCreds.get(0).sendKeys(username);
        txtCreds.get(1).sendKeys(password);
        btnsubmit.click();
    }
}
