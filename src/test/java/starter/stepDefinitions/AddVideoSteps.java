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
        addVideo.clickContentTypeSection();
        addVideo.selectVideoType();
        addVideo.clickVideoSection();
        addVideo.clickEditVideoIcon();
        addVideo.fillVideoNameCourseSection("Video Hukum Newton");
        addVideo.renameVideoCourseSection();
        addVideo.saveRenameVideoCourseSection();
    }
    @And("I cancel rename new video section course")
    public void cancelRenameVideoSectionCourse(){
        addVideo.clickVideoSection();
        addVideo.clickEditVideoIcon();
        addVideo.fillVideoNameCourseSection("Video Hukum Gravitasi");
        addVideo.renameVideoCourseSection();
        addVideo.cancelRenameVideoCourseSection();
    }
    @And("I add new description video")
    public void addNewDescriptionVideo(){
        addVideo.clickDescriptionIcon();
        addVideo.fillDescriptionForVideo("Ini merupakan video pembelajaran mengenai hukum newton. Silakan disimak dan diperhatikan baik baik !");
        addVideo.clickSaveDescription();
        addVideo.seeDescriptionVideo();
    }
    @And("I add new video course")
    public void addNewVideoCourse(){
        addVideo.clickAddVideo();
        addVideo.clickAddFolderVideo();
        addVideo.clickAddFileVideo();
        addVideo.clickViewVideo();
    }
    @And("I search for video from the either folder")
    public void addSearchVideoCourse(){
        addVideo.clickAddVideo();
        addVideo.clickSearhField();
        addVideo.fillSeacrhField("React");
        addVideo.clickAddFolderVideo();
        addVideo.clickAddFileVideo();
        addVideo.clickViewVideo();
    }
    @Then("I success add video section course")
    public void SuccessAddVideo(){
        addVideo.validateOnTheCoursePage();
    }
    @Then("I success cancel rename video section course")
    public void SuccessCancelRenameVideo(){
        addVideo.validateOnTheCoursePage();
    }

}
