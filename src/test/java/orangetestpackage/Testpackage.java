package orangetestpackage;


import java.io.IOException;

import org.testng.annotations.Test;

import orangebasepackage.Baseclass;

public class Testpackage {
	
	public class LoginTest extends Baseclass{
		
		@Test(priority=1)
		public void logintest_mthd() throws IOException
		{
			lgnobj.login_mthd("Admin", "admin123");
			
			lgnobj.dashboard_mthd();
			
			lgnobj.search_mthd("admin");
			
			lgnobj.screenshot_mthd();
		}	
}
}

