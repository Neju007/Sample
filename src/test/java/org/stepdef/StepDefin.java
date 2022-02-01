package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefin {
	WebDriver driver;

	@Given("^user is on hotel login page$")
	public void user_is_on_hotel_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@When("^click login button$")
	public void click_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1) {
		WebElement loc = driver.findElement(By.id("location"));
		Select select = new Select(loc);
		select.selectByVisibleText(arg1);
	}

	@When("^click search button$")
	public void click_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() {
		driver.findElement(By.id("radiobutton_1")).click();
	}

	@When("^click continue button$")
	public void click_continue_button() {
		driver.findElement(By.id("continue")).click();
	}

	@When("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8) {
		driver.findElement(By.id("first_name")).sendKeys(arg1);
		driver.findElement(By.id("last_name")).sendKeys(arg2);
		driver.findElement(By.id("address")).sendKeys(arg3);
		driver.findElement(By.id("cc_num")).sendKeys(arg4);
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select sel = new Select(ccType);
		sel.selectByVisibleText(arg5);
		WebElement ccMnth = driver.findElement(By.id("cc_exp_month"));
		Select se = new Select(ccMnth);
		se.selectByVisibleText(arg6);
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select s = new Select(ccYear);
		s.selectByVisibleText(arg7);
		driver.findElement(By.id("cc_cvv")).sendKeys(arg8);
	}

	@When("^click book now button$")
	public void click_book_now_button() throws InterruptedException {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(7000);
	}

	@Then("^user is getting the order no$")
	public void user_is_getting_the_order_no() {
		WebElement order = driver.findElement(By.id("order_no"));
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	}

}
