package automationtesting.tests;

import automationtesting.pages.HomePage;
import automationtesting.utilities.ConfigurationReader;
import automationtesting.utilities.Driver;


import org.junit.Assert;
import org.testng.annotations.Test;


public class HomePageTests {

  HomePage homePage = new HomePage();

  @Test
  public void Case_1() {
//      1) Open the browser
//      2) Enter the URL “http://practice.automationtesting.in/”
    Driver.getDriver().get(ConfigurationReader.getProperty("url_test_automationtesting"));
    //1) Open the browser
    //2) Enter the URL “http://practice.automationtesting.in/”
  //  Driver.getDriver().get(ConfigurationReader.getProperty("au_url"));

    //3) Click on Shop Menu
//    comautomationtesting.utilities.ReusableMethods.clickWithJS(homePage.shopButton);
//    Driver.getDriver().navigate().refresh();
//    comautomationtesting.utilities.ReusableMethods.waitAndClick(homePage.shopButton,2);

    //4) Now click on Home menu button
    //homePage.homeButton.click();
    Driver.getDriver().navigate().refresh();
    comautomationtesting.utilities.ReusableMethods.waitAndClick(homePage.homeButton, 3);

    //5) Test whether the Home page has Three Sliders only
    //6) The Home page must contain only three sliders
    //int expectedSlidersNumber = 3;
 //   int actualSliderNumber = homePage.threeSlidersOnly.size();
   // Assert.assertEquals(actualSliderNumber, expectedSlidersNumber);

   // Driver.closeDriver();

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