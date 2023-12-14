package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;


public class checkoutPage extends base{
	public void click_the_checkout_button() {
WebElement checkoutbtn = driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]"));
clickOnElement(checkoutbtn);
	}
	

	public void enter_the_firstname() {
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
		firstname.sendKeys("Hrithik");
	}
	public void enter_the_lastname() {
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
		lastname.sendKeys("Pal");
	}
	public void enter_the_zipcode() {
		WebElement zipcode = driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
		zipcode.sendKeys("282003");
	}

	public void click_the_continue_button() {
		WebElement continuebtn = driver.findElement(By.xpath("//input[@class=\"btn_primary cart_button\"]"));
		clickOnElement(continuebtn);
	}
	public void validate_the_finsh_button() {
		WebElement finishbtn = driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]"));
		validateText(finishbtn, "FINISH");
	}

	public void click_the_finish_button() {
		WebElement finishbtn = driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]"));
		clickOnElement(finishbtn);
	}

	public void validate_the_order_confirmation() {
		WebElement thankyouorder = driver.findElement(By.xpath("//h2[@class=\"complete-header\"]"));
		validateText(thankyouorder, "THANK YOU FOR YOUR ORDER");
	}
	public void validate_the_error_message() {
		WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		validateText(errormsg, "Error: ");
	}
}