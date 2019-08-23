package com.hrms.TestScripts;
import com.hrms.lib.*;

public class TC_102 {
	public static void main(String args[])throws Exception {
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addemp();
		obj.logout();
		obj.closebrowser();
	}

}
