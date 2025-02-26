package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.lang.model.element.Element;

public class LoginPage {
    // Method to perform login
    public void userLogin(String username, String password) {
        try {
            usernameTxt.sendKeys(username);
            passwordTxt.sendKeys(password);
            loginBtn.click();
        } catch (Exception e) {
            System.err.println("Error during login: " + e.getMessage());
        }
    }

    @FindBy(id = "username")
    private WebElement usernameTxt;
    @FindBy(xpath = "//*[contains(@class,'pssword']")
    private WebElement passwordTxt;
    @FindBy(className = "login-button")
    private WebElement loginBtn;
}
