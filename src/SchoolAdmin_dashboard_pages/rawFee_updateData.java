package SchoolAdmin_dashboard_pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class rawFee_updateData {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Entering the login & Password

        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();

        driver.findElement(By.cssSelector("a[href='/feetable']")).click();

        driver.findElement(By.xpath("//a[@href='/feetable/addfee']")).click();


// List of students (dropdown)
        driver.findElement(By.id("studentId")).click();
        WebElement comboBox = driver.findElement(By.cssSelector("[aria-labelledby='studentId-label']"));
        List<WebElement> options = comboBox.findElements(By.xpath("//div[@role = 'option']"));
        options.get(0).click();

//        String email = faker.internet().emailAddress();
//
//        WebElement usernameField1 =driver.findElement(By.id("amount"));
//        usernameField1.sendKeys(email);


        Faker faker = new Faker();
        int randomNum = faker.number().numberBetween(1, 10000);
        String randomAlphabets = faker.lorem().characters(20, true);

        WebElement inputField = driver.findElement(By.id("amount")); // Replace the XPath with the actual one for your input field
        inputField.sendKeys(String.valueOf(randomNum));
        inputField.sendKeys(Keys.ENTER);


        WebElement total = driver.findElement(By.id("total-fee"));
        total.sendKeys(String.valueOf(randomNum));
        total.sendKeys(Keys.ENTER);

        WebElement tutorial = driver.findElement(By.id("tution-fee"));
        tutorial.sendKeys(String.valueOf(randomNum));
        tutorial.sendKeys(Keys.ENTER);


        WebElement discount = driver.findElement(By.id("discount-fee"));
        discount.sendKeys(String.valueOf(randomNum));
        discount.sendKeys(Keys.ENTER);

        WebElement leftout = driver.findElement(By.id("balence-fee"));
        leftout.sendKeys(String.valueOf(randomNum));
        leftout.sendKeys(Keys.ENTER);

        WebElement others = driver.findElement(By.id("other-fee"));
        others.sendKeys(String.valueOf(randomNum));
        others.sendKeys(Keys.ENTER);

        WebElement duedate = driver.findElement(By.id("late-fee"));
        duedate.sendKeys(String.valueOf(randomNum));
        // duedate.sendKeys(Keys.ENTER);

        WebElement comment=driver.findElement(By.id("discription"));
        comment.sendKeys(randomAlphabets);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Add']")).click();

    }
}


