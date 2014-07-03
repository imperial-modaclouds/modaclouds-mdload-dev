package mdload.client.workload;

public class Edge
{
	public double weight;
	
	public Edge()
	{
		this.weight = 0.0;
	}
	
	public Edge( double weight )
	{
		this.weight = weight;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight( double weight )
	{
		this.weight = weight;
	}
	
	@Override
	public String toString()
	{
		return Double.toString( weight );
	}
}
