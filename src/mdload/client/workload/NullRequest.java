package mdload.client.workload;

import org.openqa.selenium.*;

public class NullRequest extends Request //extends Vertex
{
	String name;
	
	public NullRequest(String myName)
	{
		super();
		name = myName;
	}

	@Override
	public long action( WebDriver driver ) {
		return (long) 0;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
