package StepDefinitons;

import Pages.POM_00;
import Pages.POM_11;
import Utilities.Events;
import io.cucumber.java.en.*;

public class _11_EditingDiscountsUnderParametersSetting extends Events {

    POM_11 lc = new POM_11();
    @Given("Navigate to SetUp and Paramater Categories")
    public void navigateToSetUpAndParamaterCategories() {

        lc.myClick(lc.setup);
        lc.myClick(lc.parameters);
    }

    @When("the User clicks on the Discount tab")
    public void theUserClicksOnTheDiscountTab() {
        lc.myClick(lc.discauntTab);
    }

    @And("the User fills in the necessary information to add a new discount")
    public void theUserFillsInTheNecessaryInformationToAddANewDiscount() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.description,"hakan06");
        lc.mySendKeys(lc.integrationsCode,"124");
        lc.mySendKeys(lc.priority,"625");


    }

    @Then("the discount should be added")
    public void theDiscountShouldBeAdded() {
        lc.myClick(lc.saveButton);
    }

    @And("the User updates the necessary information for an existing discount")
    public void theUserUpdatesTheNecessaryInformationForAnExistingDiscount() {

        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.description,"umut29");
        lc.mySendKeys(lc.integrationsCode,"785");
        lc.mySendKeys(lc.priority,"542");
    }

    @Then("the changes should be saved")
    public void theChangesShouldBeSaved() {

        lc.myClick(lc.saveButton);
    }

    @And("the User initiates the process to delete an existing discount")
    public void theUserInitiatesTheProcessToDeleteAnExistingDiscount() {

        lc.myClick(lc.deleteDialogBtn);
    }

    @Then("the discount should be deleted, and the User completes the verification step")
    public void theDiscountShouldBeDeletedAndTheUserCompletesTheVerificationStep() {
        lc.verifyContainsText(lc.deleteDialogBtn,"successfully deleted");
    }
}





