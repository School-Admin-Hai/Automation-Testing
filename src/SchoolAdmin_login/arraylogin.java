package SchoolAdmin_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraylogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(2000);

        // Define arrays for usernames and passwords
        String[] usernames = {"hammer@gmail.com" };
        String[] passwords = {"hammer@0412"};

        // Loop through the arrays to enter credentials
        for (int i = 0; i < usernames.length; i++) {
            // Enter username
            WebElement usernameField = driver.findElement(By.id("username"));

            usernameField.sendKeys(usernames[i]);

            // Enter password
            WebElement passwordField = driver.findElement(By.id("password"));

            passwordField.sendKeys(passwords[i]);

            // Click login button
            driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//*[name()='svg'][@class='tabler-icon tabler-icon-settings'])[1]")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@type='button']/div[text()='Logout']")).click();

            // Navigate back to login page for next iteration
            //driver.navigate().back();
           // Thread.sleep(2000);
        }

        // Close the browser
        //driver.quit();
    }
}
