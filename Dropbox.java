package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","H:\\GOKUL\\webdrivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        //WebElement drop =driver.findElement(By.xpath("/*[@id='post-2646']/div[2]/div/div/div/p/select"));
        //WebElement drop = driver.findElement(By.name("Afghanistan"));
        WebElement drop = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
        //drop.click();
        Select o1 = new Select(drop);
        //o1.selectByIndex(0);
        o1.selectByVisibleText("Belarus");
        //System.out.println(drop.getText());
        System.out.println(drop.getAttribute("value"));
    }
}
