package SchoolAdmin_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Createaccount {
    public  static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/auth/signup");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("prasann@gmail.com");
        driver.findElement(By.id("username")).sendKeys("anupa@gmail.com");
        driver.findElement(By.id("name")).sendKeys("anu");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmpassword")).sendKeys("123456");
        driver.findElement(By.id("mobilenumber")).sendKeys("1234567890");
        driver.findElement(By.id("role")).click();
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.findElement(By.xpath("(//span[@class='m_811560b9 mantine-Button-label'])[1]")).click();

//        WebElement down=driver.findElement(By.id("role"));
//        Select dropdown = new Select(down);
//        dropdown.selectByVisibleText("Admin");
//        dropdown.getFirstSelectedOption();
    }}

