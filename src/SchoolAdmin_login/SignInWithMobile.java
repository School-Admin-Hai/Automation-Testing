package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInWithMobile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@tabindex='5']")).click();
          }
}
