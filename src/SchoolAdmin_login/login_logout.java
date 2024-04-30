package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_logout {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("anupa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
        Thread.sleep(5000);

         driver.findElement(By.xpath("(//*[name()='svg'][@class='tabler-icon tabler-icon-settings'])[1]")).click();
driver.findElement(By.xpath("//button[@type='button']/div[text()='Logout']")).click();

    }
}

