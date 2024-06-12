package SchoolAdmin_dashboard_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAdmission {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(4000);

        //Entering the login & Password

        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@href='/admission']")).click();
        Thread.sleep(4000);

        //Here we are opening the Admission page for student
       driver.findElement(By.xpath("//a[@href='/admission/addadmission']")).click();

        //Adding the admission details

        Thread.sleep(4000);

        driver.findElement(By.id("aadhar-no.")).sendKeys("123409876512");
        driver.findElement(By.id("roll-no.")).sendKeys("50");
        driver.findElement(By.id("first-name")).sendKeys("Prasanna");
        driver.findElement(By.id("last-name")).sendKeys("Ambiger");
        Thread.sleep(4000);

        //For the Dynamic dropdown written the step
        driver.findElement(By.id("classandDivision-label")).click();
        driver.findElement(By.xpath("//span[text()='Class Play - ']")).click();


        Thread.sleep(4000);
        driver.findElement(By.id("father-name")).sendKeys("Father ji");
       // driver.findElement(By.id("father-occupation")).sendKeys("Goverment Employee");
        // driver.findElement(By.id("mother-name")).sendKeys("Mother ji");
        //  driver.findElement(By.id("email")).sendKeys("prasanna@gmail.com");
        //   driver.findElement(By.id("father-mobile-no.")).sendKeys("9110697900");
        //  driver.findElement(By.id("address")).sendKeys("ZP office kanakdas badavani");
        //   driver.findElement(By.id("pin-code-error")).sendKeys("586101");

        //For the calender
        //   WebElement date = driver.findElement(By.id("mantine-hbryai6n4"));
        //    date.sendKeys("02/05/2024");
        //   date.click();

        //For Radion Button
        //  WebElement option1 = driver.findElement(By.id("mantine-00th7tett"));
        //   WebElement option2 = driver.findElement(By.id("mantine-cny0oyu75"));
        //   WebElement option3 = driver.findElement(By.id("mantine-ab8m2dpbt"));
        //   option1.click();








    }
}
