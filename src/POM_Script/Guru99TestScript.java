package POM_Script;

import Objects.Guru99Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Guru99TestScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demo.guru99.com/v4//");
        Thread.sleep(3000);
        Guru99Object loginObjects = new Guru99Object(driver);


        loginObjects.setLoginId("mngr576077");
        loginObjects.sePasswordID("unErUtu");
        Thread.sleep(3000);
        loginObjects.clicklogin();
//        loginObjects.logins.sendKeys("mgr123");
//        loginObjects.pwd.sendKeys("mgr123");
//        loginObjects.buttonLogin.click();
    }
}