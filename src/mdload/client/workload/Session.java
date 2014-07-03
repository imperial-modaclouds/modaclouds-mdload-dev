package mdload.client.workload;

import java.util.LinkedList;

public abstract class Session {
	
	private long uid;
	
	public Session(long u){
		this.setUserID(u);
	}
	
	abstract public LinkedList<Request> getWarmup();
	abstract public LinkedList<Request> getNext();

	public long getUserID() {
		return uid;
	}

	public void setUserID(long uid) {
		this.uid = uid;
	}
	
}
