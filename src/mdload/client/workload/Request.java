package mdload.client.workload;

import org.openqa.selenium.WebDriver;

public abstract class Request {

	private boolean injected = false;

	public Request() {
		super();
	}

	public abstract long action(WebDriver driver);

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	public boolean isInjected() {
		return injected;
	}

	public void setInjected(boolean injected) {
		this.injected = injected;
	}
}
