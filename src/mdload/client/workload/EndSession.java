package mdload.client.workload;

import org.openqa.selenium.WebDriver;

public class EndSession extends Request
{

	public EndSession()
	{
		super();
	}

	@Override
	public long action( WebDriver driver ) {
		driver.manage().deleteAllCookies();
		return 0;
	}
}
