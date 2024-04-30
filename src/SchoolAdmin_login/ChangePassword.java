package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("war@0412");
        driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//*[name()='svg'][@class='tabler-icon tabler-icon-settings'])[1]")).click();
        driver.findElement(By.xpath("//button[@type='button']/div[text()='Change Password']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("war@0412");
        driver.findElement(By.id("newPassword")).sendKeys("hammer@0412");
        driver.findElement(By.id("confirmPassword")).sendKeys("hammer@0412");
        driver.findElement(By.xpath("(//span[contains(text(),'Change Password')])[1]")).click();

    }
}