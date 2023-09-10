package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage{
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    @FindBy (css = "input[type='email']")
    protected WebElement emailField;
    @FindBy (css = "input[type='password']")
    protected WebElement passwordField;
    @FindBy (css = "button[type='submit']")
    protected WebElement submitButton;


    public LoginPage provideEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage providePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
   public LoginPage clickSubmit() {
        submitButton.click();
        return this;
   }

    public void loginCorrectCred() {
        provideEmail("dominica.dawson@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
    }
}
