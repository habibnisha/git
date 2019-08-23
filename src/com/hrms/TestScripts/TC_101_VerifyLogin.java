package com.hrms.TestScripts;
import com.hrms.lib.*;
public class TC_101_VerifyLogin 
	{
	public static void main(String args[]) throws Exception
	{
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
