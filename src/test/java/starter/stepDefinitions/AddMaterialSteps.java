package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.AddMaterial;
import starter.StarEdu.AddVideo;
import starter.StarEdu.Home;
import starter.StarEdu.Login;

public class AddMaterialSteps {
    @Steps
    Login login;
    @Steps
    Home home;
    @Steps
    AddVideo addVideo;
    @Steps
    AddMaterial addMaterial;

    @And("I add new material section course")
    public void addNewVideoSectionCourse() {
        addVideo.clickContentTypeSection();
        addMaterial.selectMaterialType();
        addMaterial.addMaterialSection();
        addMaterial.clickEditMaterialIcon();
        addMaterial.fillMaterialNameCourseSection("Materi Hukum Newton");
        addMaterial.renameMaterialCourseSection();
        addMaterial.saveRenameMaterialCourseSection();
    }
    @Then("I success add material section course")
    public void SuccessCancelRenameVideo(){
        addMaterial.validateOnCoursePage();
        }
    }
