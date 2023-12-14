package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;


public class siginPage extends base {
	public void user_validate_the_username_and_password(String user, String pass) {
 WebElement username = 	driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
 username.sendKeys(user);
 WebElement password = 	driver.findElement(By.xpath("//input[@id=\"password\"]"));
 password.sendKeys(pass);
	
	}
	
	public void click_the_login_button() {
 WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
 clickOnElement(loginbtn);
	}
	
	
	public void scusessfully_login() {

	}
	
}
