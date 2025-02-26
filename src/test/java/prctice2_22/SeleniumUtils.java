package prctice2_22;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.headlessexperimental.model.ScreenshotParams;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class SeleniumUtils {
    public void getScreenShot(WebDriver webDriver) throws IOException {
        File screenShot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots/screenshot.png");
        FileUtils.copyFile(screenShot,destination);

    }

    public static void main(String[] args) {
        WebDriver webDriver = new EdgeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

        FluentWait<WebDriver> webDriverFluentWait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(4)
                ).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        webDriverFluentWait.until(webDriver1 -> webDriver.findElement(By.id("")));

        //handle cookies
        Cookie cookie = new Cookie("myCookie","CookieValue");
        webDriver.manage().getCookies();
        webDriver.manage().addCookie(cookie);
        webDriver.manage().deleteAllCookies();
        webDriver.manage().deleteCookieNamed("myCookie");

        for(String handle:webDriver.getWindowHandles()){
            webDriver.switchTo().window(handle);
            if(webDriver.getTitle().equals("name of c"));
            webDriver.quit();
            break;
        }

        List<WebElement> dropDownElements = webDriver.findElements(By.id("dropDownId"));
        for(WebElement element:dropDownElements){
            if(element.getText().equals("testWeNeed")){
                element.click();
                break;
            }
        }





    }
}
