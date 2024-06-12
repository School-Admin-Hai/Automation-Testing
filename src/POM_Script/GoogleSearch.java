package POM_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demo.guru99.com/v4//");

        driver.findElement(By.name("uid")).sendKeys("mngr576077");
        driver.findElement(By.name("password")).sendKeys("unErUtu");
driver.findElement(By.name("btnLogin")).click();

    }
}
