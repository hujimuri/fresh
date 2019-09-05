package Mydemo_hujimuri.Mydemo_hujimuri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import SeleniumHuji.utility;


public class trial {
WebDriver driver=null;	
	@Given("Application is launche by the guest")
	public void application_is_launche_by_the_guest() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver=utility.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		System.out.println("hey rash");
	}

	@When("user clicks on the sighin button")
	public void user_clicks_on_the_sighin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

	}

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Preethi_hujimuri");
		  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Preethi");
		  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Prabhakar");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hujimuriz");
		  driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("hujimuriz");
		  driver.findElement(By.xpath("//input[@value='Female']")).click();
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("xyz@gmail.com");
		  driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9897477478");
		  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		  Select mon=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		  mon.selectByVisibleText("Jan");
		  Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		  year.selectByVisibleText("1997");
		  driver.findElement(By.linkText("10")).click();
		  //Select date=new Select(driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")));
		  //date.selectByVisibleText("10");
		  //driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("10/09/1994");
		  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Kundalahalli,aecs layout 560037");
		  //driver.findElement(By.xpath("//select[@id='securityQuestion']")).click();
		  Select que=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		  que.selectByVisibleText("What is your Nick Name?");
		  driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("blah");
		  
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("verifies for the accout creation")
	public void verifies_for_the_accout_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}	

}
