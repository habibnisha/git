package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Global {
	//variables
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String sr="0035";

	//objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String link_addemp="Add Employee";
	public String last_name="//input[@name=\"txtEmpLastName\"]";
	public String first_name="//input[@name=\"txtEmpFirstName\"]";
	public String save_btn="//input[@value='Save']";
	public String drp_down="//select[@id='loc_code']";
	public String tsearch_for="//input[@name='loc_name']";
	public String search_btn="//input[@value='Search']";
	public String checkbox="//input[@name='chkLocID[]']";
	public String del_btn="//input[@value='Delete']";
	public WebElement element;
	public Actions action;
	public Select drpdwn;


}


 