package starter.StarEdu;


import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By dashboard(){
        return By.xpath("//*[@id=\"root\"]");
    }

    private By CustomerSection() { return By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/a[3]");}

    private By AddCourseSection() { return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[3]/div[2]/div[1]/div");}

    private By nameCourseField() {return By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/input");}

    private By liveSessionScheduleField() {return By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/input");}

    private By tumbnailButton(){return By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div");}

    private By tumbnailIcon() {return By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div/img[2]");}

    private By addCourseButton() {return By.xpath("/html/body/div[2]/div[3]/div[2]/div[4]/button[2]");}

    private By cancelButton() {return By.xpath("/html/body/div[2]/div[3]/div[2]/div[4]/button[1]");}


    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}

    @Step
    public void iamOnTheHomePage() {$(AddCourseSection()).isDisplayed();}

    @Step
    public void clickCustumerSection() { $(CustomerSection()).click();}

    @Step
    public void validateOnTheHomePage(){
        $(dashboard()).isDisplayed();
    }

    @Step
    public void clickAddCourseSection(){
        $(AddCourseSection()).click();
    }

    @Step
    public void fillNameCourse(String NameCourse){
        $(nameCourseField()).type(NameCourse);
    }

    @Step
    public void fillLiveSessionSchedule(String LiveSessionSchedule) { $(liveSessionScheduleField()).type(LiveSessionSchedule);}

    @Step
    public void clickTumbnailButton(){
        $(tumbnailButton()).click();
    }

    @Step
    public void clickTumbnailIcon(){
        $(tumbnailIcon()).click();
    }

    @Step
    public void clickAddCourse(){
        $(addCourseButton()).click();
    }

    @Step
    public void clickCancel(){
        $(cancelButton()).click();
    }

    @Step
    public void successAddCouse(){
        $(addCourseButton()).isDisplayed();
    }

}
