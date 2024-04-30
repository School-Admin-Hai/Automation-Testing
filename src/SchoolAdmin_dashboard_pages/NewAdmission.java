package SchoolAdmin_dashboard_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAdmission {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/admission']']")).click();
        driver.findElement(By.xpath("//a[@href='/admission/addadmission']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("aadhar-no.")).sendKeys("111222333444");
        driver.findElement(By.id("roll-no.")).sendKeys("21");
        driver.findElement(By.id("first-name")).sendKeys("Prasanna");
        driver.findElement(By.id("last-name")).sendKeys("Ambiger");
    }
}
