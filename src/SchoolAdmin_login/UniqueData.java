package SchoolAdmin_login;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class UniqueData {
    static Faker faker = new Faker();

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(2000);



        String email = faker.internet().emailAddress();
        String password = faker.internet().password(6,10);

        WebElement usernameField1 = driver.findElement(By.id("username"));
        usernameField1.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("password"));

        passwordField.sendKeys(password);
        // Loop through the arrays to enter credentials
//        for (int i = 0; i < usernames.length; i++) {
//            // Enter username
//            WebElement usernameField = driver.findElement(By.id("username"));
//
//            usernameField.sendKeys(usernames[i]);
//
//            // Enter password
//
//
//        }

        }
}