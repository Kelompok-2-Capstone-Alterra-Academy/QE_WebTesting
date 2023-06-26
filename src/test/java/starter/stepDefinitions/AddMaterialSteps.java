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
    AddVideo addVideo;

    @Steps
    AddMaterial addMaterial;

    @And("I cancel rename new material section course")
    public void CancelNameMaterialSectionCourse() {
        addVideo.clickContentTypeSection();
        addMaterial.selectMaterialType();
        addMaterial.addMaterialSection();
        addMaterial.clickEditMaterialIcon();
        addMaterial.fillMaterialNameCourseSection("Materi Hukum Newton");
        addMaterial.renameMaterialCourseSection();
        addMaterial.cancelRenameMaterialCourseSection();
    }

    @And("I add new material section course")
    public void addNewMaterialSectionCourse(){
        addMaterial.addMaterialSection();
        addMaterial.clickEditMaterialIcon();
        addMaterial.fillMaterialNameCourseSection("Materi Hukum Gravitasi");
        addMaterial.renameMaterialCourseSection();
        addMaterial.saveRenameMaterialCourseSection();
    }

    @And("I add new description material")
    public void addNewDescriptionMaterial(){
        addMaterial.addMaterialSection();
        addMaterial.clickDescriptionMaterialIcon();
        addMaterial.fillDescriptionForMaterial("Ini merupakan materi pembelajaran mengenai hukum gravitasi. Silakan dipelajari dengan baik !");
        addMaterial.clickSaveMaterialDescription();
        addMaterial.seeDescriptionMaterial();
    }

    @And("I search for material from the either folder")
    public void addSearchMaterialCourse(){
        addMaterial.addMaterialSection();
        addMaterial.clickAddMaterial();
        addMaterial.clickSearhMaterialField();
        addMaterial.fillSeacrhMaterialField("Flutter");
    }

    @And("I add new material course")
    public void addNewMaterialCourse(){
        addMaterial.addMaterialSection();
        addMaterial.clickAddMaterial();
        addMaterial.clickAddFolderMaterial();
        addMaterial.clickAddFileMaterial();
        addMaterial.clickViewMaterial();
    }

    @Then("I success cancel rename material section course")
    public void SuccessCancelRenameMaterial(){
        addMaterial.validateOnCoursePage();
        }

    @Then("I success add course material content")
    public void SuccessRenameMaterial(){
        addMaterial.validateOnCoursePage();
    }
}
