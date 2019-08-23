
package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.*;
import org.testng.annotations.Test;
import com.utility.Log;
public class TC_102_Add_NewEmp
	{
	@Test
	//public static void main(String args[])throws Exception
		public void tc102() throws Exception{
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
		obj.logout();
		obj.closebrowser();
	}
}
