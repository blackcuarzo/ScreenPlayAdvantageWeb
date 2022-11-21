package co.com.bancolombia.certification.advantagedemo.stepdefinitions;

import co.com.bancolombia.certification.advantagedemo.tasks.CreateUsers;
import co.com.bancolombia.certification.advantagedemo.tasks.LoginUsers;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUsersSteps {
    @Given("^I want to go to the page of Advantage Demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));

    }

    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser() {
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers());
    }

    @Then("^I validate the correct user was created$")
    public void iValidateTheCorrectUserWasCreated() {
    }
}
