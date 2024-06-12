package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// User Enter the valid Username & Password

public class login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");

        driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
    }
}

