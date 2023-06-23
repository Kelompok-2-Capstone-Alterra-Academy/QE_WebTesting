package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.Home;
import starter.StarEdu.Login;

public class AuthenticationSteps {
    @Steps
    Login login;
    @Steps
    Home home;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        login.openUrl("https://staredu-desktop-dev.netlify.app/login");
        login.validateOnLoginPage();
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email) {
        login.inputEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        login.inputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.ClickLoginButton();
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() {
        home.validateOnTheHomePage();
    }

    
}
