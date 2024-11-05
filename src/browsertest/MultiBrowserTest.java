package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
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

public class MultiBrowserTest {
 static   String browser = "Chrome";
  static  String baseUrl = "https://courses.ultimateqa.com/";
  static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        //1. Set up Chrome browser.
        WebDriver driver = new ChromeDriver();

        //  2. Open URL.
        driver.get(baseUrl);


        // 3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current URL.
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current url is :" + currenturl);

        // 5. Print the page source.
        System.out.println("The page source is : "+ driver.getPageSource());

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
        driver.navigate().to(baseUrl);

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
