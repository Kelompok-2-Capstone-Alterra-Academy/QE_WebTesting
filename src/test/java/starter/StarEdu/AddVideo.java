package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class AddVideo extends PageObject {
    ////*[@id="root"]/div[1]/div
    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}
    private By nextIcon() { return By.xpath("/html/body/div/div[1]/div[2]/div/div/div[3]/div[1]/svg[2]");}
    private By subjectSection() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[3]/div[2]/div[7]/div[2]/div/span");}
    private By plusIcon() {return By.id("addSectionIcon");}
    private By editIcon() { return By.id("headerTitleEditIcon");}
    private By fillNameSection() { return By.id("headerTitleInput");}
    private By renameSectionCourse() { return By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/button[2]");}
    private By saveRenameSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}
    private By cancelRenameSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}
    private By addSectionIcon() { return By.id("selectWrapper");}
    private By selectVideoContentType() { return By.xpath ("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[1]");}
    private By videoSection() { return By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div/div/span");}
    private By editNameVideo() {return By.id("contentTitleEditIcon");}
    private By fillVideoNameSection() { return By.id("contentTitleInput");}
    private By renameVideoSection() { return By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div[3]/div/div[2]/button[4]");}
    private By saveRenameVideoSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}
    private By cancelRenameVideoSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}
    private By descriptionIcon() { return By.id("addTextButton");}
    private By fillDescriptionVideo() { return By.xpath("/html/body/div[2]/div[3]/textarea");}
    private By saveAddDescription() { return By.id("addDescSaveButton");}
    private By seeDescriptionIcon() { return By.id("contentDescription");}
    private By addVideo() { return By.id("addContentButton");}
    private By addFolderVideo() { return By.id("modalContentCard-58");}
    private By addFileVideo() { return By.id("modalTableSelect");}
    private By viewVideo() { return By.id("contentContainer");}
    private By searchFolderField() { return By.id("modalSearch");}
    private By fillSearchFolder() { return By.id("modalSearchInput");}

    //modalSearch
    //modalSearchInput


    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void clickSubjectCourse() { $(subjectSection()).click();}
    @Step
    public void validateOnTheCoursePage() { $(coursePage()).isDisplayed();}
    @Step
    public void clickPlusIcon() { $(plusIcon()).click();}
    @Step
    public void clickEditIcon() {$(editIcon()).click();}
    @Step
    public void fillNameCourseSection(String NameCourseSection) { $(fillNameSection()).type(NameCourseSection);}
    @Step
    public void renameCourseSection() { $(renameSectionCourse()).click();}
    @Step
    public void saveRenameCourseSection() { $(saveRenameSection()).click();}
    @Step
    public void clickContentTypeSection() { $(addSectionIcon()).click();}
    @Step
    public void selectVideoType() { $(selectVideoContentType()).click();}
    @Step
    public void clickVideoSection() { $(videoSection()).click();}
    @Step
    public void clickEditVideoIcon() { $(editNameVideo()).click();}
    @Step
    public void fillVideoNameCourseSection(String VideoNameCourseSection) { $(fillVideoNameSection()).type(VideoNameCourseSection);}
    @Step
    public void renameVideoCourseSection() { $(renameVideoSection()).click();}
    @Step
    public void saveRenameVideoCourseSection() { $(saveRenameVideoSection()).click();}
    @Step
    public void cancelRenameVideoCourseSection() { $(cancelRenameVideoSection()).click();}
    @Step
    public void clickDescriptionIcon() { $(descriptionIcon()).click();}
    @Step
    public void fillDescriptionForVideo(String DescriptionVideo) { $(fillDescriptionVideo()).type(DescriptionVideo);}
    @Step
    public void clickSaveDescription() { $(saveAddDescription()).click();}
    @Step
    public void seeDescriptionVideo() { $(seeDescriptionIcon()).click();}
    @Step
    public void clickAddVideo() { $(addVideo()).click();}
    @Step
    public void clickAddFolderVideo() { $(addFolderVideo()).click();}
    @Step
    public void clickAddFileVideo() { $(addFileVideo()).click();}
    @Step
    public void clickViewVideo() { $(viewVideo()).click();}

    @Step
    public void clickSearhField() { $(searchFolderField()).click();}
    @Step
    public void fillSeacrhField(String SearhFolder) { $(fillSearchFolder()).type(SearhFolder);}


}
