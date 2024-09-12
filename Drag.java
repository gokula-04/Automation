package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver.","H:\\\\\\\\GOKUL\\\\\\\\webdrivers\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        Actions act = new Actions(driver);
        WebElement loc = driver.findElement(By.id("Accepted Elements"));
        loc.click();
        //driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div"));
        driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);
        //Actions act = new Actions(driver);
        //WebElement src = driver.findElement(By.id("draggable"));
        //WebElement tar = driver.findElement(By.id("droppable"));
        WebElement src = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement tar = driver.findElement(By.xpath("/html/body/div[3]"));
        //WebElement src = driver.findElement(By.name("Drag me to my target"));
        //WebElement tar = driver.findElement(By.name("accept: '#draggable'"));
        act.dragAndDrop(src, tar).perform();
    }
}
