import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class SelectWindows {
    WebDriver webDriver = new EdgeDriver();
    public void getWindows(){
        for(String handle:webDriver.getWindowHandles()){
            webDriver.switchTo().window(handle);
            if(webDriver.getTitle().equals("name of window c")){
                webDriver.close();
                break;
            }
        }
    }
}
