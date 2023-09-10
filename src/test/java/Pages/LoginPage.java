package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage extends BasePage{
    private By submitButton = By.cssSelector("[type='Submit']");
    private By emailField = By.cssSelector("[type='email']");
    private By passwordField = By.cssSelector("[type='password']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void loginCorrectCred() {
        provideEmail("dominica.dawson@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
    }


    public LoginPage provideEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.sendKeys(email);
        return this;
    }

    public LoginPage providePassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
        return this;
    }
   public LoginPage clickSubmit() {
        driver.findElement(submitButton).click();
        return this;
   }
}
