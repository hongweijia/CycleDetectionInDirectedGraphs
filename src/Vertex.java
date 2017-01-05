/**
 * @author Prithviraj Deshmane
 */

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String data;
	private boolean visited; //Flag to track if vertex has been fully processed and no cycles have been found beyond this vertex
	private boolean beingExamined; //Flag to track if vertex is being examined in the DFS flow
	private List<Vertex> adjacencylist;
	
	public Vertex(String data) {
		this.data = data;
		this.adjacencylist = new ArrayList<Vertex>();
	}

	public void addAdjacentVertex(Vertex v) {
		this.adjacencylist.add(v);
	}
	
	@Override
	public String toString() {
		return this.data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingExamined() {
		return beingExamined;
	}

	public void setBeingExamined(boolean beingExamined) {
		this.beingExamined = beingExamined;
	}

	public List<Vertex> getAdjacencylist() {
		return adjacencylist;
	}

	public void setAdjacencylist(List<Vertex> adjacencylist) {
		this.adjacencylist = adjacencylist;
	}
	
}
