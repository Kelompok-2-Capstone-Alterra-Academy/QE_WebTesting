package starter.StarEdu;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteContent extends PageObject {

    private By coursePage() { return By.xpath("//*[@id=\"root\"]/div[1]/div");}
    private By Section(){return By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[3]/div[2]/div[8]/div[2]");}
    private By SectionVideo(){return By.id("content-544");}
    private By IconDeleteContent(){return By.id("deleteButton");}
    private By cancelbutton(){return By.xpath("/html/body/div[2]/div[3]/div[2]/button[1]");}
    private By DeleteContentButton(){return By.xpath("/html/body/div[2]/div[3]/div[2]/button[2]");}

    @Step
    public static OpenUrl url(String targetUrl) { return new OpenUrl(targetUrl);}
    @Step
    public void ClickSection() { $(Section()).click();}
    @Step
    public void validateOnTheCoursePage() { $ (coursePage()).isDisplayed();}
    @Step
    public void ClikSectionVideo() { $(SectionVideo()).click();}
    @Step
    public void ClikIconDeleteContent() { $(IconDeleteContent()).click();}

    @Step
    public void clickcancelButton() { $(cancelbutton()).click();}
    @Step
    public void clickDeleteContentButton() { $(DeleteContentButton()).click();}
}

