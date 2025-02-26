import org.example.SingletonWebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.Set;

public class WebDriverTest {
    WebDriver webDriver = SingletonWebDriver.getInstance().getWebDriver();
    @Test
    public void getBaiduFromEdgTest(){
//        webDriver.get("https://www.baidu.com");
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        //WebElement element = webDriver.findElement(By.id("kw"));
//        //WebElement element = webDriver.findElement(By.name("wd"));
//        WebElement element = webDriver.findElement(By.className("s_ipt"));
//        element.sendKeys("wuqigen");
//        element = webDriver.findElement(By.id("su"));
//        element.click();
//        webDriver.switchTo().alert();
//        webDriver.switchTo().frame(1);

//        element = webDriver.findElement(By.className("s_ipt"));
//        element = webDriver.findElement(By.name("wd"));
//        element = webDriver.findElement(By.xpath(""));
        Set<String> windowHandles= webDriver.getWindowHandles();
    }
}
