package Framework;

import com.thoughtworks.selenium.webdriven.commands.Submit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage  {

    static WebDriver driver;

    public LandingPage(WebDriver driver) {// useing a construtor
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   // WebElement UserEmail = driver.findElement(By.id("userEmail"));


    //page factory
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement login;

    @FindBy (css = ".mb-3")
    List <WebElement> product;

    //Using a action class in "login"

    public void loginApplication(String email,String password) {
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        login.click();
    }

//public static void got() {
//
//    driver.get("https://rahulshettyacademy.com/client");
//
//}

    }

