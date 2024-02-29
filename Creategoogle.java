package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class Creategoogle{
    public static void main(String[] args){
        System.setProperty("Webdriver.microsotedge.driver", "H:\\GOKUL\\Testing\\gok\\automation\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        // search term
        //click any serached term
        driver.findElement(By.name("q")).sendKeys("wikipedia"+Keys.ENTER);



        //driver.quit();
        




    }
}