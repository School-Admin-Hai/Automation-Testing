package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Object {

    public Guru99Object(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy (name = "uid")
public WebElement logins;
    @FindBy(name = "password")

    public WebElement pwd;


    @FindBy(name = "btnLogin")

    public WebElement buttonLogin;

    public Void setLoginId(String userId) {
    logins.sendKeys(userId);

        return null;
    }
    public Void sePasswordID(String pwdId) {
        pwd.sendKeys("pwdId");
        return null;
    }

    public Void clicklogin() {
        buttonLogin.click();
        return null;
    }

}
