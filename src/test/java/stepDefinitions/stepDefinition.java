package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepDefinition<WebDriver> {
	ChromeDriver driver;
	
	

    @Given("^Initialise browser with chrome$")
    public void initialise_browser_with_chrome() throws Throwable 
    
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
         driver.manage().window().maximize();
         

    	
    
    
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

    }

    @And("^click on start now button$")
    public void click_on_start_now_button() throws Throwable {
 	   driver.findElement(By.id("next-button")).click();
    }
    
    @When("^User into checker tool$")
    public void user_into_checker_tool() throws Throwable {
    	driver.findElement(By.id("label-wales")).isSelected();
        driver.findElement(By.id("next-button")).click();
    }
    @And("^enters circumstances into tool$")
   public void enters_circumstances_into_tool() throws Throwable {
	   
      
       driver.findElement(By.id("dob-day")).sendKeys("25");
       driver.findElement(By.id("dob-month")).sendKeys("05");
       driver.findElement(By.id("dob-year")).sendKeys("2008");
       driver.findElement(By.id("next-button")).click();

}
    @And("^enters circumstances into tool$")
    public void enters__into_tool() throws Throwable {
 	   
       
        driver.findElement(By.id("dob-day")).sendKeys("24");
        driver.findElement(By.id("dob-month")).sendKeys("06");
        driver.findElement(By.id("dob-year")).sendKeys("1994");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-yes")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("radio-no")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.className("block-label selection-button-radio selected")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
        
       
    }

    @Then("^User should get results$")
    public void user_should_get_results() throws Throwable {
      
    driver.findElement(By.className("heading-secondary"));
    }

    @Then("^User should get results$")
    public void user_should_get_results_on_cicumtances() throws Throwable {
      
    driver.findElement(By.className("heading-secondary"));
    }

}



