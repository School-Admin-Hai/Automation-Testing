package Framework;

import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class frame2 {
    public static void main(String[] args) throws InterruptedException {
        String productName = "ZARA COAT 3";
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/client");
        LandingPage page = new LandingPage(driver);

        driver.findElement(By.id("userEmail")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("King@1234");
        driver.findElement(By.id("login")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
        //Get all product list --->using for all component visible
        List<WebElement> product = driver.findElements(By.cssSelector(".mb-3"));
        WebElement prod = product.stream().filter(pro -> pro.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);

        //Add to cart
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        ///////////////////////// Above code video number 151,152,153//////////////////

        /////Below code is 154 video & explained about page loader//////

//Add card message green color
        WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(15));
        waitr.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

// Loader icon xpath //ng-animating
        waitr.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-animating")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body//app-root//app-sidebar//li[4]")).click();

//155 video-validation check- cart

        List<WebElement> carts = driver.findElements(By.cssSelector(".cartSection h3")); //grabing a titile .cartSection h3  inspecting on label using partnert & child
        boolean match = carts.stream().anyMatch(cart -> cart.getText().equalsIgnoreCase(productName));
        Assert.assertTrue(match);
        driver.findElement(By.cssSelector(".totalRow button")).click();

//156 video wrapping up end to end automating


        Actions a = new Actions(driver);
        a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='ta-results list-group ng-star-inserted']")));
        driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector(".action__submit")).click();

//Putting a assertion
        String message = driver.findElement(By.cssSelector("hero-primary")).getText();
        Assert.assertTrue(message.equalsIgnoreCase("THANKYOU FOR THE ORDER."));


    }
}