package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","H:\\GOKUL\\webdrivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practice.expandtesting.com/radio-buttons#google_vignette");
        //WebElement get = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]"));
        List <WebElement> choose =driver.findElements(By.name("sport"));
        int count= choose.size();
        System.out.println(count);
        for(int i=0; i < count;i++){
            String txt = choose.get(i).getText();
            System.out.println(txt);
            choose.get(i).click();
            Thread.sleep(1000);
        }

        
    }
}
