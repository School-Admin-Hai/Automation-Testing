package schoolAdmin2.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class schoolLogin {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.xpath("//button[@tabindex='3']")).click();


        //Adding Fees
        driver.findElement(By.xpath("//img[@alt='Fee Data icon']")).click();
        driver.findElement(By.xpath("//a[@href='/feetable/addfee']")).click();

        // List of students (dropdown)
        driver.findElement(By.id("studentId")).click();
        WebElement comboBox =  driver.findElement(By.cssSelector("[aria-labelledby='studentId-label']"));
        List<WebElement> options = comboBox.findElements(By.xpath("//div[@role = 'option']"));
        options.get(0).click();


        driver.findElement(By.id("AcademicYear")).click();
        WebElement acadmic =  driver.findElement(By.cssSelector("[aria-labelledby='AcademicYear-label']"));
        Thread.sleep(3000);
        List<WebElement> optionss = acadmic.findElements(By.xpath("//div[@role='option']"));

        optionss.get(0).click();




//        driver.findElement(By.id("amount")).sendKeys("2000");
//        driver.findElement(By.id("total-fee")).sendKeys("45000");
//        driver.findElement(By.id("tution-fee")).sendKeys("200");
//        driver.findElement(By.id("discount-fee")).sendKeys("10");
//        driver.findElement(By.id("balence-fee")).sendKeys("43333");
//        driver.findElement(By.id("other-fee")).sendKeys("333");
//        driver.findElement(By.id("late-fee")).sendKeys("23456");
//        driver.findElement(By.id("discription")).sendKeys("hammer war");
//
//        driver.findElement(By.xpath("//span[text()='Add']")).click();

    }
}