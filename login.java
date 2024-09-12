package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","H:\\\\GOKUL\\\\webdrivers\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\\\Users\\\\ASUS\\\\Downloads\\\\chrome-win64\\\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("gokul");
        driver.findElement(By.id("password")).sendKeys("passw");
        //driver.findElement(By.id("submit")).submit();;
        driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).submit();


    }
}
