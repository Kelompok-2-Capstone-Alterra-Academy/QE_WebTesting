package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddQuiz extends PageObject {
    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}

    private By selectQuizContentType() { return By.xpath ("");}

    private By quizSection() { return By.xpath("");}

    private By editNameQuiz() {return By.id("");}

    private By fillQuizNameSection() { return By.id("");}

    private By renameQuizSection() { return By.xpath("");}

    private By saveRenameQuizSection() { return By.xpath("");}

    private By cancelRenameQuizSection() { return By.xpath("");}

    private By descriptionQuizIcon() { return By.id("");}

    private By fillDescriptionQuiz() { return By.xpath("");}

    private By saveAddDescriptionQuiz() { return By.id("");}

    private By seeDescriptionQuizIcon() { return By.id("");}

    private By addQuiz() { return By.id("");}

    private By addFileQuiz() { return By.id("");}

    private By viewQuiz() { return By.id("");}

    private By searchFolderQuizField() { return By.id("");}

    private By fillSearchFileQuiz() { return By.id("");}

    private By numberOfFilesQuizPerPage() { return By.id("");}

    private By SelectNumberQuizPerPage() { return By.id("");}

    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void validateOnCoursePage() { $(coursePage()).isDisplayed();}

    @Step
    public void selectQuizType() { $(selectQuizContentType()).click();}

    @Step
    public void addQuizSection() { $(quizSection()).click();}

    @Step
    public void clickEditQuizIcon() { $(editNameQuiz()).click();}

    @Step
    public void fillQuizNameCourseSection(String QuizNameCourseSection) { $(fillQuizNameSection()).type(QuizNameCourseSection);}

    @Step
    public void renameQuizCourseSection() { $(renameQuizSection()).click();}

    @Step
    public void saveRenameQuizCourseSection() { $(saveRenameQuizSection()).click();}

    @Step
    public void cancelRenameQuizCourseSection() { $(cancelRenameQuizSection()).click();}

    @Step
    public void clickDescriptionQuizIcon() { $(descriptionQuizIcon()).click();}

    @Step
    public void fillDescriptionForQuiz(String DescriptionQuiz) { $(fillDescriptionQuiz()).type(DescriptionQuiz);}

    @Step
    public void clickSaveQuizDescription() { $(saveAddDescriptionQuiz()).click();}

    @Step
    public void seeDescriptionQuiz() { $(seeDescriptionQuizIcon()).click();}

    @Step
    public void clickAddQuiz() { $(addQuiz()).click();}

    @Step
    public void clickAddFileQuiz() { $(addFileQuiz()).click();}

    @Step
    public void clickViewQuiz() { $(viewQuiz()).click();}

    @Step
    public void clickSearhQuizField() { $(searchFolderQuizField()).click();}

    @Step
    public void fillSeacrhQuizField(String SearhFileQuiz) { $(fillSearchFileQuiz()).type(SearhFileQuiz);}

    @Step
    public void clickNumberOfFilesQuizPerPage() { $(numberOfFilesQuizPerPage()).click();}

    @Step
    public void chooseNumberQuizPerPage() { $(SelectNumberQuizPerPage()).click();}
}
