package StepDefinitions;


import Pages.Objects;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TrainingLoginSteps {
    Objects objects=new Objects();
    Actions actions = new Actions(GWD.getDriver());








    @When("Go to the Academy and click Traning and Dates")
    public void goToTheAcademyAndClickTraningAndDates() {
        actions.moveToElement(objects.academy).perform();
    //    objects.scrollToElement(objects.academy);
        objects.clickFunction(objects.training);

    }

    @And("Go to the AI Testing")
    public void goToTheAITesting() {
       // objects.scrollToElement(objects.aiTestingDetails);
       // objects.clickFunction(objects.aiTestingDetails);
        // objects.clickFunction(objects.aiTestingXTextt);

        objects.clickFunction(objects.deneme);
    }
    @Then("Confirm headline")
    public void confirmHeadline() {
        objects.verifyContainsTextFunction(objects.title,"AI");
    }

    @Given("Navigate to Imbus Homepage")
    public void navigateToImbusHomepage() {
        GWD.getDriver().get("https://www.imbus.de/en/");
        objects.clickFunction(objects.cookies);

    }

    @Then("Confirm Contakt Text")
    public void confirmContaktText() {
       // objects.verifyContainsTextFunction(objects.contakt,"Contakt");
        Assert.assertTrue(objects.contact.isDisplayed());
    }
}

