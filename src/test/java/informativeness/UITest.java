package informativeness;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

        @Test
        public void startBrowser(){
           WebDriverManager.chromedriver().setup();
           System.setProperty("webdriver.chrome.driver","C:\\chromedriver123\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            driver.get("https://opensource-demo.orangehrmlive.com/");

            Assert.assertTrue(driver.getTitle().contains("Orange"));




        }


}
