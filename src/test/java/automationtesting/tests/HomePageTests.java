package automationtesting.tests;

import automationtesting.pages.HomePage;
import automationtesting.utilities.ConfigReader;
import automationtesting.utilities.Driver;
import automationtesting.utilities.JSUtils;

import automationtesting.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class HomePageTests {

  HomePage homePage=new HomePage();

    @Test
      public void Case_1() {
//      1) Open the browser
//      2) Enter the URL “http://practice.automationtesting.in/”
      Driver.getDriver().get(ConfigReader.getProperty("url_test_automationtesting"));

//      3) Click on Shop Menu
      homePage.shopButton.click();

//      4) Now click on Home menu button
      ReusableMethods.waitFor(5);
      homePage.HomeButton.click();
      ReusableMethods.waitFor(5);


//      5) Test whether the Home page has Three Sliders only
      List<WebElement> list=homePage.addToBasketButton;
      System.out.println(list.size());
      Assert.assertEquals(3,list.size());

//      6) The Home page must contains only three sliders

      List<WebElement> pictures=homePage.pictures;

      int totalProductPictures=0;

      for(WebElement w:pictures){

        totalProductPictures++;

      }
      System.out.println(totalProductPictures);
      Assert.assertEquals(3,totalProductPictures);




    }

}
