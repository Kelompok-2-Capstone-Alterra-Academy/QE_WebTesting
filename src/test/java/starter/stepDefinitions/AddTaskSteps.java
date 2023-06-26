package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.AddTask;
import starter.StarEdu.AddVideo;

public class AddTaskSteps {
    @Steps
    AddVideo addVideo;

    @Steps
    AddTask addTask;

    @And("I cancel save new assignment section course")
    public void CancelNameAssignmentSectionCourse() {
        addVideo.clickContentTypeSection();
        addTask.selectAssignmentType();
        addTask.addAssignmentSection();
        addTask.clickEditAssignmentIcon();
        addTask.fillAssignmentNameCourseSection("Tugas Hukum Newton");
        addTask.saveAssignmentCourseSection();
        addTask.cancelRenameAssignmentCourseSection();
    }

    @And("I add new assignment section course")
    public void addNewAssignmentSectionCourse(){
        addTask.addAssignmentSection();
        addTask.clickEditAssignmentIcon();
        addTask.fillAssignmentNameCourseSection("Materi Hukum Gravitasi");
        addTask.saveAssignmentCourseSection();
        addTask.saveRenameAssignmentCourseSection();
    }

    @And("I add new description assignment")
    public void addNewDescriptionAssignment(){
        addTask.addAssignmentSection();
        addTask.clickDescriptionAssignmentIcon();
        addTask.fillDescriptionForAssignmnet("Ini merupakan tugas pembelajaran mengenai hukum gravitasi. Silakan dikerjakan dengan baik !");
        addTask.clickSaveAssignmentDescription();
        addTask.seeDescriptionAssignment();
    }

    @And("I cancel schedule for assignment")
    public void cancelScheduleAssignment(){
        addTask.addAssignmentSection();
        addTask.clickCalenderIcon();
        addTask.selectYourDeadline();
        addTask.clickCancelSaveSchedule();
    }

    @And("I add schedule for assignment")
    public void saveScheduleAssignment(){
        addTask.addAssignmentSection();
        addTask.clickCalenderIcon();
        addTask.selectYourDeadline();
        addTask.clickSaveSchedule();
    }

    @And("I add schedule for assignment deadlines next month")
    public void saveScheduleAssignmentNextMonth(){
        addTask.addAssignmentSection();
        addTask.clickCalenderIcon();
        addTask.clickNextMonthIcon();
        addTask.selectYourDeadlineNextMonth();
        addTask.clickSaveSchedule();
    }

    @And("I search for assignment from the either folder")
    public void addSearchMaterialCourse(){
        addTask.addAssignmentSection();
        addTask.clickAddAssignment();
        addTask.clickSearhAssignmentField();
        addTask.fillSeacrhAssignmentField("Himpunan");
    }

    @And("I add new assignment course")
    public void addNewMaterialCourse(){
        addTask.addAssignmentSection();
        addTask.clickAddAssignment();
        addTask.clickAddFolderAssignment();
        addTask.clickAddFileAssignment();
        addTask.clickViewAssignment();
    }

    @Then("I success cancel rename assignment section course")
    public void SuccessCancelRenameMaterial(){
        addTask.validateOnCoursePage();
    }

    @Then("I success add course assignment content")
    public void SuccessRenameMaterial(){
        addTask.validateOnCoursePage();
    }

}
