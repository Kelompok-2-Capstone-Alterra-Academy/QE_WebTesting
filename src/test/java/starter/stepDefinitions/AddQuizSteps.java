package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.StarEdu.AddQuiz;
import starter.StarEdu.AddVideo;

public class AddQuizSteps extends PageObject {
    @Steps
    AddVideo addVideo;

    @Steps
    AddQuiz addQuiz;

    @And("I cancel rename new quiz section course")
    public void CancelNameQuizSectionCourse() {
        addVideo.clickContentTypeSection();
        addQuiz.selectQuizType();
        addQuiz.addQuizSection();
        addQuiz.clickEditQuizIcon();
        addQuiz.fillQuizNameCourseSection("Quiz Hukum Newton");
        addQuiz.renameQuizCourseSection();
        addQuiz.cancelRenameQuizCourseSection();
    }

    @And("I add new quiz section course")
    public void addNewQuizSectionCourse(){
        addQuiz.addQuizSection();
        addQuiz.clickEditQuizIcon();
        addQuiz.fillQuizNameCourseSection("Quiz Hukum Gravitasi");
        addQuiz.renameQuizCourseSection();
        addQuiz.saveRenameQuizCourseSection();
    }

    @And("I add new description quiz")
    public void addNewDescriptionQuiz(){
        addQuiz.addQuizSection();
        addQuiz.clickDescriptionQuizIcon();
        addQuiz.fillDescriptionForQuiz("Ini merupakan quiz pembelajaran mengenai hukum gravitasi. Silakan dikerjakan dengan baik !");
        addQuiz.clickSaveQuizDescription();
        addQuiz.seeDescriptionQuiz();
    }

    @And("I search for quiz from the either folder")
    public void addSearchQuizCourse(){
        addQuiz.addQuizSection();
        addQuiz.clickAddQuiz();
        addQuiz.clickSearhQuizField();
        addQuiz.fillSeacrhQuizField("Quiz 1");
    }

    @And("I choose number of quizzes on each page")
    public void addChooseNumberQuizPerPage(){
        addQuiz.addQuizSection();
        addQuiz.clickAddQuiz();
        addQuiz.clickNumberOfFilesQuizPerPage();
        addQuiz.chooseNumberQuizPerPage();
    }

    @And("I add new quiz course")
    public void addNewQuizCourse(){
        addQuiz.addQuizSection();
        addQuiz.clickAddQuiz();
        addQuiz.clickAddFileQuiz();
        addQuiz.clickViewQuiz();
    }

    @Then("I success cancel rename quiz section course")
    public void SuccessCancelRenameQuiz(){
        addQuiz.validateOnCoursePage();
    }

    @Then("I success add quiz section course")
    public void SuccessRenameQuiz(){
        addQuiz.validateOnCoursePage();
    }

}
