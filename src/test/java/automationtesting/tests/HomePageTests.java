package automationtesting.tests;

import automationtesting.pages.HomePage;
import automationtesting.utilities.ConfigReader;
import automationtesting.utilities.Driver;
import automationtesting.utilities.JSUtils;

import automationtesting.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HomePageTests {

  HomePage homePage = new HomePage();

  @Test
  public void Case_1() {
//      1) Open the browser
//      2) Enter the URL “http://practice.automationtesting.in/”
    Driver.getDriver().get(ConfigReader.getProperty("url_test_automationtesting"));


//
////      3) Click on Shop Menu
//    // ReusableMethods.waitFor(2);
//
//        homePage.shopButton.click();
//
//
////      4) Now click on Home menu button
//      ReusableMethods.waitFor(5);
//    //  Driver.getDriver().navigate().refresh();
////      WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)) ;
////      WebElement  homeButton=wait.until(ExpectedConditions.visibilityOf(homePage.homeButton));
//      ReusableMethods.waitFor(15);
//
//      ReusableMethods.waitForClickablility(homePage.homeButton,60);
//      JSUtils.clickElementByJS(homePage.homeButton);
//
//
//
//      ReusableMethods.waitFor(10);
//
//
//
//
////      5) Test whether the Home page has Three Sliders only
//      List<WebElement> list=homePage.addToBasketButton;
//      System.out.println(list.size());
//      Assert.assertEquals(3,list.size());
//
//
//
////      6) The Home page must contains only three sliders
//
//      List<WebElement> pictures=homePage.pictures;
//
//      int totalProductPictures=0;
//
//      for(WebElement w:pictures){
//
//        totalProductPictures++;
//
//      }
//      System.out.println(totalProductPictures);
//      Assert.assertEquals(3,totalProductPictures);
//
//
//
//
//    }
//

  }
}