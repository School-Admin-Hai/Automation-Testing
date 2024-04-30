package SchoolAdmin_dashboard_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_array {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(3000);
        String[] fieldIds = {"//a[@href='/student']", "//a[@href='/admission']", "//a[@href='/feetable']"};
        String[] fieldNames = {"Student", "Admission", "Fee",};
        for  (int i = 0; i < fieldIds.length; i++) {
            // Find and interact with the field
            WebElement field = driver.findElement(By.id(fieldIds[i]));

            // Example actions:
            field.click();

    }}

}
