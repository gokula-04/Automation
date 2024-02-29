package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","H:\\GOKUL\\Testing\\gok\\automation\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/lp/web-automation-tools?utm_source=google&utm_medium=cpc&utm_campaign=LambdaTest_Search_Generic_Automation_Testing_India_N&utm_term=automation%20testing%20websites&utm_id=20624956738&utm_content=WebsiteAutomation-Phrase&gad_source=1&gclid=CjwKCAiA_tuuBhAUEiwAvxkgTp9NCQXaLRzC2wTyQlu_w0Mqi0NS9fFlaJmxpd9L2ojBNBAmX1O8nhoCtDIQAvD_BwE");
        //driver.findElement(By.linkText("Know More")).click();
        


    }
    
}
