package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.StarEdu.Customer;
import starter.StarEdu.Home;
import starter.StarEdu.Login;

public class CustomerSteps {

    @Steps
    Login login;
    @Steps
    Home home;
    @Steps
    Customer customer;

    @Given("I am on the home page")
    public void InTheHomePage(){
        home.openUrl("https://staredu-desktop-dev.netlify.app/dashboard");
        login.inputEmail("mentor.satu@gmail.com");
        login.inputPassword("12345678");
        login.ClickLoginButton();
    }

    @When("I click customer section")
    public void iClickCustomerSection(){
        home.clickCustumerSection();
    }

    @Then("I am on the customer page")
    public  void iamOnTheCustomerPage(){
        customer.validateOnTheCustomerPage();
    }

    @And("I select a subject on choose course option")
    public void iSelectSubject(){
        customer.clickdropdwornIcon();
        customer.selectOneOfCourse();
    }

    @And("I do sorting students")
    public void sorting(){
        customer.clickSorting();
        customer.clickAbjad();
        customer.clickLongest();
        customer.clickSaveChange();
    }

    @And("I search for the student name")
    public void searchNameStudents(){
        customer.clickSearchName();
        customer.fillSearchNameField("Wiyan");
    }
    @And("I click contact one of students")
    public void contactOneOfStudents(){
        customer.contact();
    }

    @And("I cancel remove students")
    public void cancelRemoveStudents(){
        customer.clickRemoveSessionStudents();
        customer.clickCancelRemoveButton();
    }

    @And("I remove students")
    public void RemoveStudents(){
        customer.clickRemoveSessionStudents();
        customer.clickRemoveButton();
    }

    @Then("I see students of the courses")
    public void successSeeStudents(){
        customer.validateOnTheCustomerPage();
    }
}
