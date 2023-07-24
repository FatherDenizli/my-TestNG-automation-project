package automationtesting.pages;

import automationtesting.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


   @FindBy(id ="menu-item-40" )
    public WebElement shopButton;


    @FindBy(xpath ="//*[@id=\"content\"]/nav/a" )
    public WebElement HomeButton;
    //*[@id="content"]/nav/a
    @FindBy(xpath ="//*[text()='Add to basket']" )
    public List<WebElement> addToBasketButton;


    @FindBy(xpath ="//img[@loading='lazy']" )
    public List<WebElement> pictures;



}
