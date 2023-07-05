package StepDefinitions;


import Pages.Objects;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public class TeacherLoginSteps {
    Objects objects=new Objects();
    Actions actions = new Actions(GWD.getDriver());








    @When("Go to the Academy and click Traning and Dates")
    public void goToTheAcademyAndClickTraningAndDates() {
        actions.moveToElement(objects.academy).perform();
    //    objects.scrollToElement(objects.academy);
        objects.clickFunction(objects.training);

    }

    @Given("Navigate to Imbus")
    public void navigateToImbus() {
        GWD.getDriver().get("https://www.imbus.de/en/");
        objects.clickFunction(objects.cookies);


    }
}

