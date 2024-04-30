package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@tabindex='4']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='me@schooladmin.in']")).sendKeys("hammer@gmail.com");

        //once we entered the data "Reset is not working"
        //Below line for reset password button

        driver.findElement(By.xpath("//span[@class='m_811560b9 mantine-Button-label']")).click();

    }

}
