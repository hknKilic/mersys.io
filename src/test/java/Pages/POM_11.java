package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class POM_11 extends Events {
    public POM_11() {
        PageFactory.initElements(WBA.getDriver(), this);
    }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-edit-button")
    public WebElement editButton;

    @FindBy(css = "[formcontrolname='description']")
    public WebElement description;

    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    public WebElement descriptionName;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    public WebElement integrationCode;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveEditButton;

    @FindBy(css = "input[data-placeholder='Priority']")
    public WebElement priority;

    @FindBy(css = "[data-placeholder='Description']")
    public WebElement descriptionSearch;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;


    @FindBy(css = "[data-placeholder='Name']")
    public WebElement searchBox;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "discounts":
                return this.discounts;
        }
        return null;
    }




}
