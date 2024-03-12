package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import po.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    @When("I enter {string} as username")
    public void iEnterAsUsername(String value) {
        loginPage.enterUsername(value);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I enter {string} as password")
    public void iEnterAsPassword(String value) {
        loginPage.enterPassword(value);
    }
}
