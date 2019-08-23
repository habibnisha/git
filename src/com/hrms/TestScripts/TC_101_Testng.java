package com.hrms.TestScripts;
import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.utility.Log;
public class TC_101_Testng
{
	@Test
	public void tc101()throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.waitst();
		obj.verifytitle();
		obj.login();
		obj.title();
		obj.text();
		obj.logout();
		obj.closebrowser();

	}

}
