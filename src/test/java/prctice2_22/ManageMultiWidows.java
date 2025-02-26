package prctice2_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageMultiWidows {
   private static WebDriver webDriver = new EdgeDriver();

    public static void main(String[] args) {
        webDriver.getWindowHandles();
        webDriver.switchTo().window(webDriver.getWindowHandle());
        for(String handle:webDriver.getWindowHandles()){
            webDriver.switchTo().window(handle);
            if(webDriver.getTitle().equals("abd")){
                webDriver.close();
                break;
            }
        }
    }
}
