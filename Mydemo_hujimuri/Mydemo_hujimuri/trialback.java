package Mydemo_hujimuri.Mydemo_hujimuri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Mydemo_hujimuri.Mydemo_hujimuri.utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class trialback {
	WebDriver driver=null;
	@Given("search for the login button")
	public void search_for_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver=utility.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 // driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

	@Then("login with credentials")
	public void login_with_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hujimuri@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("hujimuriz");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Given("select the catogory")
	public void select_the_catogory() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/electronics']")).click();
	}

	@Then("Select the subcat")
	public void select_the_subcat() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img")).click();
	}

	@Then("choose what you want to add to the cart")
	public void choose_what_you_want_to_add_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-80\"]")).click();
	}

	

	@Given("click on view shopping cart")
	public void click_on_view_shopping_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
	}

	@Then("Continue shopping to add more item")
	public void continue_shopping_to_add_more_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
	}
}
