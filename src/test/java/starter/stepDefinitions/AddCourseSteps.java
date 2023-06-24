package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.Home;
import starter.StarEdu.Login;

public class AddCourseSteps {
    Login login;
    @Steps
    Home home;

    @Given("I am on the homepage")
    public void IamOnHomePage(){
        home.openUrl("https://staredu-desktop-dev.netlify.app/dashboard");
        login.inputEmail("mentorsatu@gmail.com");
        login.inputPassword("12345678");
        login.ClickLoginButton();
    }

    @When("I click on the Add Course button")
    public void ClickAddCouseSection(){
        home.clickAddCourseSection();
    }

    @And("I Fill in the Course Name field {string}")
    public void FillNameCourse(String NameCourse){
        home.fillNameCourse(NameCourse);
    }

    @And("I fill in the Live Session Schedule field {string}")
    public void FillLiveSessionSchedule(String LiveSessionSchedule){
        home.fillLiveSessionSchedule(LiveSessionSchedule);
    }

    @And("I click tumbnail logo")
    public void ClickTumbnailButton(){
        home.clickTumbnailButton();
    }

    @And("I Choose the thumbnail")
    public void ChooseTumbnailIcon(){
        home.clickTumbnailIcon();
    }

    @And("I Click on the Add Course button")
    public void ClickAddCourseButton(){
        home.clickAddCourse();
    }

    @Then("I success add course")
    public void SuccessAddCourse(){
        home.validateOnTheHomePage();
    }
}
