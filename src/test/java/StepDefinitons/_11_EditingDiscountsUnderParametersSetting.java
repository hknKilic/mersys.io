package StepDefinitons;

import Pages.POM_11;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _11_EditingDiscountsUnderParametersSetting extends POM_11 {

    POM_11 lc = new POM_11();

    String descriptionName = "hkn06";
    String integrationCode = "k3";
    String priority = "%12";
    String editDescriptionName = "umt2edt";
    String editIntegrationCode = "g3edit";
    String editPriority = "%11";

    @When("the user navigates to setup")
    public void theUserNavigatesToSetup(DataTable dt) {
        List<String> discountList = dt.asList(String.class);
        for (int i = 0; i <discountList.size(); i++) {
            WebElement clickElement = lc.getWebElement(discountList.get(i));
            lc.myClick(clickElement);
        }
    }

    @And("the user creates a new discount")
    public void theUserCreatesANewDiscount() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.descriptionName, descriptionName);
        lc.mySendKeys(lc.integrationCode, integrationCode);
        lc.mySendKeys(lc.priority, priority + Keys.ENTER);
        lc.myClick(lc.saveButton);
    }

    @Then("the discount document should be added successfully")
    public void theDiscountDocumentShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user edits an existing new discount")
    public void theUserEditsAnExistingNewDiscount() {
        lc.mySendKeys(lc.descriptionSearch, descriptionName);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.editButton);
        lc.mySendKeys(lc.descriptionName, editDescriptionName);
        lc.mySendKeys(lc.integrationCode, editIntegrationCode);
        lc.mySendKeys(lc.priority, editPriority + Keys.ENTER);
        lc.myClick(lc.saveButton);
    }

    @Then("the new discount should be edited successfully")
    public void theNewDiscountShouldBeEditedSuccessfully() {

        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user deletes an existing new discount")
    public void theUserDeletesAnExistingNewDiscount() {
        lc.mySendKeys(lc.descriptionSearch, editDescriptionName);
        lc.myClick(lc.searchButton);
        lc.wait.until(ExpectedConditions.elementToBeClickable(lc.searchButton));
        lc.myClick(lc.deleteImageButton);
        lc.myClick(lc.deleteDialogButton);
    }

    @Then("the new discount should be deleted successfully")
    public void theNewDiscountShouldBeDeletedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }
}




