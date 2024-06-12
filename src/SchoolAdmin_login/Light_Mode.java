package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Light_Mode {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
//Black to white
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@aria-label='Toggle color scheme']) [2] ")).click();
//White to black
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@aria-label='Toggle color scheme']) [2] ")).click();

//Logout script
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//button[@aria-label='Toggle color scheme']) [3] ")).click();
        driver.findElement(By.xpath("//button[@type='button']/div[text()='Logout']")).click();



    }
}
