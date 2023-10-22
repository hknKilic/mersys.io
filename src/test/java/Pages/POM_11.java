package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class POM_11 extends Events {

    {
        PageFactory.initElements(WBA.getDriver(), this);
    }


    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath="  //input[@id=ms-text-field-2]")
    public WebElement description;

    @FindBy(xpath="  //input[@id=ms-text-field-3]")
    public WebElement integrationsCode;

    @FindBy(xpath="  //input[@id=ms-text-field-0]")
    public WebElement priority;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement discauntTab;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='shortName']//input" )
    public WebElement ShortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;



}
