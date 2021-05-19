package RegisterFunctionality;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register {

    WebDriver driver;

    @Before
    public void navigateUserToGoogleChrome() {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void verifyUserAbleToCompleteRegistrationSuccessfully() {

        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.xpath("//span[@class='male']/input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Dipak");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        driver.findElement(By.xpath("//option[text()='9']")).click();
        driver.findElement(By.xpath("//option[text()='August']")).click();
        driver.findElement(By.xpath("//option[text()='1986']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("d1ak@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("DNP Ltd");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("a1234567");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("a1234567");
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

    }

    @After

    public void tearDown () {

        driver.quit();
    }
}
