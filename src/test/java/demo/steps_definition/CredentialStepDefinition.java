package demo.steps_definition;

import demo.pages.phptravels.PhptravelsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CredentialStepDefinition {
    PhptravelsPage phptravelsPage = new PhptravelsPage();

    @When("User click on my account button")
    public void userClickOnMyAccountButton() {
        phptravelsPage.clickMyAccount();
    }

    @And("User click on myacclogin button")
    public void userClickOnMyaccloginButton() {
        phptravelsPage.clickMyAccLogin();
    }

    @And("User see login page")
    public void userSeeLoginPage() {
        boolean actual = phptravelsPage.seeLoginPage();
        Assert.assertTrue(actual);
    }

    @And("User input {string} on phptravel email field")
    public void userInputOnPhptravelEmailField(String data) {
        phptravelsPage.inputLoginEmail(data);
    }

    @And("User input {string} on phptravel password field")
    public void userInputOnPhptravelPasswordField(String data) {
        phptravelsPage.inputLoginPassword(data);
    }

    @And("User click LOGIN button on phptravel login page")
    public void userClickLOGINButtonOnPhptravelLoginPage() {
        phptravelsPage.clickLOGINbutton();
    }

    @Then("User see my Account page")
    public void userSeeMyAccountPage() {
        boolean actual = phptravelsPage.seeMyAccountPage();
        Assert.assertTrue(actual);
    }


    @When("User open visa request url from {string} to {string} on {string}")
    public void userOpenVisaRequestUrlFromToOn(String origin, String destination, String date) {
        phptravelsPage.openVisaPage(origin, destination, date);
    }

    @And("User input {string} on the visa firstname field")
    public void userInputOnTheVisaFirstnameField(String data) {
        phptravelsPage.inputvisafirstname(data);
    }

    @And("User input {string} on the visa lastname field")
    public void userInputOnTheVisaLastnameField(String data) {
        phptravelsPage.inputvisalastname(data);
    }

    @And("User input {string} visa on the email field")
    public void userInputVisaOnTheEmailField(String data) {
        phptravelsPage.inputvisaemail(data);
    }

    @And("User input {string} on the visa email confirmation field")
    public void userInputOnTheVisaEmailConfirmationField(String data) {
        phptravelsPage.inputvisaconfirmemail(data);
    }

    @And("User input {string} on visa contact number field")
    public void userInputOnVisaContactNumberField(String data) {
        phptravelsPage.inputvisacontactnumber(data);
    }

    @And("User click Booking button on visa page")
    public void userClickBookingButtonOnVisaPage() {
        phptravelsPage.clickBookingVISA();
    }

    @And("User click view invoice button")
    public void userClickViewInvoiceButton() {
        phptravelsPage.clickVIEWinvoice();
    }

    @Then("User see visa booking details page")
    public void userSeeVisaBookingDetailsPage() {
        boolean actual = phptravelsPage.checkVISAbookingdetails();
        Assert.assertTrue(actual);
    }
}
