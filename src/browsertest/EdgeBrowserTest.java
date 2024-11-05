package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *  Project-5- ProjectName: com-utimateqa
 *  BaseUrl = https://courses.ultimateqa.com/
 *  1. Set up Chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current URL.
 *  5. Print the page source.
 *  6. Click on the ‘Sign In’ link
 *  7. Print the current URL
 *  8. Enter the email in the email field.
 *  9. Enter the password in the password field.
 *  10. Click on the Login Button.
 *  11. Navigate to baseUrl.
 *  12. Navigate forward to the Homepage.
 *  13. Navigate back to baseUrl.
 *  14. Refresh the page.
 *  15. Close the browser
 */

public class EdgeBrowserTest {

    public static void main(String[] args) {
        //baseurl
        String baseurl = "https://courses.ultimateqa.com/";

        //1. Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

        //  2. Open URL.
        driver.get(baseurl);


        // 3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current URL.
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current url is :" + currenturl);

        // 5. Print the page source.
        System.out.println("The page source is : " + driver.getPageSource());

        //  6. Click on the ‘Sign In’ link
        driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
        // 7. Print the current URL
        System.out.println("The current url :" + driver.getCurrentUrl());

        //8. Enter the email in the email field.
        driver.findElement(By.id("user[email]")).sendKeys("mytestac20@gmail.com");

        // 9. Enter the password in the password field.
        driver.findElement(By.id("user[password]")).sendKeys("Newtestac20");

        //10. Click on the Login Button.
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

        // 11. Navigate to baseUrl.
        driver.navigate().to(baseurl);

        // 12. Navigate forward to the Homepage.
        driver.navigate().forward();

        //13. Navigate back to baseUrl.(need to check)
        driver.navigate().back();

        //  14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser
        driver.quit();
    }
}
