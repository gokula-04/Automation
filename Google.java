package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","H:\\GOKUL\\webdrivers\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe"); // Point to Canary's chrome.exe
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");  
        driver.findElement(By.linkText("Images")).click();;
        //driver.wait(1000);
        driver.navigate().back();
        //driver.navigate().forward();
        //driver.wait(2000);

    }
}
