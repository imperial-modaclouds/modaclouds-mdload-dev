package mdload.client.workload;

import org.openqa.selenium.*;

public class ThinkRequest extends Request //extends Vertex
{
	long thinkTime;
	
	public ThinkRequest(long tt)
	{
		super();
		thinkTime = tt;
	}

	@Override
	public long action( WebDriver driver ) {
		return (long) 0;
	}
	
	public long getThinkTime() {
		return thinkTime;
	}
	
	@Override
	public String toString()
	{
		return "" + thinkTime;
	}
}
