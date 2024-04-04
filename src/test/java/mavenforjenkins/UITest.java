package mavenforjenkins;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UITest {

        @Test
        public void startBrowser(){

            WebDriver driver=new ChromeDriver();

            driver.get("https://opensource-demo.orangehrmlive.com/");
            Assert.assertTrue(driver.getTitle().contains("Orange"));
            driver.manage().window().maximize();



        }


}
