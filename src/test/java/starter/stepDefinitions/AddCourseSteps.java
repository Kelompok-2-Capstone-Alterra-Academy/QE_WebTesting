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
    private String liveSessionSchedule;

    @When("I click on the Add Course session")
    public void ClickAddCouseSection(){
        home.clickAddCourseSection();
    }

    @And("I fill in the Course Name field {string}")
    public void FillNameCourse(String NameCourse){
        home.fillNameCourse(NameCourse);
    }

    @And("I fill in the Live Session Schedule field {string}")
    public void FillLiveSessionSchedule(String LiveSessionSchedule){
        liveSessionSchedule = LiveSessionSchedule;
        home.fillLiveSessionSchedule(LiveSessionSchedule);
    }

    @And("I click tumbnail logo")
    public void ClickTumbnailButton(){
        home.clickTumbnailButton();
    }

    @And("I choose the thumbnail")
    public void ChooseTumbnailIcon(){
        home.clickTumbnailIcon();
    }

    @And("I click on the Add Course button")
    public void ClickAddCourseButton(){
        home.clickAddCourse();
    }

    @And("I click on the cancel button")
    public void  clickCancelButton() { home.clickCancel();}

    @Then("I success add course")
    public void SuccessAddCourse(){
        home.validateOnTheHomePage();
    }
}
