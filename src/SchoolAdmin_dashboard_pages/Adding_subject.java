package SchoolAdmin_dashboard_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Adding_subject {

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

        //Opening the 'Result' page  then we need to add the 'subjects'

        driver.findElement(By.xpath("//a[@href='/result']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Add New Subject']")).click();

        // Adding a subject information on it
        String[] usernames= {
                "Mathematics", "Physics", "Chemistry", "Biology", "History",};


        for (int i = 0; i < usernames.length; i++) {
            // Enter username
            WebElement usernameField = driver.findElement(By.id("subject-name"));

            usernameField.sendKeys(usernames[i]);
    }
}}
