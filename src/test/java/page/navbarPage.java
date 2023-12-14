package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;

public class navbarPage extends base{
	public void click_the_all_item() {
WebElement allitem = driver.findElement(By.xpath("//a[@id=\"inventory_sidebar_link\"]"));
clickOnElement(allitem);
	}
	public void click_the_about() {
		WebElement about = driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]"));
		clickOnElement(about);
	}
	public void click_the_logout() {
		WebElement logout = driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]"));
		clickOnElement(logout);   
	}
	public void click_the_reset_app_state() {
		WebElement reset = driver.findElement(By.xpath("//a[@id=\"reset_sidebar_link\"]"));
		clickOnElement(reset);
	}
}