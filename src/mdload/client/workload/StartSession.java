package mdload.client.workload;

import org.openqa.selenium.WebDriver;

public class StartSession extends NullRequest
{
	public StartSession()
	{
		super("Start");
	}
	
	@Override
	public long action( WebDriver driver ) {
		long in = System.currentTimeMillis();
		return System.currentTimeMillis() - in;
	}
}
