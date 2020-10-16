package demo.steps_definition;

import demo.pages.phptravels.PhptravelsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GuestStepDefinition {
    PhptravelsPage phptravelsPage = new PhptravelsPage();

    @Given("User is open phptravels page")
    public void userIsOpenPhptravelsPage() {
        phptravelsPage.openPage();
    }

    @When("User input {string} on destination fields")
    public void userInputOnDestinationFields(String location) {
        phptravelsPage.inputDestination(location);
    }

    @And("User input {string} as check in date")
    public void userInputAsCheckInDate(String date) {
        phptravelsPage.inputCheckIN(date);
    }

    @And("User input {string} as check out date")
    public void userInputAsCheckOutDate(String date) {
        phptravelsPage.inputCheckOUT(date);
    }

    @And("User click number of child")
    public void userClickNumberOfChild() {
        phptravelsPage.clickChildAmount();
    }

    @And("User click search button")
    public void userClickSearchButton() {
        phptravelsPage.clickSearchBTN();
    }

    @And("User see hotel search result")
    public void userSeeHotelSearchResult() {
        boolean actual = phptravelsPage.checkSearchResultDisplayed();
        Assert.assertTrue(actual);
    }

    @And("User click on the top list hotel")
    public void userClickOnTheTopListHotel() {
        phptravelsPage.clickTopListHotel();
    }

    @And("User see hotel details")
    public void userSeeHotelDetails() {
        boolean actual = phptravelsPage.checkHotelDetailsDisplayed();
        Assert.assertTrue(actual);
    }

    @And("User click on the top list rooms")
    public void userClickOnTheTopListRooms() {
        phptravelsPage.clickTopRoom();
    }

    @And("User click Book Now button")
    public void userClickBookNowButton() {
        phptravelsPage.clickBookBTN();
    }

    @And("User see Personal Details form")
    public void userSeePersonalDetailsForm() {
        boolean actual = phptravelsPage.checkPersonalDetailsFormDisplayed();
        Assert.assertTrue(actual);
    }

    @And("User input {string} on the firstname field")
    public void userInputOnTheFirstnameField(String data) {
        phptravelsPage.inputFirstName(data);
    }

    @And("User input {string} on the lastname field")
    public void userInputOnTheLastnameField(String data) {
        phptravelsPage.inputLastName(data);
    }

    @And("User input{string} on the email field")
    public void userInputOnTheEmailField(String data) {
        phptravelsPage.inputEmail(data);
    }

    @And("User input {string} on the email confirmation field")
    public void userInputOnTheEmailConfirmationField(String data) {
        phptravelsPage.inputEmailConfirmation(data);
    }

    @And("User input {string} on contact number field")
    public void userInputOnContactNumberField(String data) {
        phptravelsPage.inputContactNumber(data);
    }

    @And("User input {string} on Address field")
    public void userInputOnAddressField(String data) {
        phptravelsPage.inputAddress(data);
    }

    @And("User click on country list")
    public void userClickOnCountryList() {
        phptravelsPage.clickCountry();
    }

    @And("User click cofirm button")
    public void userClickCofirmButton() {
        phptravelsPage.clickBookingFinal();
    }

    @Then("User see booking details page")
    public void userSeeBookingDetailsPage() {
        boolean actual = phptravelsPage.checkBookingDetailsPage();
        Assert.assertTrue(actual);
    }

}
