package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddTask extends PageObject {

    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}

    private By selectAssignmentContentType() { return By.xpath ("//*[@id=\"selectWrapper\"]/div/div/div[3]");}

    private By AssignmentSection() { return By.id("content-565");}

    private By editNameAssignment() {return By.id("contentTitleEditIcon");}

    private By fillAssignmentNameSection() { return By.id("contentTitleInput");}

    private By saveAssignmentSection() { return By.id("saveButton");}

    private By saveRenameAssignmentSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}

    private By cancelRenameAssignmentSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}

    private By descriptionAssignmentIcon() { return By.id("addTextButton");}

    private By fillDescriptionAssignment() { return By.xpath("/html/body/div[2]/div[3]/textarea");}

    private By saveAddDescriptionAssignment() { return By.id("addDescSaveButton");}

    private By seeDescriptionAssignmentIcon() { return By.id("contentDescription");}

    private By addAssignment() { return By.id("addContentButton");}

    private By addFolderAssignment() { return By.id("modalContentCard-86");}

    private By addFileAssignment() { return By.id("modalTableSelect");}

    private By viewAssignment() { return By.id("contentContainer");}

    private By searchFolderAssignmentField() { return By.id("modalSearch");}

    private By fillSearchFileAssignment() { return By.id("modalSearchInput");}

    private By calenderIcon() { return By.id("selectDeadlineButton");}

    private By selectDeadline() { return By.xpath("//*[@id=\"datePicker\"]/div/div/div/table/tbody/tr[3]/td[5]");}

    private By saveSchedule() { return By.id("scheduleDeadlineButton");}

    private By cancelSaveSchedule() { return By.id("cancelDeadlineButton");}

    private By nextMonthIcon() { return By.xpath("//*[@id=\"datePicker\"]/div/div/div/div/div[2]/button[2]");}
    private By selectDeadlineNextMonth() { return By.xpath("//*[@id=\"datePicker\"]/div/div/div/table/tbody/tr[5]/td[6]/button");}

    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void validateOnCoursePage() { $(coursePage()).isDisplayed();}

    @Step
    public void selectAssignmentType() { $(selectAssignmentContentType()).click();}

    @Step
    public void addAssignmentSection() { $(AssignmentSection()).click();}

    @Step
    public void clickEditAssignmentIcon() { $(editNameAssignment()).click();}

    @Step
    public void fillAssignmentNameCourseSection(String AssignmentNameCourseSection) { $(fillAssignmentNameSection()).type(AssignmentNameCourseSection);}

    @Step
    public void saveAssignmentCourseSection() { $(saveAssignmentSection()).click();}

    @Step
    public void saveRenameAssignmentCourseSection() { $(saveRenameAssignmentSection()).click();}

    @Step
    public void cancelRenameAssignmentCourseSection() { $(cancelRenameAssignmentSection()).click();}

    @Step
    public void clickDescriptionAssignmentIcon() { $(descriptionAssignmentIcon()).click();}

    @Step
    public void fillDescriptionForAssignmnet(String DescriptionAssignment) { $(fillDescriptionAssignment()).type(DescriptionAssignment);}

    @Step
    public void clickSaveAssignmentDescription() { $(saveAddDescriptionAssignment()).click();}

    @Step
    public void seeDescriptionAssignment() { $(seeDescriptionAssignmentIcon()).click();}

    @Step
    public void clickAddAssignment() { $(addAssignment()).click();}

    @Step
    public void clickAddFolderAssignment() { $(addFolderAssignment()).click();}

    @Step
    public void clickAddFileAssignment() { $(addFileAssignment()).click();}

    @Step
    public void clickViewAssignment() { $(viewAssignment()).click();}

    @Step
    public void clickSearhAssignmentField() { $(searchFolderAssignmentField()).click();}

    @Step
    public void fillSeacrhAssignmentField(String SearhFolderAssignment) { $(fillSearchFileAssignment()).type(SearhFolderAssignment);}

    @Step
    public void clickCalenderIcon() { $(calenderIcon()).click();}

    @Step
    public void selectYourDeadline() { $(selectDeadline()).click();}

    @Step
    public void clickSaveSchedule() { $(saveSchedule()).click();}

    @Step
    public void clickCancelSaveSchedule() { $(cancelSaveSchedule()).click();}

    @Step
    public void clickNextMonthIcon() { $(nextMonthIcon()).click();}

    @Step
    public void selectYourDeadlineNextMonth() { $(selectDeadlineNextMonth()).click();}
}
