package steps;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        System.out.println("Navigating to login page");
        driver.get("https://www.amazon.com/ap/signin");
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        System.out.println("Entering valid credentials");
        WebElement emailField = driver.findElement(By.id("ap_email")); // Replace with the correct ID for the username field
        emailField.sendKeys("valid-email@example.com");

        WebElement continueButton = driver.findElement(By.id("continue")); // Replace with the correct ID for the continue button
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("ap_password")); // Replace with the correct ID for the password field
        passwordField.sendKeys("valid-password");

        WebElement signInButton = driver.findElement(By.id("signInSubmit")); // Replace with the correct ID for the sign-in button
        signInButton.click();
    }

    @When("I enter invalid credentials")
    public void enterInvalidCredentials() {
        System.out.println("Entering invalid credentials");
        // Add Selenium code to input invalid username and password
    }

    @Then("I should see the user dashboard")
    public void verifyUserDashboard() {
        System.out.println("Verifying user dashboard");
        // Add Selenium code to check the presence of the dashboard
    }

    @Then("I should see an error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        System.out.println("Verifying error message: " + errorMessage);
        // Add Selenium code to check the error message
    }
}
