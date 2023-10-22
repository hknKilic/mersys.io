package StepDefinitons;

import Pages.POM_11;
import Pages.POM_12;
import Utilities.Events;
import io.cucumber.java.en.*;

public class _12_EditingNationalitiesUnderParametersSetting extends Events {

    POM_12 lc = new POM_12();

    @When("the User is on the page to add nationalities.")
    public void theUserIsOnThePageToAddNationalities() {

        lc.myClick(lc.nationalitys);
    }

    @And("the User enters the required information to add a new nationality.")
    public void theUserEntersTheRequiredInformationToAddANewNationality() {

        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.nameInput,"ukranien");

    }

    @Then("the nationality should be added.")
    public void theNationalityShouldBeAdded() {
        lc.myClick(lc.saveButton);
    }

    @When("the User is on the page to edit nationalities")
    public void theUserIsOnThePageToEditNationalities() {



        lc.mySendKeys(lc.nameInput,"iran");

    }

    @And("the User updates the valid information for an existing nationality")
    public void theUserUpdatesTheValidInformationForAnExistingNationality() {
        lc.myClick(lc.saveButton);
    }

    @When("the User is on the page to delete nationalities")
    public void theUserIsOnThePageToDeleteNationalities() {
        lc.myClick(lc.deleteDialogBtn);
    }

    @And("the User initiates the process to delete an existing nationality")
    public void theUserInitiatesTheProcessToDeleteAnExistingNationality() {
        lc.mySendKeys(lc.nameInput,"germany");
    }

    @Then("the nationality should be deleted, and the User completes the verification step")
    public void theNationalityShouldBeDeletedAndTheUserCompletesTheVerificationStep() {
        lc.verifyContainsText(lc.deleteDialogBtn,"successfully deleted");
    }
}
