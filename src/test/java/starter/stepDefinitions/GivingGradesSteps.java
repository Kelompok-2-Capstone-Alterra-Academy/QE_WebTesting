package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.AddVideo;
import starter.StarEdu.GivingGrades;

public class GivingGradesSteps {

    @Steps
    AddVideo addVideo;

    @Steps
    GivingGrades givingGrades;

    @When("I click on subject course section")
    public void selectCourse(){
        givingGrades.selectSubjectCourse();
    }

    @And("I search student names")
    public void addSearchStudents(){
        givingGrades.clickAssignmentContent();
        givingGrades.clickSearchfieldGivingGrade();
        givingGrades.fillOnSearchfieldGivingGrade("Ris");
    }

    @And("I provide assessments to students")
    public void provideAssessment(){
        givingGrades.clickGivingGradeButton();
        givingGrades.fillGradesForStudents("90");
        givingGrades.clickSaveGivingGradeButton();
    }

    @And("I downloads the answer file")
    public void addDownloadFile(){
        givingGrades.clickDownloadFiles();
    }

    @Then("I success search student names")
    public void SuccessSearchStudents(){
        givingGrades.validateOnCoursePage();
    }

    @Then("I success provide assessments to students")
    public void SuccessProvideAssessment(){
        givingGrades.validateOnCoursePage();
    }

    @Then("I success downloads the answer file")
    public void SuccessDownloadFile(){
        givingGrades.validateOnCoursePage();
    }

}
