package mdload.client.workload;

import java.util.Collection;

import mdload.client.workload.Edge;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;

public class CBMG {
//	static final Logger logCBMG = Logger.getLogger("mdload.workload.CBMG");

	private boolean isStationary;
	private Graph<Request, Edge> graph;

	public CBMG() {
		setGraph(new DirectedSparseGraph<Request, Edge>());
		setStationary(true);
	}

	public Graph<Request, Edge> getGraph() {
		return graph;
	}

	public void setGraph(Graph<Request, Edge> cbmg) {
		this.graph = cbmg;
	}

	public boolean addEdge(Edge arg0, Request arg1, Request arg2) {
		return getGraph().addEdge(arg0, arg1, arg2);
	}

	public Request getDest(Edge arg0) {
		return (Request) getGraph().getDest(arg0);
	}

	public Collection<Edge> getOutEdges(Request arg0) {
		return (Collection<Edge>) getGraph().getOutEdges(arg0);
	}

	/*
	public LinkedList<Request> getStationarySession(Random random, long interSessionTime, int maxSteps) {

	LinkedList<Request> session = new LinkedList<Request>();
	Selector<Request> selector = new Selector<Request>();

	session.add(new ThinkRequest(interSessionTime));

	session.add(data.start);
	Request next = data.start;
	Collection<Edge> outEdges = graph.getOutEdges(data.start);

	// continue down graph until terminal node
	while (!outEdges.isEmpty()) {
		PriorityQueue<Tuple<Double, Request>> nextOptions = new PriorityQueue<Tuple<Double, Request>>(5, new ProbabilityComparator());
		double totalweight = 0.0;

		// add neighboring requests to priority queue
		Iterator<Edge> it = outEdges.iterator();
		while (it.hasNext()) {
			Edge outgoingEdge = it.next();
			totalweight += outgoingEdge.getWeight();
			nextOptions.add(new Tuple<Double, Request>(outgoingEdge.getWeight(), graph.getDest(outgoingEdge)));
		}
		// unable to continue simulation if graph is incorrectly initialized
		if (totalweight < 0.999 || totalweight > 1.001) {
			String msg = "probability of outgoing edges does not add up to 1.0, ";
			logCBMG.fatal(msg + totalweight + " " + next.toString());
			System.exit(-1);
		}
		// select transition
		next = selector.select(random.nextDouble(), nextOptions);
		session.add(next);

		// check if maximum session length has been reached
		if (session.size() == maxSteps) {
			break;\
		}
		// get possible transitions from the new node
		outEdges = graph.getOutEdges(next);
	}

	logCBMG.info(System.currentTimeMillis() + "," + session.size() + "," + session);
	session.add(new EndSession());

	return session;
}
	 */

	public boolean isStationary() {
		return isStationary;
	}

	public void setStationary(boolean isStationary) {
		this.isStationary = isStationary;
	}
}
