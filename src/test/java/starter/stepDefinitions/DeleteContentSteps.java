package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.DeleteContent;

public class DeleteContentSteps {

    @Steps
    DeleteContent deleteContent;
    @When("I click on subject course content")
    public void iClickDelete(){
        deleteContent.ClickSection();
    }
    @And("I cancel delete content")
    public void iClickButtonCancelDeleteContent(){
        deleteContent.ClikSectionVideo();
        deleteContent.ClikIconDeleteContent();
        deleteContent.clickcancelButton();
    }
    @And("I delete content")
    public void iClickButtonDeleteContent(){
        deleteContent.ClikSectionVideo();
        deleteContent.ClikIconDeleteContent();
        deleteContent.clickDeleteContentButton();

    }
    @Then("I success cancel delete content")
    public  void cancelDeleteContent(){
        deleteContent.validateOnTheCoursePage();
    }
    @Then("I success delete content")
    public  void DeleteContent(){
        deleteContent.validateOnTheCoursePage();
    }

}

