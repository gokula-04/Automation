package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazoon {
    public static void main(String[] args) {
        System.out.println("Amazon ordere automation");
        System.setProperty("webdriver.chrome.driver", "H:\\GOKUL\\webdrivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver  = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        WebElement get = driver.findElement(By.id("twotabsearchtextbox"));
        get.sendKeys("pixels phone");
        WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
        submit.click();
        WebElement filter = driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i"));
        filter.click();        
    }
}
