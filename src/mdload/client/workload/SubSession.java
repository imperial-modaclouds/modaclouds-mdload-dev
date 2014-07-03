package mdload.client.workload;



public abstract class SubSession {
	
	public SubSession(){
	}
	
	abstract public void setSequence(CBMG graph, Request entry, Request exit);
	
}
