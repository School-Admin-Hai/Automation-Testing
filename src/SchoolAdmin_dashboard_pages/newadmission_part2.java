package SchoolAdmin_dashboard_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.concurrent.TimeUnit;

public class newadmission_part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://schooladmin-hai.vercel.app/");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //Entering the login & Password

        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.xpath("//a[@href='/admission']")).click();


        //Here we are opening the Admission page for student
        driver.findElement(By.xpath("//a[@href='/admission/addadmission']")).click();

        //Adding the admission details



        driver.findElement(By.id("aadhar-no.")).sendKeys("123409876512");
        driver.findElement(By.id("roll-no.")).sendKeys("50");
        driver.findElement(By.id("first-name")).sendKeys("Prasanna");
        driver.findElement(By.id("last-name")).sendKeys("Ambiger");


        driver.findElement(By.xpath("//input[@placeholder='Class']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Class Nursery')]")).click();

        //driver.findElement(By.id("classandDivision-label")).click();
        //driver.findElement(By.xpath("//span[text()='Class L.K.G - ']")).click();

       //driver.findElement(By.id("father-name")).sendKeys("ssss");
     //   driver.findElement(By.id("father-occupation")).sendKeys("Private");
     //   driver.findElement(By.id("email")).sendKeys("godsniper");
     //   driver.findElement(By.id("father-mobile-no.")).sendKeys("9110697999");
     //   driver.findElement(By.id("address")).sendKeys("ZP OFFICE");
     //   driver.findElement(By.id("pin-code")).sendKeys("586101");

     //   WebElement datapick = driver.findElement(By.id("//input[@placeholder='Date of Birth']"));
    //   String dateValue = "04/05/2024";
     //   datapick.sendKeys(dateValue);


       // String enteredDate = datapick.getAttribute("value");
     //   if (enteredDate.equals(dateValue)) {
         //   System.out.println("Date entered successfully.");
     //   } else {
          //  System.out.println("Error: Date not entered correctly.");
     //   }



    }
}
