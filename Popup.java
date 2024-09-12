package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.com", "H:\\\\GOKUL\\\\webdrivers\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.tnstc.in/home.html");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"disableButton\"]/td[2]"));
        submit.click();
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        if(txt.contentEquals("'From' place is require.")){
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            System.out.println("popup closed");
        }
        else{
            System.out.println("Invalid");
            Thread.sleep(500);
            driver.close();
        }
    }
    
}
