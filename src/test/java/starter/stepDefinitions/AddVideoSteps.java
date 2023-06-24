package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.AddVideo;
import starter.StarEdu.Home;
import starter.StarEdu.Login;

public class AddVideoSteps {
    @Steps
    Login login;
    @Steps
    Home home;
    @Steps
    AddVideo addVideo;

    @Given("I am on the homepage")
    public void IamOnHomePage(){
        home.openUrl("https://staredu-desktop-dev.netlify.app/dashboard");
        login.inputEmail("mentor.satu@gmail.com");
        login.inputPassword("12345678");
        login.ClickLoginButton();
    }
    @When("I click on the subject course section")
    public void ClickSubjectCourse(){
        addVideo.clickSubjectCourse();
    }
    @Then("I am on the course page")
    public void onTheCoursePage(){
        addVideo.validateOnTheCoursePage();
    }
    @And("I click plus icon")
    public void addNewSectionCourse(){
        addVideo.clickPlusIcon();
    }
    @And("I add new section course")
    public void clickPlusIcon(){
        addVideo.clickEditIcon();
        addVideo.fillNameCourseSection("Hukum Newton");
        addVideo.renameCourseSection();
        addVideo.saveRenameCourseSection();
    }
    @And("I add new video section course")
    public void addNewVideoSectionCourse(){
        addVideo.clickEditVideoIcon();
        addVideo.fillNameCourseSection("Video - Hukum Newton");
        addVideo.renameVideoCourseSection();
        addVideo.saveRenameVideoCourseSection();
    }
    @Then("I success add video section course")
    public void SuccessAddVideo(){
        addVideo.validateOnTheCoursePage();
    }
}
