package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Customer extends PageObject {
    private By customerPage() { return By.xpath("//*[@id=\"root\"]/div[1]");}

    private By selectCourseIcon() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[2]/div[1]");}

    private By selectCourse() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div/div[4]");}

    private By Sort() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[2]/div[2]");}

    private By ZtoA() { return By.xpath("/html/body/div[2]/div[3]/div[1]/div/button[2]");}

    private By Terlama() { return By.xpath("/html/body/div[2]/div[3]/div[2]/div/button[2]");}

    private By SaveChange() { return By.xpath("/html/body/div[2]/div[3]/button");}

    private By SearchNameField() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[2]/div[3]");}

    private By fillNameField() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div[2]/div[3]/input");}

    private By ContactStudents() { return By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[5]/div/button[1]");}

    private By RemoveSessionButton() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[5]/div/button[2]");}

    private By RemoveButton() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}

    private By CancelRemoveButton() { return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}


    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void validateOnTheCustomerPage() { $(customerPage()).isDisplayed();}

    @Step
    public void clickdropdwornIcon() { $(selectCourseIcon()).click();}

    @Step
    public void selectOneOfCourse() { $(selectCourse()).click();}

    @Step
    public void clickSorting() { $(Sort()).click();}

    @Step
    public void clickAbjad() { $(ZtoA()).click();}

    @Step
    public void clickLongest() { $(Terlama()).click();}

    @Step
    public void clickSaveChange() { $(SaveChange()).click();}

    @Step
    public void clickSearchName() { $(SearchNameField()).click();}

    @Step
    public void fillSearchNameField(String SearchName) { $(fillNameField()).type(SearchName);}

    @Step
    public void contact() { $(ContactStudents()).click();}

    @Step
    public void clickRemoveSessionStudents() { $(RemoveSessionButton()).click();}

    @Step
    public void clickRemoveButton() { $(RemoveButton()).click();}

    @Step
    public void clickCancelRemoveButton() { $(CancelRemoveButton()).click();}
}
