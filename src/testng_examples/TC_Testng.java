package testng_examples;
import org.testng.annotations.Test;
public class TC_Testng {
	@Test
	public void login()
	{
		System.out.println("Login completed");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout completed");
	}

}