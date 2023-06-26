package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class GivingGrades extends PageObject {

    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}

    private By SubjectCourse() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[3]/div[2]/div[6]/div[2]");}

    private By tugasSection() { return By.id("content-394");}

    private By searchfieldGivingGrade() { return By.id("searchWrapper");}

    private By fillsearchfieldGivingGrade() { return By.id("searchInput");}

    private By GivingGrade() { return By.id("tableButton");}

    private By saveGiveGrade() { return By.id("scoreSaveButton");}

    private By DownloadFiles() { return By.xpath("//*[@id=\"tableBodyCellFile\"]/a");}

    private By FillGrade() { return By.xpath("/html/body/div[2]/div[3]/div/input");}



    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void validateOnCoursePage() { $(coursePage()).isDisplayed();}

    @Step
    public void selectSubjectCourse() { $(SubjectCourse()).click();}

    @Step
    public void clickAssignmentContent() { $(tugasSection()).click();}

    @Step
    public void clickSearchfieldGivingGrade() { $(searchfieldGivingGrade()).click();}

    @Step
    public void fillOnSearchfieldGivingGrade(String GivingGrades) { $(fillsearchfieldGivingGrade()).type(GivingGrades);}

    @Step
    public void clickGivingGradeButton() { $(GivingGrade()).click();}

    @Step
    public void clickSaveGivingGradeButton() { $(saveGiveGrade()).click();}

    @Step
    public void clickDownloadFiles() { $(DownloadFiles()).click();}

    @Step
    public void fillGradesForStudents(String Grade) { $(FillGrade()).type(Grade);}
}
