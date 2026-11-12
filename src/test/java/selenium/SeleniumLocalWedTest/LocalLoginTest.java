
package selenium.SeleniumLocalWedTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LocalLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        URL resource = getClass().getClassLoader()
            .getResource("webpage/login.html");

        if (resource == null) {
            throw new IllegalStateException(
                "Cannot find webpage/login.html");
        }

        driver.get(resource.toString());
    }

    @Test
    public void validLoginTest() {

        driver.findElement(By.id("username"))
              .sendKeys("student");

        driver.findElement(By.id("password"))
              .sendKeys("12345");

        driver.findElement(By.id("loginButton")).click();

        String message =
            driver.findElement(By.id("message")).getText();

        Assert.assertEquals(message, "Login Successful");
    }

    @Test
    public void invalidLoginTest() {

        driver.findElement(By.id("username"))
              .sendKeys("wrong");

        driver.findElement(By.id("password"))
              .sendKeys("wrong");

        driver.findElement(By.id("loginButton")).click();

        String message =
            driver.findElement(By.id("message")).getText();

        Assert.assertEquals(
            message, "Invalid Username or Password");
    }

    @Test
    public void checkBackgroundColor() {

        String color =
            driver.findElement(By.id("loginBox"))
                  .getCssValue("background-color");

        Assert.assertEquals(
            color, "rgba(173, 216, 230, 1)");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
