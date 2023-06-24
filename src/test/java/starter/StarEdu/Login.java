package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class Login extends PageObject{
    private By emailField(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/input");
    }
    private By passwordField(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/input");
    }
    private By loginButton(){
        return By.cssSelector("#root > div._container_1eqnf_1 > div._content_1eqnf_18 > div > button");
    }
    // //*[@id="root"]/div[1]/div[2]/div/button/span #root > div._container_1eqnf_1 > div._content_1eqnf_18 > div > button

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }
    @Step
    public void validateOnLoginPage(){
        $(loginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void ClickLoginButton(){
        $(loginButton()).click();
    }

}


