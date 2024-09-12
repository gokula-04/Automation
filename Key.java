package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class Key {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","H:\\\\GOKUL\\\\webdrivers\\\\chromedriver-win64\\\\chromedriver.exe");
            ChromeOptions options =  new ChromeOptions();
            options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Actions act = new Actions(driver);
        WebElement unm = driver.findElement(By.id("username"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement log = driver.findElement(By.id("submit"));
        //act.moveToElement(unm).sendKeys("gokul").perform();;
        act.click(unm).sendKeys("gokul").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
        act.click(pass).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        act.click(log);
        

    }
}
