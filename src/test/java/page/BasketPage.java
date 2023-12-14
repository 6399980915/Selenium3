package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;


public class BasketPage extends base{
	public void click_the_bagpack_picture() {
WebElement bagpack_headline = driver.findElement(By.xpath("(//div[@class=\"inventory_item_name\"])[1]"));
clickOnElement(bagpack_headline);
	}
	
	public void click_the_addtocart_button() {
WebElement addtocartbtn = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
clickOnElement(addtocartbtn);
	}


}