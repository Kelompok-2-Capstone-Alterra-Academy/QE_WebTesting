package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddMaterial extends PageObject {

    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}

    private By selectMaterialContentType() { return By.xpath ("//*[@id=\"selectWrapper\"]/div/div/div[2]");}

    private By materialSection() { return By.xpath("//*[@id=\"content-534\"]");}

    private By editNameMaterial() {return By.id("contentTitleEditIcon");}

    private By fillMaterialNameSection() { return By.id("contentTitleInput");}

    private By renameMaterialSection() { return By.id("saveButton");}

    private By saveRenameMaterialSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}

    private By cancelRenameMaterialSection() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}

    private By descriptionMaterialIcon() { return By.id("addTextButton");}

    private By fillDescriptionMaterial() { return By.xpath("/html/body/div[2]/div[3]/textarea");}

    private By saveAddDescriptionMaterial() { return By.id("addDescSaveButton");}

    private By seeDescriptionMaterialIcon() { return By.id("contentDescription");}

    private By addMaterial() { return By.id("addContentButton");}

    private By addFolderMaterial() { return By.id("modalContentCardIcon-58");}

    private By addFileMaterial() { return By.id("modalTableSelect");}

    private By viewMaterial() { return By.id("contentContainer");}

    private By searchFolderMaterialField() { return By.id("modalSearch");}

    private By fillSearchFolderMaterial() { return By.id("modalSearchInput");}

    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void validateOnCoursePage() { $(coursePage()).isDisplayed();}

    @Step
    public void selectMaterialType() { $(selectMaterialContentType()).click();}

    @Step
    public void addMaterialSection() { $(materialSection()).click();}

    @Step
    public void clickEditMaterialIcon() { $(editNameMaterial()).click();}

    @Step
    public void fillMaterialNameCourseSection(String MaterialNameCourseSection) { $(fillMaterialNameSection()).type(MaterialNameCourseSection);}

    @Step
    public void renameMaterialCourseSection() { $(renameMaterialSection()).click();}

    @Step
    public void saveRenameMaterialCourseSection() { $(saveRenameMaterialSection()).click();}

    @Step
    public void cancelRenameMaterialCourseSection() { $(cancelRenameMaterialSection()).click();}

    @Step
    public void clickDescriptionMaterialIcon() { $(descriptionMaterialIcon()).click();}

    @Step
    public void fillDescriptionForMaterial(String DescriptionMaterial) { $(fillDescriptionMaterial()).type(DescriptionMaterial);}

    @Step
    public void clickSaveMaterialDescription() { $(saveAddDescriptionMaterial()).click();}

    @Step
    public void seeDescriptionMaterial() { $(seeDescriptionMaterialIcon()).click();}

    @Step
    public void clickAddMaterial() { $(addMaterial()).click();}

    @Step
    public void clickAddFolderMaterial() { $(addFolderMaterial()).click();}

    @Step
    public void clickAddFileMaterial() { $(addFileMaterial()).click();}

    @Step
    public void clickViewMaterial() { $(viewMaterial()).click();}

    @Step
    public void clickSearhMaterialField() { $(searchFolderMaterialField()).click();}

    @Step
    public void fillSeacrhMaterialField(String SearhFolderMaterial) { $(fillSearchFolderMaterial()).type(SearhFolderMaterial);}

}
