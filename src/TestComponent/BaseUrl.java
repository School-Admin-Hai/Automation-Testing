package TestComponent;

import Framework.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseUrl {

    public  WebDriver driver;

    public WebDriver initialDriver() throws IOException {

        //SETUP GLOBAL PROPERTY TO // CROME-FIRREFOX-EDGE

        Properties pro = new Properties();
        FileInputStream fls = new FileInputStream("C:\\Users\\prasanna.a\\IdeaProjects\\WarHammer\\src\\Resources");
        pro.load(fls);
        String browserName = pro.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
            WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//    } else if (browserName.equalsIgnoreCase("edge")) {
//
//            System.setProperty("pase the path");
//            WebDriver driver = new EdgeDriver();
//        }
//        driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        return null;
        }

        //public void lauchApplication() throws IOException {
        driver = initialDriver();
        LandingPage page = new LandingPage(driver);
        //  }
        //

        return null;
    }}