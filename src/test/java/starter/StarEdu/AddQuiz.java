package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddQuiz extends PageObject {
    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}

    private By selectQuizContentType() { return By.xpath ("//*[@id=\"selectWrapper\"]/div/div/div[4]");}

    private By quizSection() { return By.xpath("//*[@id=\"content-564\"]");}

    private By editNameQuiz() {return By.id("contentTitleEditIcon");}

    private By fillQuizNameSection() { return By.id("contentTitleInput");}

    private By renameQuizSection() { return By.id("saveButton");}

    private By saveRenameQuizSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}

    private By cancelRenameQuizSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}

    private By descriptionQuizIcon() { return By.id("addTextButton");}

    private By fillDescriptionQuiz() { return By.xpath("/html/body/div[2]/div[3]/textarea");}

    private By saveAddDescriptionQuiz() { return By.id("addDescSaveButton");}

    private By seeDescriptionQuizIcon() { return By.id("contentDescription");}

    private By addQuiz() { return By.id("addContentButton");}

    private By addFileQuiz() { return By.id("modalTableSelect");}

    private By viewQuiz() { return By.id("contentTitleContainer");}

    private By searchFileQuizField() { return By.id("modalSearch");}

    private By fillSearchFileQuiz() { return By.id("modalSearchInput");}


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
    public void clickSearhQuizField() { $(searchFileQuizField()).click();}

    @Step
    public void fillSeacrhQuizField(String SearhFileQuiz) { $(fillSearchFileQuiz()).type(SearhFileQuiz);}

}
