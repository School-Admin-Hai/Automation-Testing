package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_terra {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tpdev.neolotex.com/login");
        Thread.sleep(2000);
        driver.findElement(By.id(":r0:")).sendKeys("tops_rd@neolotex.com");
        driver.findElement(By.id(":r1:")).sendKeys("1234");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.quit();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//*[name()='svg'][@class='css-tj5bde-Svg'])[3]")).click();


    }
}
