package prctice2_22;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class SeleniumTest {
    WebDriver webDriver = new EdgeDriver();
    @Test
    public void getAllHeaderLinks(){
        webDriver.get("https://www.epam.com/");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String xpathExpression = "//header//a[contains(text(), 'Lift') or contains(text(), 'Elevator')]";

        // Find all elements matching the XPath
        List<WebElement> headerLinks = webDriver.findElements(By.xpath(xpathExpression) );

        // Print the href attributes of the found links
        for (WebElement link : headerLinks) {
            System.out.println(link.getAttribute("href"));
        }
        List<WebElement> elements = webDriver.findElements(By.xpath("//*[contains(@class,'top-navigation__item-link js-op')]"));
        for(WebElement webElement:elements){
            webElement.click();
        }
    }
}
