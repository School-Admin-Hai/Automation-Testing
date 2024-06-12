package SchoolAdmin_dashboard_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllLinks {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://schooladmin-hai.vercel.app/");
        Thread.sleep(4000);

        //Entering the login & Password

        driver.findElement(By.id("username")).sendKeys("hammer@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hammer@0412");
        driver.findElement(By.cssSelector(".m_811560b9.mantine-Button-label")).click();
        Thread.sleep (4000);

        // Find all the text boxes on the page
        List<WebElement> textBoxes = driver.findElements(By.tagName("a"));

        // Iterate through each text box
        for (WebElement textBox : textBoxes) {
            // Click on the text box
            textBox.click();

            // Verify if the text box is clickable or not
            if (textBox.isEnabled()) {
                System.out.println("Text box " + textBox.getAttribute("id") + " is clickable.");
            } else {
                System.out.println("Text box " + textBox.getAttribute("id") + " is not clickable.");
            }
        }


    }
}
