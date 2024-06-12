package Project;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class login_terra {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tpdev.neolotex.com/login");


        //Login
        driver.findElement(By.id(":r0:")).sendKeys("tops_rd@neolotex.com");
        driver.findElement(By.id(":r1:")).sendKeys("1234");
        driver.findElement(By.cssSelector("button[type='submit']")).click();


        //Adding a Partner pop up
        driver.findElement(By.xpath("(//button[normalize-space()='Add Partner'])[1]")).click();

        //Partner Name
        driver.findElement(By.xpath("//input[@name='partnerName']")).sendKeys("ABCDE");

        // Partner Type
        driver.findElement(By.xpath("//div[@placeholder='Partner Type *']//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeNormal MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-1cc082s']")).click();
        WebElement comboBox =  driver.findElement(By.cssSelector("[aria-labelledby=':r18:-label']"));// list of elements
        List<WebElement> options = comboBox.findElements(By.xpath("//li[@role = 'option']"));
        options.get(1).click();

        // Country Incorporation
        driver.findElement(By.xpath("//input[@id=':r1a:']")).click();
        WebElement comboBoxx =  driver.findElement(By.cssSelector("[aria-labelledby=':r1a:-label']"));// list of elements
        List<WebElement> optionss = comboBoxx.findElements(By.xpath("//li[@role = 'option']"));
        optionss.get(1).click();

        //Instrument Type
        driver.findElement(By.xpath("(//fieldset[@class='MuiOutlinedInput-notchedOutline css-igs3ac']) [7]")).click();
        //WebElement type =  driver.findElement(By.cssSelector("[aria-labelledby=':r1a:-label']"));// list of elements
      //  List<WebElement> ops = type.findElements(By.xpath("//li[@role = 'option']"));
      //  optionss.get(1).click();
        }
    }



