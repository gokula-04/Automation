package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.dri","H:\\\\GOKUL\\\\Testing\\\\gok\\\\automation\\\\lib\\\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://chromewebstore.google.com/");

        driver.findElement(By.id("i3")).sendKeys("Volume Controler");
    }
}
