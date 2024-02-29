package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "H:\\\\GOKUL\\\\Testing\\\\gok\\\\automation\\\\lib\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");


        driver.findElement(By.xpath("//*[@id='text2']")).sendKeys("gokul");
    }
}
