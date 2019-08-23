package com.hrms.TestScripts;
import com.hrms.lib.*;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.utility.Log;
public class TC_103_DelEmp 
	{
	@Test
	//public static void main(String args[])throws Exception
	public void tc103()throws Exception
	{ 
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.waitst();
		obj.verifytitle();
		obj.login();
		obj.title();
		obj.text();
		obj.mouseover();
		obj.addemp();
		obj.addempframes();
		obj.searchemp();
		obj.dropdown();
		obj.searchfor();
		obj.delemp();
		obj.logout();
		obj.closebrowser();
				
		
	}

}
