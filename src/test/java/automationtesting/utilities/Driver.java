package automationtesting.utilities;

import automationtesting.utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Driver {
    //    Driver.getDriver(); -> driver
    private static WebDriver driver;
    //    getDriver() is used to instantiate the driver object
    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
            }
//            NOTE: sel 4.5
//            driver = WebDriverManager.chromedriver().create();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
    //    closeDriver() is used to close the driver

//}
//    public static void closeDriver() {
//        if (driver != null) {//if the driver is pointing chrome
//            driver.quit();//quit the driver
//            driver = null;//set it back to null to make sure driver is null
//            // so I can initialize it again
//            //This is important especially you do cross browser testing(testing with
//            // multiple browser like chrome, firefox, ie etc.)
//        }
//    }
//
//    public static void waitAndClick(WebElement element, int timeout) {
//        for (int i = 0; i < timeout; i++) {
//            try {
//                element.click();
//                return;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//    }
//
//    public static void waitAndClick(WebElement element) {
//        for (int i = 0; i < timeout; i++) {
//            try {
//                element.click();
//                return;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//    }
//
//    public static void waitAndSendText(WebElement element, String text, int timeout) {
//        for (int i = 0; i < timeout; i++) {
//            try {
//                element.sendKeys(text);
//                return;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//    }
//
//    //    Driver.waitANdSendText(Element , "TEXT");
//    public static void waitAndSendText(WebElement element, String text) {
//        for (int i = 0; i < timeout; i++) {
//            try {
//                element.sendKeys(text);
//                return;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//    }
//
//    public static void waitAndSendTextWithDefaultTime(WebElement element, String text) {
//        for (int i = 0; i < timeout; i++) {
//            try {
//                element.sendKeys(text);
//                return;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//    }
//
//    public static String waitAndGetText(WebElement element, int timeout) {
//        String text = "";
//        for (int i = 0; i < timeout; i++) {
//            try {
//                text = element.getText();
//                return text;
//            } catch (WebDriverException e) {
//                wait(1);
//            }
//        }
//        return null;
//    }
//
//    //Webdriver
//    //ChromeDriver
//    //Iedriver
//    //FirefoxDriver
//    public static void wait2(int sec) {
//        try {
//            Thread.sleep(1000 * sec);
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } catch (StaleElementReferenceException e) {
//            e.printStackTrace();
//        } catch (ElementClickInterceptedException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //5 seconds
//    public static void waitAndClickElement(WebElement element, int seconds) {
//        for (int i = 0; i < seconds; i++) {
//            try {
//                element.click();
//                break;
//            } catch (Exception e) {
//                wait2(1);
//            }
//        }
//    }
//
//    public static void wait(int secs) {
//        try {
//            Thread.sleep(1000 * secs);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//        } catch (StaleElementReferenceException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public static WebElement waitForVisibility(By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
//    public static Boolean waitForInVisibility(By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
//    }
//
//    public static WebElement waitForClickablility(WebElement element, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public static WebElement waitForClickablility(By locator, int timeout) {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//        return wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }
//
//    public static void waitForPageToLoad(long timeOutInSeconds) {
//        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver driver) {
//                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
//            }
//        };
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
//            wait.until(expectation);
//        } catch (Exception error) {
//            error.printStackTrace();
//        }
//    }
//
//    public static void executeJScommand(WebElement element, String command) {
//        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//        jse.executeScript(command, element);
//    }
//
//    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
//        wait(5);
//        Select select = new Select(item);
//        for (int i = 0; i < select.getOptions().size(); i++) {
//            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
//                select.getOptions().get(i).click();
//                break;
//            }
//        }
//    }
//
//    /**
//     * Clicks on an element using JavaScript
//     *
//     * @param element
//     */
//    public static void clickWithJS(WebElement element) {
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
//    }
//
//    /**
//     * Clicks on an element using JavaScript
//     *
//     * @param elements
//     */
//    public static void clickWithJSAsList(List<WebElement> elements) {
//        for (WebElement each : elements) {
//            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", waitForVisibility(each, 5));
//            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", each);
//        }
//    }
//
//    /**
//     * Performs double click action on an element
//     *
//     * @param element
//     */
//    public static void doubleClick(WebElement element) {
//        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
//    }
//
//    //    Parameter1 : WebElement
////    Parameter2:  String
////    Driver.selectByVisibleText(dropdown element, "CHECKING-91303-116.98$")
//    public static void selectByVisibleText(WebElement element, String text) {
//        Select objSelect = new Select(element);
//        objSelect.selectByVisibleText(text);
//    }
//
//    //    Parameter1 : WebElement
////    Parameter2:  int
////    Driver.selectByIndex(dropdown element, 1)
//    public static void selectByIndex(WebElement element, int index) {
//        Select objSelect = new Select(element);
//        objSelect.selectByIndex(index);
//    }
//
//    //    Parameter1 : WebElement
////    Parameter2:  String
////    Driver.selectByIndex(dropdown element, "91303")
//    public static void selectByValue(WebElement element, String value) {
//        Select objSelect = new Select(element);
//        List<WebElement> elementCount = objSelect.getOptions();
//        objSelect.selectByValue(value);
//        System.out.println("number of elements: " + elementCount.size());
//    }
//
//    public static void sleep(int timeOut) {
//        try {
//            Thread.sleep(timeOut);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void waitAndClickLocationText(WebElement element, String value) {
//        Driver.getDriver().findElement(By.xpath("//*[text()='" + value + "']")).click();
//    }







}
